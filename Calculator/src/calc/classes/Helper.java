package calc.classes;

import java.util.Scanner;

public class Helper {
    public static float[] fillVariables(){

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
            fillVariables();
        }
        return numbers;
    }

    public void validateDivision(){

    }
    public static String getSign() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Operator ein, moeglich: '+','-','*','/' : ");
        String sign = scanner.next(); //variable einlesen / next für string
        if (sign.equals("+") || sign.equals("-")||sign.equals("*")||sign.equals("/")){
            return sign;
        }
        else{
            System.out.println("Falscher Operator wurde eingegeben");
            return "";
        }

    }
    public static void printMenu(){
        System.out.println("");
        System.out.println("Welche Rechenoperation soll verwendet werden?");
        System.out.println(" 1. Addition");
        System.out.println(" 2. Subtraktion");
        System.out.println(" 3. Multiplikation");
        System.out.println(" 4. Division");
        System.out.println(" 5. Programm beenden");

    }


}
