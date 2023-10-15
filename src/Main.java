public class Main {

    public static void Task1()
    {
        System.out.println("\nЗадача 1:");
        byte age = 20;
        boolean adult = age >= 18;
        if (adult) System.out.println("Если возраст человека равен "+ age +", то он совершеннолетний");
        else System.out.println("Если возраст человека равен "+ age +", то он не достиг совершеннолетия, нужно немного подождать");
        age = 15;
        adult = age >= 18;
        if (adult) System.out.println("Если возраст человека равен "+ age +", то он совершеннолетний");
        else System.out.println("Если возраст человека равен "+ age +", то он не достиг совершеннолетия, нужно немного подождать");
    }

    public static void Task2()
    {
        System.out.println("\nЗадача 2:");
        byte temperature = -3;
        boolean coldly = temperature < 5;
        if (coldly) System.out.println("Температура= " + temperature + ". На улице холодно, нужно надеть шапку!:-(");
        else System.out.println("Температура= " + temperature + ". Сегодня тепло, можно идти без шапки;-)");
        temperature = 10;
        coldly = temperature < 5;
        if (coldly) System.out.println("Температура= " + temperature + ". На улице холодно, нужно надеть шапку!:-(");
        else System.out.println("Температура= " + temperature + ". Сегодня тепло, можно идти без шапки;-)");
    }

    public static void Task3()
    {
        System.out.println("\nЗадача 3:");
        int speed = 80;
        boolean speedOK = speed <= 60;
        if (speedOK)System.out.println("Если скорость " + speed + ", то можно ездить спокойно ;-)");
        else System.out.println("Если скорость " + speed + ", то придется заплатить штраф! :-(");
        speed = 50;
        speedOK = speed <= 60;
        if (speedOK)System.out.println("Если скорость " + speed + ", то можно ездить спокойно ;-)");
        else System.out.println("Если скорость " + speed + ", то придется заплатить штраф! :-(");
    }

    public static void Task4()
    {
        System.out.println("\nЗадача 4:");
        byte age = 20;
        String answerStr = "";
        if (age >= 2 && age <= 6) answerStr = "в детский сад";
        else if (age >= 7 && age <= 17) answerStr = "в школу";
        else if (age >= 18 && age <= 24) answerStr = "в университет";
        else if (age > 24) answerStr = "на работу";
        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить " + answerStr);
    }

    public static void Task5()
    {
        System.out.println("\nЗадача 5:");
        byte age = 12;
        String answerStr = "";
        if (age < 5) answerStr = "не может кататься на аттракционе";
        else
            if (age < 14) answerStr = "может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя";
            else answerStr = "может кататься без сопровождения взрослого";
        System.out.println("Если возраст ребенка равен " + age + ", то он " + answerStr);
    }

    public static void Task6()
    {
        System.out.println("\nЗадача 6:");
        var passengers = 59;
        var passengersMax = 102;
        var maxSeats = 60;
        var freeSeats = maxSeats - passengers;
        var freeSpace = passengersMax - passengers;
        String answerStr = "";
        if (freeSeats > 0) answerStr = "Свободных сидячих мест: " + freeSeats;
        else
            if (freeSpace > 0) answerStr = "Остались только стоячие места: " + freeSpace;
            else answerStr = "Свободных мест больше нет!";
        System.out.println(answerStr);
    }

    public static void Task7()
    {
        System.out.println("\nЗадача 7:");
        int one = 17;
        int two = -8;
        int three = 25;
        int max = 0;
        if (one > two && one > three) max = one;
        else
            if (two > three) max = two;
            else max = three;
        System.out.println("Даны 3 числа: " + one + " " + two + " " + three);
        System.out.println("Самое большое из этих чисел = " + max);

    }

    public static void main(String[] args)
    {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
    }
}