package ventanas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame {
    private PanelListas panelListas;
    private JLabel vacio;
    private JLabel im;
    private ImageIcon icono;
    
    public VentanaPrincipal(){
        initComponent();
    }
    
    private void initComponent(){
        setTitle("BusF - Team Rocket 1.0");
        setSize(800, 700);      // dimension ventana        
        //setLocationRelativeTo(null);    // decirle que aparesca en una parte especifica 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // que se cierre con el X
        setResizable(false);
        
        GridLayout distribucion = new GridLayout(1,2);
        this.setLayout(distribucion);
        panelListas = new PanelListas();
        this.add(this.panelListas, BorderLayout.WEST);
        this.im = new JLabel();
        this.icono = new ImageIcon("C:\\Users\\alexis\\Documents\\NetBeansProjects\\Buss\\src\\main\\java\\ventanas\\Mapa.png");
        this.im.setIcon(icono);
        this.add(im, BorderLayout.NORTH);
        
        setVisible(true);       // mostrar ventana 
    }
}
