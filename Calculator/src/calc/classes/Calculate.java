package calc.classes;

import java.util.Scanner;

public class Calculate {

    public static void Addition(){
        Scanner scanner = new Scanner(System.in);
        float[] numbers = Helper.getmultipleNumbers();
        float res = 0;
        for(int i=0; i < numbers.length; i++){
            res+= numbers[i];
        }

        Helper.displayResult(res);
    }
    public static void Subtraction(){
        float[] numbers = Helper.gettwoNumbers();
        float res = numbers[0] - numbers[1];

        Helper.displayResult(res);
    }
    public static void Multiplication(){
        float[] numbers = Helper.getmultipleNumbers();
        float res = numbers[0];
        for(int i=1; i < numbers.length; i++){
            System.out.println(numbers[i]);
            res = res * numbers[i];
        }
        Helper.displayResult(res);
    }
    public static void Division(){
        float[] numbers = Helper.gettwoNumbers();
        if(numbers[1] == 0) {
            System.out.println("Division durch '0' nicht möglich!");
        }else {
            float res = numbers[0] / numbers[1];
            Helper.displayResult(res);
        }
    }

}
