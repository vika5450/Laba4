import java.util.Date;

/**
 * @author Виктория и Ксения Вяткины
 */
public class Human {
    int id;
    String name;
    String gender;
    Division division;
    int salary;
    String birth;

    /**
     * Присваивание значений человеку
     * @param id номер человека
     * @param name имя
     * @param gender пол
     * @param division подразделение
     * @param salary зарплата
     * @param birth дата рождения
     */
    public Human(int id, String name, String gender, Division division, int salary, String birth)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.division = division;
        this.salary = salary;
        this.birth = birth;
    }

    /**
     * Метод toString
     * @return возвращает строку
     */
    public String toString() {
        return  "id='" + id + '\'' +
                ", name ='" + name + '\'' +
                ", gender ='" + gender + '\'' +
                ", BirtDate ='" + birth + '\'' +
                ", Salary ='" + salary + '\'' +
                ", division = " + division.toStringDivision() ;
    }

}

