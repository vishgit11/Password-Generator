package characters;

import allCharacters.AllCharacters;
import randomCharacters.RandomChars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Characters extends RandomChars implements AllCharacters{
    Random random = new Random();
    ArrayList<Character> passwardList = new ArrayList<>();
    String passward = "";

    @Override
    public void randomAlpha(int numOfAlpha) {
        for (int i = 0; i < numOfAlpha; i++) {
            int randomIndex = random.nextInt(alphabets.length);
            passwardList.add(alphabets[randomIndex]);
        }
    }

    @Override
    public void randomNumber(int numOfNumbers) {
        for (int i = 0; i < numOfNumbers; i++) {
            int randomIndex = random.nextInt(numbers.length);
            passwardList.add(numbers[randomIndex]);
        }
    }

    @Override
    public void randomSymbol(int numOfSymbols) {
        for (int i = 0; i <numOfSymbols ; i++) {
            int randomIndex = random.nextInt(symbol.length);
            passwardList.add(symbol[randomIndex]);
        }
    }
    @Override
    public String getPassward(){
        Collections.shuffle(passwardList);

        for (Character e: passwardList) {
            passward += e;
        }
        return passward;
    }
}
