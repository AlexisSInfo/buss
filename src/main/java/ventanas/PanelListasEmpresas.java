package ventanas;

import java.awt.Dimension;
import javax.swing.*;


public class PanelListasEmpresas extends JPanel {
    private JLabel labelEmpresas;
    private BotonEmpresa[]  empresas;
    private int cantEmp;
    
    public PanelListasEmpresas(){
        initComponent();
    }
    
    private void initComponent(){
        cantEmp = 10;
        BoxLayout distribucion = new BoxLayout(this, 1);
        this.setLayout(distribucion);
        empresas = new BotonEmpresa[cantEmp];
        labelEmpresas = new JLabel("Empresas disponibles");
        this.add(labelEmpresas);
        for (int i = 0; i < cantEmp; i++) {
            empresas[i] = new BotonEmpresa();
            empresas[i].setPreferredSize(new Dimension(800, 25));
            empresas[i].setText("empresa referencial "+ (i+1));
            this.add(empresas[i]);
        }
    }
}
