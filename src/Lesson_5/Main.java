package Lesson_5;

public class Main
{
    public static void main(String[] args)
    {

        /*Employee firstEmployee = new Employee("Иванов И.И.", "Начальник отдела", "IvanovII@company.com", 5551650, 150000, 46);
        Employee secondEmployee = new Employee("Петров П.П.", "Зам.начальника", "PetrovPP@company.com", 5551651, 100000, 43);
        Employee thirdEmployee = new Employee("Сидорова И.И.", "Главный специалист", "SidorovaII@company.com", 5551652, 70000, 40);
        Employee fourthEmployee = new Employee("Сергеев С.С.", "Ведущий специалист", "SergeevSS@company.com", 5551653, 60000, 37);
        Employee fifthEmployee = new Employee("Матвеева М.М.", "Ведущий специалист", "MatveevaMM@company.com", 5551654, 60000, 34);

        firstEmployee.information();
        secondEmployee.information();
        thirdEmployee.information();
        fourthEmployee.information();
        fifthEmployee.information();*/


        Employee[] employees =
                {
                        new Employee("Иванов И.И.", "Начальник отдела", "IvanovII@company.com", 5551650, 150000, 46),
                        new Employee("Петров П.П.", "Зам.начальника", "PetrovPP@company.com", 5551651, 100000, 43),
                        new Employee("Сидорова И.И.", "Главный специалист", "SidorovaII@company.com", 5551652, 70000, 40),
                        new Employee("Сергеев С.С.", "Ведущий специалист", "SergeevSS@company.com", 5551653, 60000, 37),
                        new Employee("Матвеева М.М.", "Ведущий специалист", "MatveevaMM@company.com", 5551654, 60000, 34)
                };
        int minAge = 40;
        for (Employee employee:employees)
        {
            if (employee.age > minAge)
            {
                employee.information();
                System.out.println();
            }
        }
    }
}