
package BusFind;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;



public class PanelBotones extends JFrame {

    JButton btnBuscar; 
    JLabel origen;
    JLabel destino;
    JComboBox<String> cOrigen;
    JComboBox<String> cDestino; 
  
    Imagen im;
    
    public PanelBotones() throws IOException{
        this.im = new Imagen();
        
        //JFrame Ventana = new JFrame();  // crear ventana
        setTitle("BusF - Team Rocket 1.0");
        setSize(800, 700);      // dimension ventana        
        setLocationRelativeTo(null);    // decirle que aparesca en una parte especifica 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // que se cierre con el X
        setVisible(true);       // mostrar ventana 
        setLayout(null); //asi se ejecuta 
        
        
        origen = new JLabel();
        origen.setText("Origen");
        origen.setBounds(60,25,50, 50); //(separacion i a d, Arriba a abajo ,
        getContentPane().add(origen);
        
        destino = new JLabel();
        destino.setText("Destino");
        destino.setBounds(60, 50, 100, 100);
        getContentPane().add(destino);
        
        
      
        
         this.im = new Imagen();
       
         initComponents();{
        
        }
        
        
        
    }

    private void initComponents() { 
        cOrigen = new JComboBox<>();
        cOrigen.setBounds(60, 60, 148, 25); // a a d , arrib a ab , largo, ancho
        add(cOrigen);
        cOrigen.setModel(new DefaultComboBoxModel<>(new String[]{"Curacautin","Gorbea","Lautaro","Loncoche","LosSauces", "Lumaco", "Pucon","Puren","Temuco"}));
        cOrigen.setSelectedIndex(8);
        
        cDestino = new JComboBox<>();
        cDestino.setBounds(60, 110, 148, 25);
        add(cDestino);
        cDestino.setModel(new DefaultComboBoxModel<>(new String[]{"Curacautin","Gorbea","Lautaro","loncoche","LosSauces", "Lumaco", "Pucon","Puren","Temuco"}));
        
        
        
        //adding other component
 
        JButton b = new JButton("Buscar");
        b.setBounds(60, 180, 148, 25);
        this.add(b);
        b.setVisible(true);

}
        
         
        
       
       
        
    }
               
    
    

