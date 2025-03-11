import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        String name = "Begimai";
        System.out.println("Salam Germanijadan, " + name);
        int age = 30;

        System.out.println("ich bin " + age + " Jahre alt");

        boolean isTeacher = false;

        boolean isStudent = true;
        System.out.println(isTeacher + " bul tuura " +
                "emes");

        double euro = 2.99;

        System.out.println("alma " + euro + " baada turat");
        System.out.println(isStudent + " bul tuura");

        int groupA = 15;
        int groupB = 9;

        System.out.println("bizde kancha kischi okuuit? " + (groupA + groupB));

        System.out.println("Airymasy kancha? " + (groupA - groupB));

        boolean inSunny = true;
        boolean inWarm = false;

        System.out.println("Kun chykty jana jyluu? " + (inSunny && inWarm)); //and und
        System.out.println("Kun chykty je jyluu? " + (inSunny || inWarm)); //or oder
        System.out.println("Kun chykkan jok ee? " + (!inSunny)); //

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sen kanchadasyn? ");
        int age1 = scanner.nextInt();

        System.out.println("Anda sen" + age1 + "Jaschtasyn!");
        System.out.println("sen Begimaidan " + (age1 - age) + "jasch kitschüsün!");
        scanner.close();


    }


}
