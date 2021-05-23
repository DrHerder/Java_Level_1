package Lesson_6_HW;

    public class Animal
    {

        public int maxRunDistance;
        public int maxSwimDistance;

        public Animal(int maxRunDistance, int maxSwimDistance)
        {
            this.maxRunDistance = maxRunDistance;
            this.maxSwimDistance = maxSwimDistance;
        }

        public void run (int runDistance)
        {
            if (runDistance > maxRunDistance)
            {
                System.out.println("Не может пробежать " + runDistance + " метров");
                System.out.println("Максимум возможностей: " + maxRunDistance + " метров");
            }
            else
            {
                System.out.println("Пробежал " + runDistance + " метров");
            }

        }

        public void swim (int swimDistance)
        {
            if (swimDistance > maxSwimDistance)
            {
                System.out.println("Не может проплыть " + swimDistance + " метров");
                System.out.println("Максимум возможностей: " + maxSwimDistance + " метров");
            }
            else
            {
                System.out.println("Проплыл " + swimDistance + " метров.");
            }
        }

    }
