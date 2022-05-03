package calc.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Calculate {
    public static final String PLUS = "+";                                          //const variablen immer in caps lock
    public static final String MINUS = "-";
    public static final String MULTIPLY = "*";
    public static final String DIVIDE = "/";

    public static final Map<String, BiFunction<Float, Float, Float>> OPERATIONS =   //mapt von den Rechenoperationen direkt zu den Berechnungen
            new HashMap<>() {{
                put(Calculate.PLUS, (x,y) -> x+y);
                put(Calculate.MINUS, (x,y) -> x-y);
                put(Calculate.MULTIPLY, (x,y) -> x*y);
                put(Calculate.DIVIDE, (x,y) -> x/y);
            }};

    public static void doByOperator(String operator) {                              //Berechnungen abhängig von der eingabe(Übergabewert operator), bzw Berechnen aus file
        Scanner scanner = new Scanner(System.in);
        String str = "";
        if(operator == ""){
            try {
                str = Helper.txtToString("/File.txt");                          //writes data from txt to String
            }
            catch(Exception IOException){
                System.out.println("File not found!");
            }
            String[] strarr = Helper.buildCalcFromString(str);                      //writes data from string
            float[] floatarr = Helper.stringArrToFloatArr(strarr);                  //converts string array to float array
            float res = floatarr[0];
            for(int i=1; i < floatarr.length; i++){
                res = OPERATIONS.get(strarr[0]).apply(res, floatarr[i]);
            }
            Helper.formatResult(res);                                               //format result to reasonable result
        }else{
            float[] numbers = Helper.getmultipleNumbers();
            float res = numbers[0];
            for(int i=1; i < numbers.length; i++){
                res = OPERATIONS.get(operator).apply(res, numbers[i]);
            }
            Helper.formatResult(res);
        }

    }

}
