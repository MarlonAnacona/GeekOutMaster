package GeekOutMaster;


import javax.swing.*;
import java.util.Random;

/**
 * this class does the operation for the game and determines winner
 */
public class modelDados
{

    private Dados cartaJugador = new Dados();

    private int estado;
    private int caraElegida;
    private int vezSelecionada;
    private String[] estadoToString = new String[2];
    private String paloGanadorToString,jugadorGanador;
    private int[] caras = new int[7];
    Random aleatorio= new Random();

    public modelDados() {
    }

    //this method to get for user a random card with random value between 1-7 and the type of card
    public void calcularTiroJugador() {

        for (int i=0; i<7;i++){
            this.caras[i] = this.cartaJugador.getCara();
        }


    }

    //this method calculates the card with  the highest value
    public void determinarJuego() {

    }

    public void movimientos(int cara){

        if(vezSelecionada==1) {


            if (cara == 1) {
                //Meplee, throw the a one crap again

            }
            if (cara == 3) {
                //corazon,craps inactivo a activo
            }
            if(cara==4){
                //cohete, pasa un dado activo a inactivo
            }
            if(cara==5){
            //superhero,other face the crap
            }
        }else{
            if(vezSelecionada==0){
            vezSelecionada=1;
            }
        }
    }





    //this method set text with a winner game
    public String[] getEstadoToString() {
        switch(this.estado) {
            case 1:
                //win
                this.estadoToString[0] = "Has ganado!";

                break;
            case 2:
                //win
                this.estadoToString[0] = "Has perdido";

                break;
            case 3:
                //
                this.estadoToString[0] = "Sacaron igual numero, el  palo mayor fue el de: "+ paloGanadorToString+
                        "\n Por lo tanto el ganador es: "+ jugadorGanador;
                break;
        }

        return this.estadoToString;
    }

    public int[] getCaras() {
        return this.caras;
    }
}
