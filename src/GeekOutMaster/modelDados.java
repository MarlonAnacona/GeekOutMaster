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
    public static String[] nombre=new String[10];
    public static int[] caras = new int[10];
    public int dadoEscogido;
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
                this.nombre[i]="mepple";

                break;
                case 2:
                    this.nombre[i]="dragon";
                    break;

                case 3:
                    this.nombre[i]="corazon";
                    break;

                case 4:
                    this.nombre[i]="cohete";
                        break;

                case 5:
                    this.nombre[i]="superh";
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


                JOptionPane.showMessageDialog(null,cara+dadoEscogido);
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


    /*public String meeple(){

        this.cartaJugador.getCara();
       return
    }*/



    //this method set text with a winner game
    /*public String[] getEstadoToString() {

        }


    }*/

    public int[] getCaras() {


        return this.caras;
    }

    public int[] setCara(int caraescogida){


       this.caras[caraescogida] = this.cartaJugador.getCara();


        switch (this.caras[caraescogida]){
            case 1:
                this.nombre[caraescogida]="mepple";

                break;
            case 2:
                this.nombre[caraescogida]="dragon";
                break;

            case 3:
                this.nombre[caraescogida]="corazon";
                break;

            case 4:
                this.nombre[caraescogida]="cohete";
                break;

            case 5:
                this.nombre[caraescogida]="superh";
                break;
            case 6:
                this.nombre[caraescogida]="42";
                break;
        }

        return this.caras;
    }

    public int setDadoEscogido(int dadoEscogido){
        this.dadoEscogido=dadoEscogido;
        return this.dadoEscogido;
    }
    public String setNombre(String nombre,int caraEscogida){



        return this.nombre[caraEscogida]="ss";
    }

    public int getDadoEscogido(){
        return this.dadoEscogido;
    }

    public String[] getNombres(){

        return this.nombre;
    }
}
