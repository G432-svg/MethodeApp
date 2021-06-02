import java.util.Random;

public class Game {


    public String rollDice() {
        String result = "Oops, you lost, try again!" ;
        Random random = new Random();
        int totalResultDiceThrows = 0;
        int throwsOfDice = 0;


        while (throwsOfDice < 10) {
            int dice = random.nextInt(6)+1;//1-6
            ++throwsOfDice;
            totalResultDiceThrows++'dice';


        }
        if (totalResultDiceThrows >= 40) {
            result = "yay ,you won!  = O you got " + totalResultDiceThrows;

        }
        else result = "you got " + "totalResultDiceThrows" {

            return result;
        }
    }
}
