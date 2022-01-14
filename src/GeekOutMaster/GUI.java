package GeekOutMaster;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    public GUI(){
        this.setUndecorated(false);
        this.setTitle("GEEK OUT MASTER");
        this.pack();
        this.setResizable(true);
        //this.setSize(600, 540);
        this.setVisible(true);

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private  void intGUI(){
        //create listener object or control object
        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints=new GridBagConstraints();

    }

    public static void main(String[] args) {
        // Ejecución del programa

        EventQueue.invokeLater(()-> {


            GUI presentacion = new GUI();


        });

    }
    private class Escucha implements ActionListener {
        /*
        These buttons start the game, giving a card with a random value between 1-12, both for the player and for the machine
         */
        @Override
        public void actionPerformed(ActionEvent e) {
          /*  if(e.getSource()==sacar){
                modelCarta.calcularTiroJugador();
                int[] caras= modelCarta.getCaras();
                int palo= modelCarta.getPaloJugador();

                imageCard= new ImageIcon(getClass().getResource("/resources/"+caras[0]+"-"+palo+".jpg"));
                cartaJugador.setIcon(imageCard);
                sacar.setEnabled(false);
                Oponente.setEnabled(true);
            }else{
                if(e.getSource()==Oponente)
                {
                    modelCarta.calcularTiroMaquina();
                    int[] caras= modelCarta.getCaras();
                    int palomaquina= modelCarta.getPaloMaquina();

                    imageCard= new ImageIcon(getClass().getResource("/resources/"+caras[1]+"-"+palomaquina+".jpg"));
                    cartaMaquina.setIcon(imageCard);
                    modelCarta.determinarJuego();
                    mensajeSalida.setRows(4);
                    Oponente.setEnabled(false);
                    sacar.setEnabled(true);

                    ganador.setText(modelCarta.getEstadoToString()[0]);
                }else{



                    if(e.getSource()==ayuda){
                        JOptionPane.showMessageDialog(null,MENSAJE_INICIO);
                    }else{
                        System.exit(0);
                    }
                }
            }
*/

        }
    }
}
