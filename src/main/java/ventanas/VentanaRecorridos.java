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
    
    public VentanaRecorridos(String origen, String destino){//recibe los parametros de inicio de la ventana anterior
        //asignar los parametros de la ventana anterior
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
        this.setLayout(distribucion);
        panel1 = new PanelGraficsEmpresas(origen, destino);//entrega los parametros anteriores para mostrarlos en pantalla
        this.add(panel1);//añade el panel con la informacion seleccionada
        panel2 = new PanelListasEmpresas();//este panel contiene la lista de las empresas que hacen el recorrido pedido
        this.add(panel2);
    }
    
}
