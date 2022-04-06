// Libraries
import java.util.Scanner;
class Weather
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String userInput;
        double cUserInput;
        double fUserInput;
        
        System.out.println("Are you entering Celsius ('c') or Fahrenheit ('f')?");
        userInput = scan.nextLine();

        System.out.println(" ");

        switch (userInput)
        {
            case "c":
            System.out.println("Enter the Celsius value: ");
            cUserInput = scan.nextDouble();
            double cOutput = Celsius(cUserInput);

            System.out.println("The Celsius temperature is: " + cUserInput + "°");
            System.out.println("The Fahrenheit temperature is: " + cOutput + "°");
            break;

            case "f":
            System.out.println("Enter the Fahrenenheit value: ");
            fUserInput = scan.nextDouble();
            double fOutput = Fahrenheit(fUserInput);

            System.out.println("The Fahrenheit temperature is: " + fUserInput + "°");
            System.out.println("The Celsius temperature is: " + fOutput + "°");
            break;
            default: 
            System.out.println("That is not a valid selection. N00B.");
        }

        scan.close();
    }

    public static double Fahrenheit(double fTemp)
    {
        // Converting from Fahrenheit to Celsius
        double convertedTemp = (fTemp - 32) * 5/9;
        return convertedTemp;
    }

    public static double Celsius(double cTemp)
    {
        // Converting from Celsius to Fahrenheit
        double convertedTemp = (cTemp * 9/5) + 32;
        return convertedTemp;
    }
}