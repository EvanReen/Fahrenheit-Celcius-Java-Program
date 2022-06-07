import java.util.Scanner;

public class Temperature {

    public static void main(String[] Strings) {
        
        //input Scanner
        Scanner sc = new Scanner(System.in);
 
        // Ask the user to enter a degree in Fahrenheit
        System.out.print("Input a degree in Fahrenheit: ");
        double Fahrenheit = sc.nextDouble();
 
        // Celsius method 
        double celsius = 5.0/9.0 * (Fahrenheit - 32);;
 
 
        //converts Fahrenheit to Celsius
        System.out.println(Fahrenheit + " degree Fahrenheit calculates to " +
        celsius + " in Celsius");
 
 
        //Asks the user to enter a degree in Celsius
        System.out.print("Enter a degree in Celcius: ");
        double Celsius= sc.nextDouble();
 
 
        // fahrenheit method
        double fahrenheit = 9.0/5.0 * Celsius + 32;
 
 
        // Converts Celsius to Fahrenheit
        System.out.println(Celsius + " degree Celcius calculates to " + fahrenheit
        + " in Fahrenheit");
 
 
        //close Scanner
        sc.close();
    
    } // end main

} // end class
