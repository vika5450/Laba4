/**
 * @author Виктория и Ксения
 */
public class Division {
    private static int ID_DIVISION = 1;
    private int ID;
    private String division_name;

    /**
     * Генерируется номер подразделения и записывается всё в Division
     * @param division_name на вход поступает название подразделения
     */
    public Division(String division_name)
    {
        this.ID = ID_DIVISION;
        ID_DIVISION++;
        this.division_name = division_name;
    }

    /**
     * Функция для номера подразделения
     * @return возвращает номер подразделения
     */
    public String GET_DIVISION()
    {
        return division_name;
    }

    /**
     * Метод toString
     * @return возращает номер и название подразделения
     */
    public String toStringDivision() {
        return
                "ID = " + ID + ", название подразделения: " + division_name+ '\n' ;}

}
