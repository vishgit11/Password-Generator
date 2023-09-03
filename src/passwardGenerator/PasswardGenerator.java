package passwardGenerator;

import allCharacters.AllCharacters;
import characters.Characters;
import java.util.Scanner;

public class PasswardGenerator {
    static Scanner sc = new Scanner(System.in);
    static AllCharacters allCh = new Characters();
    public static void main(String[] args) {
        System.out.println("Enter number of alphabets you want in your passward");
        int numOfAlphas = sc.nextInt();

        System.out.println("Enter number of numbers you want in your passward");
        int numOfNumbers= sc.nextInt();

        System.out.println("Enter number of symbols you want in your passward");
        int numOfSymbols = sc.nextInt();

        allCh.randomAlpha(numOfAlphas);
        allCh.randomNumber(numOfNumbers);
        allCh.randomSymbol(numOfSymbols);

        String passward = allCh.getPassward();

        System.out.println(passward);
    }
}
