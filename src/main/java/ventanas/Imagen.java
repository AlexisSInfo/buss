package ventanas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
 

 
class backImage extends JComponent {
 
Image i;
 
//Creating Constructer
public backImage(Image i) {
    this.i = i;
    }

@Override
public void paintComponent(Graphics g) {
 
    g.drawImage(i, 0, 0, null);  // Drawing image using drawImage method
 
    }
}
 
public class Imagen extends JFrame {
 
    public Imagen() throws IOException {
 
 
        BufferedImage bf = ImageIO.read(new File("/C:/Users/Alexis/Documents/NetBeansProjects/Busf/src/busf/imagenF/map.png"));
        this.setContentPane(new backImage(bf));

}

}
