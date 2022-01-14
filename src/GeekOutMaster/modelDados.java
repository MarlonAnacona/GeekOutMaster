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
        if (this.caras[0]>this.caras[1]) {
            //win player
            this.estado = 1;
        }else {

            if (this.caras[0] < this.caras[1]) {
                //win machine
                this.estado = 2;

            } else {
                if(this.caras[0] == this.caras[1]) {
                    //equality
                    this.estado=3;
                    if(this.paloJugador>this.paloMaquina){
                        paloGanador=paloJugador;
                        if(paloGanador==4){
                            paloGanadorToString="Oro";
                        }
                        if(paloGanador==3){
                            paloGanadorToString="Copas";
                        }
                        if(paloGanador==2){
                            paloGanadorToString="Espadas";
                        }
                        if(paloGanador==1){
                            paloGanadorToString="Bastos";
                        }
                        jugadorGanador="El usuario";
                    }else{
                        if(this.paloJugador<this.paloMaquina){
                            paloGanador=paloMaquina;
                            if(paloGanador==4){
                                paloGanadorToString="Oro";
                            }
                            if(paloGanador==3){
                                paloGanadorToString="Copas";
                            }
                            if(paloGanador==2){
                                paloGanadorToString="Espadas";
                            }
                            if(paloGanador==1){
                                paloGanadorToString="Bastos";
                            }
                            jugadorGanador="La maquina";
                        }
                    }

                }

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
