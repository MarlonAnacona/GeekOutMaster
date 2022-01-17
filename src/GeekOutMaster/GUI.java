package GeekOutMaster;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    private GeekOutMaster.Header headerProject;
    private JLabel dado[] = new JLabel[10];
    private JLabel fondo;

    private JButton ayuda, salir, lanzar;
    private JPanel panelDadosActivos, panelDadosInactivos, panelDadosUtilizados, panelPuntaje;
    private ImageIcon imagenDados,fondoimagen;
    PanelFondo fondo1= new PanelFondo();

    public GUI() {

        intGUI();
        fondoimagen=new ImageIcon(getClass().getResource("/resources/estrella.jpg"));
        fondo=new JLabel(fondoimagen);

       /*
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );*/

        this.setUndecorated(true);
        this.setTitle("GEEK OUT MASTER");
        this.pack();
        this.setResizable(true);
        //this.setSize(600, 540);
        this.setVisible(true);
        //this.setContentPane(fondo1);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }


    private void intGUI() {
        //create listener object or control object
        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        //set up Jcomponents
        headerProject = new Header("GEEK OUT MASTER", Color.black);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(headerProject, constraints);
        //create a Buttons for exit the aplicattion, help the game. And the game buttons
        ayuda = new JButton(" ? ");
        //ayuda.addActionListener(escucha);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.LINE_START;
        this.add(ayuda, constraints);

        salir = new JButton("Salir");
        //salir.addActionListener(escucha);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.LINE_END;
        this.add(salir, constraints);

        lanzar = new JButton("Lanzar");
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.CENTER;
        this.add(lanzar, constraints);




        panelDadosActivos = new JPanel();
        fondoimagen=new ImageIcon(getClass().getResource("/resources/descarg.jpg"));


        //panelDadosActivos.setLayout(());

        panelDadosActivos.setPreferredSize(new Dimension(500, 180));
       // panelDadosActivos.setBorder(BorderFactory.createTitledBorder("DADOS ACTIVOS "));
        panelDadosActivos.setOpaque(false);
        imagenDados = new ImageIcon(getClass().getResource("/resources/ejemplo.jpg"));


        for (int i = 0; i < 3; i++) {

            dado[i] = new JLabel(imagenDados);
            panelDadosActivos.add(dado[i]);
        }



        panelDadosUtilizados = new JPanel();
        panelDadosUtilizados.setBorder(BorderFactory.createTitledBorder("DADOS UTILIZADOS "));
       // panelDadosUtilizados.setPreferredSize(new Dimension(500, 180));

        panelDadosInactivos = new JPanel();
        panelDadosInactivos.setBorder(BorderFactory.createTitledBorder("DADOS INACTIVOS "));
        // panelDadosInactivos.setPreferredSize(new Dimension(500, 180));

        panelPuntaje= new JPanel();
        panelPuntaje.setBorder(BorderFactory.createTitledBorder("PUNTAJE "));
        // panelPuntaje.setPreferredSize(new Dimension(500,180))



        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.CENTER;
        add(panelDadosActivos, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.CENTER;
        add(panelDadosUtilizados, constraints);

        constraints.gridx =0 ;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.CENTER;
        add(panelDadosInactivos, constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.CENTER;
        add(panelPuntaje, constraints);





    }

    public static void main(String[] args) {
        // Ejecución del programa

        EventQueue.invokeLater(() -> {

            GUI presentacion = new GUI();

        });

    }

    private class Escucha implements ActionListener {
        /*
        These buttons start the game, giving a card with a random value between 1-12, both for the player and for the machine
         */

        public int contadorDados;

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

    public class PanelFondo extends JPanel{

        private ImageIcon imagenFondo;

        public PanelFondo(){
        this.setSize(500,180);
        imagenFondo=new ImageIcon(getClass().getResource("/resources/estrella.jpg"));
        }

        @Override
        public void paint(Graphics fondo){
        fondo.drawImage(imagenFondo.getImage(),0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        //super.paint(fondo);
        }
    }

}
