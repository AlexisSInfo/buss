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
        labelOrigen = new JLabel("Origen");
        this.add(labelOrigen);
        this.add(espacio1);
        labelDestino = new JLabel("Destino");
        this.add(labelDestino);
        origenTField = new JTextField();
        this.origenTField.setText(this.origen);
        this.origenTField.setEditable(false);
        this.add(origenTField);
        this.add(espacio2);
        destinoTField = new JTextField();
        this.destinoTField.setText(this.destino);
        this.destinoTField.setEditable(false);
        this.add(destinoTField);
    }
}
