package GeekOutMaster;


import javax.swing.*;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Random;

/**
 * this class does the operation for the game and determines winner
 */
public class modelDados
{



    private int estado;
    private int caraElegida;
    private int vezSelecionada;
    private String[] estadoToString = new String[2];
    private String[] nombre=new String[10];
    private int[] caras = new int[10];
    Random aleatorio= new Random();
    private int caraOpuesta;
    private Dados cartaJugador = new Dados();
    public modelDados() {
    }

    //this method to get for user a random card with random value between 1-7 and the type of card
    public void calcularTiroJugador() {

        for (int i=0; i<10;i++){
            this.caras[i] = this.cartaJugador.getCara();
            switch (this.caras[i]){
                case 1:
                this.nombre[i]="Meeple";

                break;
                case 2:
                    this.nombre[i]="Dragon";
                    break;

                case 3:
                    this.nombre[i]="Corazon";
                    break;

                case 4:
                    this.nombre[i]="Cohete";
                        break;

                case 5:
                    this.nombre[i]="SuperHeroe";
                        break;
                case 6:
                    this.nombre[i]="42";
                        break;
            }

        }


    }

    //this method calculates the card with  the highest value
    public void determinarJuego() {

    }

    public void movimientos(String cara){

        switch (cara){
            case "Meeple":

        JOptionPane.showMessageDialog(null,cara);

                break;
            case "Dragon":
                JOptionPane.showMessageDialog(null,cara);

                break;

            case "Corazon":
                JOptionPane.showMessageDialog(null,cara);

                break;

            case "Cohete":
                JOptionPane.showMessageDialog(null,cara);

                break;

            case "SuperHeroe":
                JOptionPane.showMessageDialog(null,cara);

                break;
            case "42":
                JOptionPane.showMessageDialog(null,cara);

                break;
        }

    }





    //this method set text with a winner game
    /*public String[] getEstadoToString() {

        }


    }*/

    public int[] getCaras() {


        return this.caras;
    }

    public String[] getNombres(){

        return this.nombre;
    }
}
