package EstruturaSequencial_Exercicio_9;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
        System.out.println("Qual o valor da temperatura em Fahrenheit que você deseja converter para celsius?");
        String inputToString = userInput.nextLine();
        inputToString = inputToString.replaceAll("[^[+-]?([0-9]*[.,])?[0-9]+]", "");
		//caso o número for digitado com virgula e não ponto. Troque-os para armazenar na variável double.
		if(inputToString.contains(",")) inputToString = inputToString.replace(",", ".");
        double conversionFahrenheitToCelsius = 5*((Double.parseDouble(inputToString)-32)/9); 
        inputToString = String.valueOf(conversionFahrenheitToCelsius);
        //Dê o output com virgula e não ponto. 
		String dotForComma = inputToString.replace(".", ",");
        System.out.println(dotForComma + "°C");
        userInput.close();
    }
}
