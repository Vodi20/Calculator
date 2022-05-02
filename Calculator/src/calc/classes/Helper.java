package calc.classes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Helper {

    public static void printMenu(){
        System.out.println("");
        System.out.println("Welche Rechenoperation soll verwendet werden?");
        System.out.println(" 1. Addition");
        System.out.println(" 2. Subtraktion");
        System.out.println(" 3. Multiplikation");
        System.out.println(" 4. Division");
        System.out.println(" 5. Programm beenden");

    }
    public static float[] getmultipleNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mit wie vielen Zahlen wollen Sie rechnen? ");
        int count = scanner.nextInt();
        float[] numbers = new float[count];
        for (int i = 1; i < count+1; i++) {
            System.out.println("Geben Sie die "+ i +". Zahl ein: ");
            float num = scanner.nextFloat();
            numbers[i-1]= num;
        }
        return numbers;
    }
    public static float[] gettwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        float[] numbers = new float[2];
        try {
            System.out.print("Geben Sie die erste Zahl ein: ");
            numbers[0] = scanner.nextFloat();
            System.out.print("Geben Sie die zweite Zahl ein: ");
            numbers[1] = scanner.nextFloat();
        }
        catch(Exception e){
            System.out.println("Geben Sie richtige Zahlen ein!");
            return gettwoNumbers();
        }
        return numbers;
    }
    public static void displayResult(float res){
        String df = new DecimalFormat("0.#####").format(res);

        System.out.printf("Das Ergebnis lautet: "+ df);
    }

}
