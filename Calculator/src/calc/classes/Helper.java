package calc.classes;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Helper {

    private static String[] contentoftxt;

    private static void printMenu(){                                            //prints the menu
        System.out.println("");
        System.out.println("Welche Rechenoperation soll verwendet werden?");
        System.out.println(" 1. Addition");
        System.out.println(" 2. Subtraktion");
        System.out.println(" 3. Multiplikation");
        System.out.println(" 4. Division");
        System.out.println(" 5. Mit File Rechnen");
        System.out.println(" 6. Programm beenden");
    }

    public static void menu(){                                                  //starts the menu logic
        int selection = 1;
        Scanner scanner = new Scanner(System.in);

        while(selection != 0){

            Scanner sc = new Scanner(System.in);
            printMenu();
            System.out.println("Ihre Auswahl: ");
            selection = sc.nextInt();

            switch(selection){
                case 1:
                    Calculate.doByOperator("+");
                    break;
                case 2:
                    Calculate.doByOperator("-");
                    break;
                case 3:
                    Calculate.doByOperator("*");
                    break;
                case 4:
                    Calculate.doByOperator("/");
                    break;
                case 5:
                    Calculate.doByOperator("");
                    break;
                case 6:
                    selection = 0;
                    break;
            }
        }
    }


    public static float[] getmultipleNumbers(){                                 //read x numbers from input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mit wie vielen Zahlen wollen Sie rechnen? ");
        int count = scanner.nextInt();
        float[] numbers = new float[count];
        try {
            for (int i = 1; i < count + 1; i++) {
                System.out.println("Geben Sie die " + i + ". Zahl ein: ");
                float num = scanner.nextFloat();
                numbers[i - 1] = num;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return numbers;
    }

    public static void formatResult(float res){                                 //Ergebnis formatieren und anzeigen (eigentlich eigene Funktion zum anzeigen, aber zu kleiner program umfang)
        String df = new DecimalFormat("0.#####").format(res);
        System.out.printf("Das Ergebnis lautet: "+ df);
    }

    public static String txtToString(String url) throws IOException {           // Konvertiert txtFile into string

        Path path = Paths.get(url);

        try (final BufferedReader br = Files.newBufferedReader(path)){
            final String file = br.lines().collect(Collectors.joining());
            return file;
        }
        catch(Exception e) {
            return "Fehler beim einlesen!";
        }
    }

    public static String[] buildCalcFromString(String str){                     // Richtet ein array so her, dass auf der ersten stelle der operator ist,
                                                                                // auf der zweiten die anzahl an zahlen, und ab der dritten die zu berechnenden Zahlen
        String url = "C:\\Users\\Vodenik\\Desktop\\WMS Cardiff\\Calculator\\src\\calc\\classes\\File.txt";
        String data = "";
        try {
            data = txtToString(url);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        String[] datasplit = data.split(";");

                                                                //datasplit[0] = operator
                                                                //datasplit[1] = count an zahlen
                                                                //datasplit[2] = zahlen selbst, getrennt durch ","

        int len = 2 + Integer.parseInt(datasplit[1]);
        String[] calcVariables = new String[len];
        String[] numbers = new String[Integer.parseInt(datasplit[1])];

        for(int i = 0; i < datasplit.length; i++){
            if (datasplit[i].contains(",")){
                numbers = datasplit[i].split(",");
            }else{
                calcVariables[i] = (datasplit[i]);
            }
        }
        try {
            for (int j = 2; j < numbers.length + 2; j++) {
                calcVariables[j] = numbers[j - 2];
            }
        }
        catch(Exception e){
            System.out.println("Stimmt die Anzahl und die Menge an Zahlen im txt File überein?");
        }
        return calcVariables;
    }

    public static float[] stringArrToFloatArr(String[] strarr){                     //konvertiert ein string array zu einem float array
        float[] floatarr = new float[strarr.length-2];
        for (int i = 2; i < strarr.length ; i++){
            try {
                floatarr[i-2] = Float.parseFloat(strarr[i]);
            }catch(Exception e){
            }
        }
        return floatarr;
    }
}
