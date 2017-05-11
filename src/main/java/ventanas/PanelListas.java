package ventanas;

import java.awt.GridLayout;
import javax.swing.*;


public class PanelListas extends JPanel {
    private JComboBox<String> cOrigen;
    private JComboBox<String> cDestino;
    private JLabel origen;
    private JLabel destino;
    private JButton btnBuscar; 

    public PanelListas() {
        initComponent();
    }
    
    private void initComponent(){
        GridLayout distribucion = new GridLayout(20, 2);
        this.setLayout(distribucion);
        this.origen = new JLabel();
        this.origen.setText("Origen");
        this.add(origen);
        
        this.cOrigen = new JComboBox<String>();
        this.cOrigen.addItem("Curacautin");
        this.cOrigen.addItem("Gorbea");
        this.cOrigen.addItem("Lautaro");
        this.cOrigen.addItem("Loncoche");
        this.cOrigen.addItem("LosSauces");
        this.cOrigen.addItem("Lumaco");
        this.cOrigen.addItem("Pucon");
        this.cOrigen.addItem("Puren");
        this.cOrigen.addItem("Temuco");
                //setModel(new DefaultComboBoxModel<>(new String[]{"Curacautin","Gorbea","Lautaro","Loncoche","LosSauces", "Lumaco", "Pucon","Puren","Temuco"}));
        this.cOrigen.setSelectedIndex(8);
        this.add(cOrigen);
        
        this.destino = new JLabel();
        this.destino.setText("Destino");
        this.add(destino);
        
        this.cDestino = new JComboBox<String>();
        this.cDestino.addItem("Curacautin");
        this.cDestino.addItem("Gorbea");
        this.cDestino.addItem("Lautaro");
        this.cDestino.addItem("Loncoche");
        this.cDestino.addItem("LosSauces");
        this.cDestino.addItem("Lumaco");
        this.cDestino.addItem("Pucon");
        this.cDestino.addItem("Puren");
        this.cDestino.addItem("Temuco");
        //this.cDestino.setModel(new DefaultComboBoxModel<>(new String[]{"Curacautin","Gorbea","Lautaro","loncoche","LosSauces", "Lumaco", "Pucon","Puren","Temuco"}));
        this.add(cDestino);
        
        this.btnBuscar = new JButton("Buscar");
        this.add(btnBuscar);
    }
    
}
