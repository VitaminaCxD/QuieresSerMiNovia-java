package frame;

import botones.BotonNo;
import botones.BotonSi;
import javax.swing.ImageIcon;
import pantalla.Pantalla;

/**
 *
 * @author VitaminaC
 * @version 1.0
 */
public class Frame extends javax.swing.JFrame {

    Pantalla pantalla;
    BotonNo botonNo;
    BotonSi botonSi;

    public Frame() {
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icon.png")).getImage());
        initComponents();

        pantalla = new Pantalla(this.getWidth(), this.getHeight());

        setVisible(true);
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jlb_pregunta = new javax.swing.JLabel();
        jboton_no = new javax.swing.JButton();
        jboton_si = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("¿Quieres ser mi novia?");

        Fondo.setBackground(new java.awt.Color(238, 30, 37));
        Fondo.setToolTipText("");

        jlb_pregunta.setBackground(new java.awt.Color(255, 255, 255));
        jlb_pregunta.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jlb_pregunta.setForeground(new java.awt.Color(255, 255, 255));
        jlb_pregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_pregunta.setText("¿QUIERES SER MI NOVIA?");

        jboton_no.setBackground(new java.awt.Color(102, 102, 102));
        jboton_no.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jboton_no.setForeground(new java.awt.Color(255, 255, 255));
        jboton_no.setText("NO");
        jboton_no.setBorder(null);
        jboton_no.setFocusable(false);
        jboton_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jboton_noMouseEntered(evt);
            }
        });

        jboton_si.setBackground(new java.awt.Color(102, 102, 102));
        jboton_si.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jboton_si.setForeground(new java.awt.Color(255, 255, 255));
        jboton_si.setText("SÍ");
        jboton_si.setBorder(null);
        jboton_si.setFocusable(false);
        jboton_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboton_siActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jboton_si, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(jboton_no, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlb_pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jlb_pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jboton_si, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jboton_no, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jboton_noMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jboton_noMouseEntered
        botonNo = new BotonNo();
        botonNo.botonNo(jboton_no, pantalla);
    }//GEN-LAST:event_jboton_noMouseEntered

    private void jboton_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboton_siActionPerformed
        botonSi = new BotonSi();
        botonSi.botonSi();
    }//GEN-LAST:event_jboton_siActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton jboton_no;
    private javax.swing.JButton jboton_si;
    private javax.swing.JLabel jlb_pregunta;
    // End of variables declaration//GEN-END:variables
}
