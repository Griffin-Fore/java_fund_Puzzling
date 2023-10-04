import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
    	        //..
		// Write your other test cases here.
		//..
        System.out.println(generator.getRandomLetter());

        System.out.println("Generating password");
        System.out.println(generator.generatePassword());

        System.out.println("Creating a set of new passwords");
        System.out.println(generator.getNewPasswordSet(5));

        System.out.println("Creating a set of new passwords");
        System.out.println(generator.getNewPasswordSet(7));
        
        System.out.println("Creating a set of new passwords version 2");
        String[] passwordSetV2 = generator.getNewPasswordSetV2(7);
        for(int i = 0; i < passwordSetV2.length; i++ ){
            System.out.print(passwordSetV2[i] + "\t") ;
        }

	}
}