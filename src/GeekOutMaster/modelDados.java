package GeekOutMaster;


import javax.sound.midi.SysexMessage;
import javax.swing.*;
import java.awt.event.ActionEvent;
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
    public static int contadorGloblar=0;
    public int dadoEscogido;
    public static JButton btn21;
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

    public void meeple(JButton btn,JButton btn2){

        for (int i = 0; i < GUI.listaBotonesActivos.size(); i++) {
            if (btn2 == GUI.listaBotonesActivos.get(i)) {

                setCara(i);

            }
        }

        modelDados tirar = new modelDados();
        caras = tirar.getCaras();
        nombre = tirar.getNombres();
        for (int i = 0; i < 10; i++) {
            GUI.dado[i].setText(nombre[i]);

            //Imagenes

            ImageIcon imgDados = new ImageIcon(getClass().getResource("/resources/" + nombre[i] + ".jpg"));
            GUI.dado[i].setIcon(imgDados);
        }


        movimientos(GUI.nombre1);

        GUI.listaBotonesUtilizados.add(btn);
        GUI.listaBotonesActivos.remove(btn);
        GUI.panelDadosUtilizados.removeAll();
        GUI.panelDadosActivos.removeAll();

        for (int i = 0; i < GUI.listaBotonesUtilizados.size(); i++) {
            GUI.panelDadosUtilizados.add(GUI.listaBotonesUtilizados.get(i));
        }
        for (int i = 0; i < GUI.listaBotonesActivos.size(); i++) {
            GUI.panelDadosActivos.add(GUI.listaBotonesActivos.get(i));
        }
        GUI.panelDadosUtilizados.repaint();

        GUI.panelDadosActivos.repaint();

        GUI.contadorveces = -1;
        actualizarpaneles();
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

    public void Corazon(JButton corazonApasar,JButton InactivoApasar){

        for (int i = 0; i < GUI.listaBotonesActivos.size(); i++) {
            if (InactivoApasar == GUI.listaBotonesActivos.get(i)) {

                setCara(i);

            }
        }

        modelDados tirar = new modelDados();
        caras = tirar.getCaras();
        nombre = tirar.getNombres();
        for (int i = 0; i < 10; i++) {
            GUI.dado[i].setText(nombre[i]);

            //Imagenes

            ImageIcon imgDados = new ImageIcon(getClass().getResource("/resources/" + nombre[i] + ".jpg"));
            GUI.dado[i].setIcon(imgDados);
        }


        GUI.listaBotonesUtilizados.add(corazonApasar);
        GUI.listaBotonesActivos.add(InactivoApasar);
        GUI.listaBotonesActivos.remove(corazonApasar);
        GUI.listaBotonesInactivos.remove(InactivoApasar);

        GUI.panelDadosInactivos.removeAll();
        GUI.panelDadosUtilizados.removeAll();
        GUI.panelDadosActivos.removeAll();

        for (int i = 0; i < GUI.listaBotonesUtilizados.size(); i++) {
            GUI.panelDadosUtilizados.add(GUI.listaBotonesUtilizados.get(i));
        }
        for (int i = 0; i < GUI.listaBotonesActivos.size(); i++) {
            GUI.panelDadosActivos.add(GUI.listaBotonesActivos.get(i));
        }
        for (int i = 0; i < GUI.listaBotonesInactivos.size(); i++) {
            GUI.panelDadosInactivos.add(GUI.listaBotonesInactivos.get(i));
        }
        GUI.panelDadosUtilizados.repaint();

        GUI.panelDadosActivos.repaint();
        GUI.panelDadosInactivos.repaint();
        GUI.contadorveces = -1;
        actualizarpaneles();
    }

    public void actualizarpaneles(){

        caras = getCaras();
        nombre = getNombres();
        for (int i = 0; i < 10; i++) {
            GUI.dado[i].setText(nombre[i]);

            //Imagenes

            ImageIcon imgDados = new ImageIcon(getClass().getResource("/resources/" + nombre[i] + ".jpg"));
            GUI.dado[i].setIcon(imgDados);
        }
        for (int i = 0; i < GUI.listaBotonesActivos.size(); i++) {

            GUI.listaBotonesActivos.get(i).setEnabled(true);
        }
        for (int i = 0; i < GUI.listaBotonesInactivos.size(); i++) {

            GUI.listaBotonesInactivos.get(i).setEnabled(false);
        }
        for (int i = 0; i < GUI.listaBotonesUtilizados.size(); i++) {

            GUI.listaBotonesUtilizados.get(i).setEnabled(false);
        }

    }

    public int setDadoEscogido(int dadoEscogido){
        this.dadoEscogido=dadoEscogido;
        return this.dadoEscogido;
    }


    public String setNombre(String nombre,int caraEscogida){
        return this.nombre[caraEscogida]="ss";
    }

    public int [] setCaraOpuesta(int caraescogida) {


        switch (this.caras[caraescogida]) {


            case 1:
                this.nombre[caraescogida]="cohete";

                break;
            case 2:
                this.nombre[caraescogida]="superh";
                break;

            case 3:
                this.nombre[caraescogida]="42";
                break;

            case 4:
                this.nombre[caraescogida]="mepple";
                break;

            case 5:
                this.nombre[caraescogida]="dragon";
                break;
            case 6:
                this.nombre[caraescogida]="corazon";
                break;

        }
        return this.caras;


}


    public void cohete(JButton btn,JButton btn2){

        for (int i = 0; i < GUI.listaBotonesActivos.size(); i++) {
            if (btn2 == GUI.listaBotonesActivos.get(i)) {

                setCara(i);

            }
        }

        movimientos(GUI.nombre1);

        GUI.listaBotonesUtilizados.add(btn);
        GUI.listaBotonesActivos.remove(btn);
        GUI.listaBotonesInactivos.add(btn2);
        GUI.listaBotonesActivos.remove(btn2);
        GUI.panelDadosInactivos.removeAll();
        GUI.panelDadosUtilizados.removeAll();
        GUI.panelDadosActivos.removeAll();

        for (int i = 0; i < GUI.listaBotonesUtilizados.size(); i++) {
            GUI.panelDadosUtilizados.add(GUI.listaBotonesUtilizados.get(i));
        }
        for (int i = 0; i < GUI.listaBotonesActivos.size(); i++) {
            GUI.panelDadosActivos.add(GUI.listaBotonesActivos.get(i));
        }
        for (int i = 0; i < GUI.listaBotonesInactivos.size(); i++) {
            GUI.panelDadosInactivos.add(GUI.listaBotonesInactivos.get(i));
        }
        GUI.panelDadosInactivos.repaint();
        GUI.panelDadosUtilizados.repaint();

        GUI.panelDadosActivos.repaint();

        GUI.contadorveces = -1;
        actualizarpaneles();

    }

    public void superheroe(JButton btn,JButton btn2){
        for (int i = 0; i < GUI.listaBotonesActivos.size(); i++) {
            if (btn2 == GUI.listaBotonesActivos.get(i)) {

                setCaraOpuesta(i);

            }
        }
        modelDados tirar = new modelDados();
        caras = tirar.getCaras();
        nombre = tirar.getNombres();
        for (int i = 0; i < 10; i++) {
            GUI.dado[i].setText(nombre[i]);

            //Imagenes

            ImageIcon imgDados = new ImageIcon(getClass().getResource("/resources/" + nombre[i] + ".jpg"));
            GUI.dado[i].setIcon(imgDados);
        }


        movimientos(GUI.nombre1);

        GUI.listaBotonesUtilizados.add(btn);
        GUI.listaBotonesActivos.remove(btn);
        GUI.panelDadosInactivos.removeAll();
        GUI.panelDadosUtilizados.removeAll();
        GUI.panelDadosActivos.removeAll();

        for (int i = 0; i < GUI.listaBotonesUtilizados.size(); i++) {
            GUI.panelDadosUtilizados.add(GUI.listaBotonesUtilizados.get(i));
        }
        for (int i = 0; i < GUI.listaBotonesActivos.size(); i++) {
            GUI.panelDadosActivos.add(GUI.listaBotonesActivos.get(i));
        }
        for (int i = 0; i < GUI.listaBotonesInactivos.size(); i++) {
            GUI.panelDadosInactivos.add(GUI.listaBotonesInactivos.get(i));
        }
        GUI.panelDadosInactivos.repaint();
        GUI.panelDadosUtilizados.repaint();

        GUI.panelDadosActivos.repaint();

        GUI.contadorveces = -1;
        actualizarpaneles();
    }

    public int getDadoEscogido(){
        return this.dadoEscogido;
    }

    public String[] getNombres(){

        return this.nombre;
    }
}
