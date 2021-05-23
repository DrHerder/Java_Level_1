package Lesson_6_HW;

public class Main
{
    public static void main(String[] args)
    {
        Cat cat = new Cat(200, 0);
        Dog dog = new Dog(500, 10);

        System.out.println("Кот:");
        cat.run(150);
        cat.swim(5);

        System.out.println();
        System.out.println("Пес:");
        dog.run(400);
        dog.swim(5);


    }
}
