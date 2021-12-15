import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Reader {
    /**
     *
     * @param path файл csv
     * @return список людей
     * @throws FileNotFoundException файл не найден
     */
    public ArrayList <Human> reader(String path) throws FileNotFoundException
    {
        String line = "";
        ArrayList<Human> structHuman = new ArrayList<>();
        Set<Division> structDivision = new HashSet<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                Division division = null;
                for (Division division1 : structDivision) {
                    if (division1.GET_DIVISION().equals(values[4])) {
                        division = division1;
                    }
                }
                if (division == null) {
                    division = new Division(values[4]);
                    structDivision.add(division);
                }

                Human human = new Human(Integer.parseInt(values[0]), (values[1]), (values[2]), division, Integer.parseInt(values[5]), (values[3]));
                structHuman.add(human);
            }
            for (Human human : structHuman) {
                System.out.println(human.toString());
            }
        } catch (FileNotFoundException e)
        {
            System.out.println("Файл не найден");
           // e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return structHuman;
    }
}
