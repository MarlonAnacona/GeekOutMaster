package GeekOutMaster;
import java.util.Random;

public class Dados {
    /**
     * This class to get a random value between 1-12 for the game cards

     */
    private int cara;

    public Dados() {
    }

    public int getCara() {
        Random aleatorio = new Random();
        this.cara = aleatorio.nextInt(6) + 1;

        return this.cara;
    }
}