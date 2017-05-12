package ventanas;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaRecorridos extends JFrame {
    private PanelGraficsEmpresas panel1;
    private PanelListasEmpresas panel2;
    private String origen;
    private String destino;
    private JLabel espacio;
    
    public VentanaRecorridos(String origen, String destino){
        this.origen = origen;
        this.destino = destino;
        initComponent();
    }
    
    public void initComponent (){
        setTitle("BusF - Team Rocket 1.0");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        GridLayout distribucion = new GridLayout(2, 1);
        //BoxLayout distribucion = new BoxLayout(this, 2);
        this.setLayout(distribucion);
        panel1 = new PanelGraficsEmpresas(origen, destino);
        this.add(panel1);
        panel2 = new PanelListasEmpresas();
        this.add(panel2);
    }
    
}
