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

            switch(selection){
                case 1:
                    Calculate.Addition();
                    break;
                case 2:
                    Calculate.Subtraction();
                    break;
                case 3:
                    Calculate.Multiplication();
                    break;
                case 4:
                    Calculate.Division();
                    break;
                case 5:
                    selection = 0;
                    break;
            }
        }
    }
}
