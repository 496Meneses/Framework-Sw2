package gui;

import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.event.ChangeListener;

/**
 *
 * @author AVISOS_ORLANDO
 */
public class GUISensor extends javax.swing.JFrame implements Observer{

    /**
     * Creates new form Sensor
     */
    int estado;
    public GUISensor() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabelHumedad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSliderSensor = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 102, 102), null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 102, 255));
        jTextField1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Sensor de Temperatura");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 516, -1));

        jLabelHumedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/aguaaa.png"))); // NOI18N
        jPanel1.add(jLabelHumedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel2.setText("Temperatura actual en el ambiente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 35, -1, -1));

        jSliderSensor.setBackground(new java.awt.Color(204, 204, 255));
        jSliderSensor.setMaximum(48);
        jSliderSensor.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderSensor.setValue(20);
        jPanel1.add(jSliderSensor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 30, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public int getEstado(){
        this.estado = jSliderSensor.getValue();
        return this.estado;
    }
    @Override
    public void update(Observable o, Object arg) {
        
    }
    
    public void addController(ChangeListener e){
       this.jSliderSensor.addChangeListener(e);
       
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelHumedad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSliderSensor;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    
}
