package ventanas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class PanelGraficsEmpresas extends JPanel {
    private JLabel labelOrigen;
    private JLabel labelDestino;
    private String origen;
    private String destino;
    private JTextField origenTField;
    private JTextField destinoTField;
    private JLabel espacio1;
    private JLabel espacio2;
    private JLabel espacio3;
    private JLabel espacio4;

    public PanelGraficsEmpresas(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
        initComponent();
        
    }
    
    private void initComponent(){
        GridLayout distribucion = new GridLayout(2,3);
        this.setLayout(distribucion);
        espacio1 = new JLabel();
        espacio2 = new JLabel();
        espacio3 = new JLabel();
        espacio4 = new JLabel();
        labelOrigen = new JLabel("Origen");
        this.add(labelOrigen);
        this.add(espacio1);
        //this.add(espacio3);
        labelDestino = new JLabel("Destino");
        this.add(labelDestino);
        origenTField = new JTextField();
        this.origenTField.setText(this.origen);
        this.origenTField.setEditable(false);
        this.add(origenTField);
        this.add(espacio2);
        //add(espacio4);
        destinoTField = new JTextField();
        this.destinoTField.setText(this.destino);
        this.destinoTField.setEditable(false);
        this.add(destinoTField);
    }
}
