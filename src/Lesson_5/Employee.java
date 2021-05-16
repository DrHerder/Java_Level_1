package Lesson_5;

public class Employee
{
    String fullname;
    String position;
    String email;
    int phone;
    int salary;
    int age;

    Employee(String fullname, String position, String email, int phone, int salary, int age) // это конструктор
    {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void information() // method - в нем описана общая логика поведения
    {
        System.out.println(fullname + " / " + position + " / " + email + " / " + " тел: " + phone + " / " + salary + " руб." + " / " + age + " лет");
    }


}