package ventanas;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class PanelListas extends JPanel{

    private JComboBox<String> cOrigen;
    private JComboBox<String> cDestino;
    private JLabel origen;
    private JLabel destino;
    private JButton btnBuscar; 
    private JLabel espacio;
    public String strDest;
    public String strOrig;
    private JFrame parent;
    
    public PanelListas(JFrame parent) {
        this.parent = parent;
        initComponent();
    }
    
    private void initComponent(){
        GridLayout distribucion = new GridLayout(20, 2);//20 filas para que las listas queden en la parte superior
        this.setLayout(distribucion);
        this.espacio = new JLabel("");//para hacer una separacion del borde superior
        this.add(espacio);
        this.origen = new JLabel();
        this.origen.setText("Origen");//asigna texto al JLabel
        this.add(origen);
        
        this.cOrigen = new JComboBox<String>();
        this.cOrigen.addItem("Curacautin");this.cOrigen.addItem("Gorbea");this.cOrigen.addItem("Lautaro");
        this.cOrigen.addItem("Loncoche");this.cOrigen.addItem("LosSauces");this.cOrigen.addItem("Lumaco");
        this.cOrigen.addItem("Pucon");this.cOrigen.addItem("Puren");this.cOrigen.addItem("Temuco");
        //asigna contenido al JComboBox de origen
        this.cOrigen.setSelectedIndex(8);
        this.add(cOrigen);
        
        this.destino = new JLabel();
        this.destino.setText("Destino");
        this.add(destino);
        
        this.cDestino = new JComboBox<String>();
        this.cDestino.addItem("Curacautin");this.cDestino.addItem("Gorbea");this.cDestino.addItem("Lautaro");
        this.cDestino.addItem("Loncoche");this.cDestino.addItem("LosSauces");this.cDestino.addItem("Lumaco");
        this.cDestino.addItem("Pucon");this.cDestino.addItem("Puren");this.cDestino.addItem("Temuco");
        //asigna contenido al JComboBox de destino
        this.add(cDestino);
        
        this.btnBuscar = new JButton("Buscar");//añade texto al boton
        this.btnBuscar.addActionListener(new ActionListener() {//añade funcionalidad al boton
            @Override
            public void actionPerformed(ActionEvent e) { 
                presionarBuscar();
            } 
        } );
        this.add(btnBuscar);
    }
    
        private void presionarBuscar(){//funcion ejecutada por el boton
        strDest = cDestino.getSelectedItem().toString();//obtiene la seleccion del JcomboBox de destino
        strOrig = cOrigen.getSelectedItem().toString();//obtiene la seleccion del JcomboBox de origen
        VentanaRecorridos vent = new VentanaRecorridos(strOrig, strDest);/*inicia la siguiente ventana pasandole las
                                                                           selecciones de ambos JComboBox*/
        vent.setVisible(true);//hace visible la ventana siguiente
        this.parent.dispose();//cierra la ventana actual
        }
    
   
}
