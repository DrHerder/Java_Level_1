package Lesson_6_HW;

public class Cat extends Animal
{
    public Cat (int maxRunDistance, int maxSwimDistance)
    {
        super(maxRunDistance, maxSwimDistance);
    }

    @Override
    public void swim(int swimDistance)
    {
        System.out.println("Кот не умеет плавать");
    }
}
