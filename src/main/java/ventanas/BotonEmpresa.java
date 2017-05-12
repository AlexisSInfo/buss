package ventanas;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BotonEmpresa extends JButton {
    
    //private JFrame parent;
    
    public BotonEmpresa(/*JFrame parent*/) {
        //this.parent = parent;
        initComponent();
    }
    
    private void initComponent(){
        this.setPreferredSize(new Dimension(800, 50));
    }
    
}
