package GeekOutMaster;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GUI extends JFrame {

    private GeekOutMaster.Header headerProject;
    private JButton dado[] = new JButton[10];

    private JLabel fondo;
    private int contadorDados;
    private List<JButton> listaBotonesActivos= new ArrayList<JButton>();
    private List<JButton> listaBotonesUtilizados= new ArrayList<JButton>();
    private      JButton btn,btn2;
    String nombre1,nombre2;
    private List<JButton> listaBotonesInactivos= new ArrayList<JButton>();

    private JButton ayuda, salir, lanzar;
    private JPanel panelDadosActivos, panelDadosInactivos, panelDadosUtilizados, panelPuntaje;
    private ImageIcon imagenDados,fondoimagen;
    private Escucha escucha=new Escucha();
    private Icon icono;
    PanelFondo fondo1= new PanelFondo();

    public GUI() {
        contadorDados=0;
        intGUI();
        fondoimagen=new ImageIcon(getClass().getResource("/resources/fondo.jpg"));
        fondo=new JLabel(fondoimagen);
        this.setUndecorated(true);
        this.setTitle("GEEK OUT MASTER");
        this.pack();
        this.setResizable(true);
        this.setVisible(true);
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
        for (int i = 0; i < 7; i++) {


            dado[i] = new JButton("Dado "+i);
            dado[i].setBorderPainted(false);
            dado[i].setContentAreaFilled(false);
            dado[i].setFocusable(false);
            ImageIcon imgDadosSalida= new ImageIcon(getClass().getResource("/resources/"+"dadoSalida.png"));
            dado[i].setIcon(imgDadosSalida);
            dado[i].addActionListener(escucha);
            listaBotonesActivos.add(dado[i]);

        }
        for (int i = 7; i < 10; i++) {

            dado[i] = new JButton("Dado "+i);
            dado[i].addActionListener(escucha);
            dado[i].setBorderPainted(false);
            dado[i].setContentAreaFilled(false);
            dado[i].setFocusable(false);
            ImageIcon imgDadosSalida= new ImageIcon(getClass().getResource("/resources/"+"dadoSalida.png"));
            dado[i].setIcon(imgDadosSalida);
            listaBotonesInactivos.add(dado[i]);

        }

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
        ayuda.addActionListener(escucha);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.LINE_START;
        this.add(ayuda, constraints);

        salir = new JButton("Salir");
        salir.addActionListener(escucha);

        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.LINE_END;
        this.add(salir, constraints);

        lanzar = new JButton("Lanzar");
        lanzar.addActionListener(escucha);
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.CENTER;
        this.add(lanzar, constraints);


        panelDadosActivos = new JPanel();
        fondoimagen = new ImageIcon(getClass().getResource("/resources/descarg.jpg"));


        //panelDadosActivos.setLayout(());

        panelDadosActivos.setPreferredSize(new Dimension(500, 250));
        Font font = new Font("Tahoma", Font.BOLD, 18);

        panelDadosActivos.setBorder(BorderFactory.createTitledBorder(LineBorder.createGrayLineBorder(),"DADOS ACTIVOS", TitledBorder.LEFT,TitledBorder.TOP,font,Color.red));


        panelDadosActivos.setOpaque(false);
        imagenDados = new ImageIcon(getClass().getResource("/resources/ejemplo.jpg"));

        for(int i=0;i<listaBotonesActivos.size();i++){
            listaBotonesActivos.get(i).setEnabled(false);


            panelDadosActivos.add(listaBotonesActivos.get(i));

        }


        contadorDados=7;


        panelDadosUtilizados = new JPanel();


        panelDadosUtilizados.setBorder(BorderFactory.createTitledBorder("DADOS UTILIZADOS "));
        panelDadosUtilizados.setPreferredSize(new Dimension(500, 250));
        panelDadosUtilizados.setOpaque(false);
        panelDadosUtilizados.setBorder(BorderFactory.createTitledBorder(LineBorder.createBlackLineBorder(),"DADOS UTILIZADOS", TitledBorder.LEFT,TitledBorder.TOP,font,Color.red));


        panelDadosInactivos = new JPanel();
        panelDadosInactivos.setBorder(BorderFactory.createTitledBorder("DADOS INACTIVOS "));
        panelDadosInactivos.setPreferredSize(new Dimension(500, 200));
        panelDadosInactivos.setOpaque(false);
        panelDadosInactivos.setBorder(BorderFactory.createTitledBorder(LineBorder.createBlackLineBorder(),"DADOS INACTIVOS", TitledBorder.LEFT,TitledBorder.TOP,font,Color.red));

        for(int i=0;i<listaBotonesInactivos.size();i++){
            listaBotonesInactivos.get(i).setEnabled(false);
            panelDadosInactivos.add(listaBotonesInactivos.get(i));



        }




        panelPuntaje= new JPanel();
        panelPuntaje.setBorder(BorderFactory.createTitledBorder("PUNTAJE "));
        panelPuntaje.setPreferredSize(new Dimension(500,200));
        panelPuntaje.setOpaque(false);
        panelPuntaje.setBorder(BorderFactory.createTitledBorder(LineBorder.createBlackLineBorder(),"PUNTAJE", TitledBorder.LEFT,TitledBorder.TOP,font,Color.red));




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

public int contadorveces=-1;
        String nombre[];
        int caras[];
        JButton btn2;
        String nombre2;

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource()==lanzar){

                modelDados tirar =new modelDados();

                tirar.calcularTiroJugador();
                caras=tirar.getCaras();
                nombre=tirar.getNombres();
                for(int i=0;i<10;i++){
                    dado[i].setText(nombre[i]);

                    //Imagenes

                    ImageIcon imgDados= new ImageIcon(getClass().getResource("/resources/"+nombre[i]+".jpg"));
                    dado[i].setIcon(imgDados);
                }
             for (int i=0;i<listaBotonesActivos.size();i++){

                  listaBotonesActivos.get(i).setEnabled(true);
            }



            }else{

            }  if(e.getSource()==ayuda){
                        JOptionPane.showMessageDialog(null,"ASD");
                    }else{
                if(e.getSource()==salir){
                    System.exit(0);
                }else{
                    modelDados evuluaMovimiento = new modelDados();

                    //En caso de que no haya escogido un dado
                   // &&evuluaMovimiento.getDadoEscogido()==-1

                if(e.getSource()!=salir && e.getSource()!=ayuda && e.getSource()!=lanzar&&contadorveces==-1) {

                    btn = (JButton) e.getSource();
                    nombre1 = btn.getText();


                    ImageIcon seleccion= new ImageIcon(getClass().getResource("/resources/corazon.jpg"));
                    btn.setIcon(seleccion);


                contadorveces=1;
                } else{
                    if(e.getSource()!=salir && e.getSource()!=ayuda && e.getSource()!=lanzar&&contadorveces==1) {

                        int pregunta=JOptionPane.showConfirmDialog(null,"Esta segura de hacer esta accion?");
                        if(pregunta==JOptionPane.YES_OPTION){

                             btn2 = (JButton) e.getSource();
                             nombre2 = btn.getText();

                            for(int i=0;i<listaBotonesActivos.size();i++){
                               if( btn2==listaBotonesActivos.get(i)){

                                   evuluaMovimiento.setCara(i);

                               }
                            }

                            modelDados tirar =new modelDados();

                            nombre=tirar.getNombres();
                            for(int i=0;i<10;i++){
                                dado[i].setText(nombre[i]);

                                //Imagenes

                                ImageIcon imgDados= new ImageIcon(getClass().getResource("/resources/"+nombre[i]+".jpg"));
                                dado[i].setIcon(imgDados);
                            }

                            int numero = btn.getComponentCount();


                    evuluaMovimiento.movimientos(nombre1);

                    listaBotonesUtilizados.add(btn);
                    listaBotonesActivos.remove(btn);
                    panelDadosUtilizados.removeAll();
                    panelDadosActivos.removeAll();

                    for (int i = 0; i < listaBotonesUtilizados.size(); i++) {
                        panelDadosUtilizados.add(listaBotonesUtilizados.get(i));
                    }
                    for (int i = 0; i < listaBotonesActivos.size(); i++) {
                        panelDadosActivos.add(listaBotonesActivos.get(i));
                    }
                    panelDadosUtilizados.repaint();

                    panelDadosActivos.repaint();

                        }


                    }
                }




}}






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
