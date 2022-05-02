package calc.classes;

import java.text.MessageFormat;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
    int selection = 1;
    Scanner scanner = new Scanner(System.in);

        while(selection != 0){

            Scanner sc = new Scanner(System.in);
            Helper.printMenu();
            System.out.println("Ihre Auswahl: ");
            selection = sc.nextInt();
            float[] numbers = Helper.fillVariables();
            switch(selection){
                case 1:
                    Calculate.Addition(numbers);
                    break;
                case 2:
                    Calculate.Subtraction(numbers);
                    break;
                case 3:
                    Calculate.Multiplication(numbers);
                    break;
                case 4:
                    Calculate.Division(numbers);
                    break;
                case 0:
                    break;
            }
        }
    }
}
