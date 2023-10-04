import java.util.Random;
import java.util.ArrayList;
public class PuzzleJava {
    Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> tenRandomNumbers = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++){
            int randNum = randMachine.nextInt(20) + 1;
            tenRandomNumbers.add(randNum);
        }
        return tenRandomNumbers;
    }
    public String getRandomLetter(){
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k",
        "l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int randNum = randMachine.nextInt(26);
        String randomLetter = alphabet[randNum];
        return randomLetter;
    }

    public String generatePassword(){
        String password = new String();
        for(int i = 0; i < 8; i++){
            String randomLetter = getRandomLetter();
            password += randomLetter;
        }
        return password;
    }
    public ArrayList<String> getNewPasswordSet(int numberOfPasswords){
        ArrayList<String> passwordList = new ArrayList<String>();
        for(int i = 0; i < numberOfPasswords; i++){
            passwordList.add(generatePassword());
        }
        return passwordList;
    }

    public String[] getNewPasswordSetV2(int numberOfPasswords){
        String[] passwordList = new String[numberOfPasswords];
        for(int i = 0; i < numberOfPasswords; i++){
            passwordList[i] = generatePassword();
        }
        return passwordList;
    }
}
