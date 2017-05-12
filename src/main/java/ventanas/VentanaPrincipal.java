package ventanas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame {
    private PanelListas panelListas;
    private JLabel vacio;
    private JLabel im;
    private ImageIcon icono;
    private String destino;
    private String origen;
    
    public VentanaPrincipal(){
        initComponent();
    }
    
    private void initComponent(){
        setTitle("BusF - Team Rocket 1.0");
        setSize(800, 540);//asigna tamaño a la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cerrar el programa con la X
        setResizable(false); //no puedes cambiar el tamaño de la ventana
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);
        panelListas = new PanelListas(this);
        panelListas.setPreferredSize(new Dimension(250, 500));//asigna tamaño al panel agregado
        this.add(this.panelListas);//añade el panel a la ventana
        this.im = new JLabel();
        this.icono = new ImageIcon("C:\\Users\\alexis\\Documents\\NetBeansProjects\\Buss\\src\\main\\java\\ventanas\\Mapa.png");
        //asigna una imagen al objeto icono
        /*no pude hacer que el programa ingresara la imagen desde las librerias
        del proyecto*/
        this.im.setIcon(icono); //asigna el objeto icono (la imagen) al JLabel para mostrarlo en la ventana
        this.add(im); //añade la imagen a la ventana
        
        setVisible(true);//hace la ventana visible
    }
    
}
