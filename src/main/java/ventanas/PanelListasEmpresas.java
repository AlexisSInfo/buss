package ventanas;

import javax.swing.*;


public class PanelListasEmpresas extends JPanel {
    private JLabel labelEmpresas;
    
    public PanelListasEmpresas(){
        initComponent();
    }
    
    private void initComponent(){
        BoxLayout distribucion = new BoxLayout(this, 3);
        labelEmpresas = new JLabel("Empresas disponibles");
        this.add(labelEmpresas);
    }
}
