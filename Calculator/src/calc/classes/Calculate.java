package calc.classes;

public class Calculate {

    public static String Addition(float[] numbers){
        float res = numbers[0] + numbers[1];
        return "Das Ergebnis lautet: " +  res;
    }
    public static String Subtraction(float[] numbers){
        float res = numbers[0] - numbers[1];
        return "Das Ergebnis lautet: " +  res;
    }
    public static String Multiplication(float[] numbers){
        float res = numbers[0] * numbers[1];
        return "Das Ergebnis lautet: " +  res;
    }
    public static String Division(float[] numbers){
        if(numbers[1] == 0) {
            System.out.println("Division durch '0' nicht möglich!");
            return "Division durch '0' nicht möglich!";
        }else {
            float res = numbers[0] / numbers[1];
            return ("Das Ergebnis lautet: " +  res);
        }
    }

}
