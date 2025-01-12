/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ucr.ac.cr.sismusica.Vista;

import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import ucr.ac.cr.sismusica.Modelo.Cancion;

/**
 *
 * @author Estudiante
 */
public class JPanelDatosCancion extends javax.swing.JPanel {

    /**
     * Creates new form JPanelDatosCancion
     */
    public JPanelDatosCancion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTexTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTexGenero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextAnnio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextDuracion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cboxTitulos = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 88, -1, -1));
        add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 82, -1, -1));

        jLabel2.setText("Titulo");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 116, -1, -1));
        add(jTexTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 110, -1, -1));

        jLabel3.setText("Genero");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 144, -1, -1));
        add(jTexGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 138, -1, -1));

        jLabel4.setText("Año lanzamiento");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 172, -1, -1));
        add(jTextAnnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 166, -1, -1));

        jLabel5.setText("Duracion");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 197, -1, -1));
        add(jTextDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 194, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Registro de Canciones");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        add(cboxTitulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 163, 144));
    }// </editor-fold>//GEN-END:initComponents

//metodo que recibe un objeto y lo imprime 
    public void setCancion(Cancion cancion) {
        this.jTexGenero.setText(cancion.getGenero());
        this.jTexTitulo.setText(cancion.getNombre());
        this.jTextAnnio.setText(cancion.getAnnio() + "");
        this.jTextDuracion.setText(cancion.getDuracion() + "");
        this.jTextID.setText(cancion.getId() + "");
    }

    //metodo que extrae la informacion de los jText y los guarda en un objeto
    public Cancion getCancio() {
        return new Cancion(Integer.parseInt(this.jTextID.getText()),
                this.jTexTitulo.getText(),
                Double.parseDouble(this.jTextDuracion.getText()),
                Integer.parseInt(this.jTextAnnio.getText()),
                this.jTexGenero.getText()
        );
    }
    
    public void limpiar(){
        this.jTextID.setText("");
        this.jTexGenero.setText("");
        this.jTexTitulo.setText("");
        this.jTextAnnio.setText("");
        this.jTextDuracion.setText("");
    }
    
    public void cargarCombo(String [] listaTitulos){
        this.cboxTitulos.setModel(new DefaultComboBoxModel<>(listaTitulos));
    }
    public String devolverCombo(){
        return this.cboxTitulos.getSelectedItem().toString(); 
        
    }
    public void escuchador(ActionListener a){
        this.cboxTitulos.addActionListener(a);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cboxTitulos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JTextField jTexGenero;
    public javax.swing.JTextField jTexTitulo;
    public javax.swing.JTextField jTextAnnio;
    public javax.swing.JTextField jTextDuracion;
    public javax.swing.JTextField jTextID;
    // End of variables declaration//GEN-END:variables
}
