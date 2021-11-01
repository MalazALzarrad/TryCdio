import dasuki.Dice;
import dasuki.Game;
import dasuki.Konto;
import dasuki.Spiller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest1 {
    Konto B = new Konto();
    Konto B1 = new Konto();
    Game game = new Game();
    Spiller DD = new Spiller("malaz");
    Spiller DD1 = new Spiller("Ahmad");
    Dice dice = new Dice();

    @Test
    void playOneRound() {
        for (int i = 0; i < 100; i++) {
            game.playOneRound(DD, B1);
            Assertions.assertTrue(B1.getBalance() >= 0);
            Assertions.assertFalse(B1.getBalance() < 0);

            System.out.println(B1.getBalance());

        }
    }

}



/* @Test
   void playOneRound() {
        for (int i = 0; i < 1000; i++) {
            int K = B.getBalance();
            Assertions.assertTrue(K >= 0 && K < 3000);
            //   Assertions.assertFalse(m0 < 0);
            //Assertions.assertTrue(K < 0);
        }
    }
*//*


}*/
