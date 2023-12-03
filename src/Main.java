// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Число " + i);
        }

        System.out.println("Задача 2");
        for (int a = 10; a >= 0; a--) {
            System.out.println("Число " + a);
        }

        System.out.println("Задача 3");
        for (int f = 0; f < 17; f= f+2) {
            System.out.println("Число " + f);
        }

        System.out.println("Задача 4");
        for (int y = 10; y >= -10; y--) {
            System.out.println(y);
        }

        System.out.println("Задача 5");
        for (int r = 1904; r <= 2096; r = r + 4) {
            System.out.println(r + " является високосным");
        }

        System.out.println("Задача 6");
        for (int v = 7; v <= 98; v= v + 7) {
            System.out.println(v);
        }

        System.out.println("Задача 7");
        for (int d = 1; d <= 512; d= d*2) {
            System.out.println(d);
        }

        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int s = 0; s < 12; s++) {
            total = total + salary;
            System.out.println(total);
        }

        System.out.println("Задача 9");
        int salaryS = 29000;
        int totalS = 0;
        for (int s = 0; s < 12; s++) {
            totalS = totalS + totalS / 100;
            totalS = totalS + salaryS;
            System.out.println("Месяц " + s + " сумма накоплений равна " + totalS + " рублей");
        }

        System.out.println("Задача 10");
        int x = 2;
        int u = 1;
        for (int i = 1; i <= 10; i++) {
            u = u * 2;
            System.out.println("2 * " + i + " = " + 2 * i);




        }




    }
}