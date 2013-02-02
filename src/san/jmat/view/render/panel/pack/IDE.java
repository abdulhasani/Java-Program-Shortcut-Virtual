/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package san.jmat.view.render.panel.pack;

import com.stripbandunk.jglasspane.helper.GraphicHelper;
import com.stripbandunk.jglasspane.transition.image.BlindHorizontalImageTransition;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import san.jmat.controler.ControllerIDE;
import san.jmat.program.Form;
import san.jmat.view.render.panel.button.Button2;

/**
 *
 * @author wannabe
 */
public class IDE extends javax.swing.JPanel {
    private Form form;
    private ControllerIDE controllerIDE;
    /**
     * Creates new form IDE
     */
    public IDE() {
        initComponents();
        DisableButtonNMenu();
    }

    public void setForm(Form form) {
        this.form = form;
    }
    private void DisableButtonNMenu(){
        buttonNetbeans.setVisible(false);
        menuNetbeans.setVisible(false);
    }

    public Button2 getButtonNetbeans() {
        return buttonNetbeans;
    }

    public JMenuItem getMenuNetbeans() {
        return menuNetbeans;
    }

    public ControllerIDE getControllerIDE() {
        return controllerIDE;
    }

    public void setControllerIDE(ControllerIDE controllerIDE) {
        this.controllerIDE = controllerIDE;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popRenderIDE1 = new san.jmat.view.render.panel.popRender.popRenderIDE();
        menuJMat = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuNetbeans = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuBackToMenu = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buttonNetbeans = new san.jmat.view.render.panel.button.Button2();

        menuJMat.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        menuJMat.setText("JMat");
        popRenderIDE1.add(menuJMat);
        popRenderIDE1.add(jSeparator1);

        menuNetbeans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/ide/Netbeans-icon2.png"))); // NOI18N
        menuNetbeans.setText("Netbeans");
        popRenderIDE1.add(menuNetbeans);
        popRenderIDE1.add(jSeparator2);

        menuBackToMenu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        menuBackToMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/Misc-Back-icon2.png"))); // NOI18N
        menuBackToMenu.setText("Back To Menu");
        menuBackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBackToMenuActionPerformed(evt);
            }
        });
        popRenderIDE1.add(menuBackToMenu);

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setText("IDE");
        jPanel1.add(jLabel1);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setOpaque(false);
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        buttonNetbeans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/ide/Netbeans-icon.png"))); // NOI18N
        buttonNetbeans.setToolTipText("Netbeans");
        buttonNetbeans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNetbeansActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(buttonNetbeans, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(buttonNetbeans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 109, Short.MAX_VALUE))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        if(evt.getButton()==MouseEvent.BUTTON3){
            popRenderIDE1.show((Component)evt.getSource(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void menuBackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBackToMenuActionPerformed
        // TODO add your handling code here:
        BlindHorizontalImageTransition transition=new BlindHorizontalImageTransition();
        transition.setCoordinate(GraphicHelper.getLocation(form.getPanelBackground1(), form.getGlassPane()));
        form.getImageTransitionComponent1().setTransition(transition);
        form.getImageTransitionComponent1().start(1000);
        CardLayout cardLayout;
        cardLayout=(CardLayout) form.getPanelBackground1().getLayout();
        cardLayout.show(form.getPanelBackground1(), "Menu Dekstop");
    }//GEN-LAST:event_menuBackToMenuActionPerformed

    private void buttonNetbeansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNetbeansActionPerformed
        // TODO add your handling code here:
        controllerIDE.Run("C:\\Program Files\\NetBeans 7.2\\bin\\netbeans.exe");
    }//GEN-LAST:event_buttonNetbeansActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private san.jmat.view.render.panel.button.Button2 buttonNetbeans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem menuBackToMenu;
    private javax.swing.JMenuItem menuJMat;
    private javax.swing.JMenuItem menuNetbeans;
    private san.jmat.view.render.panel.popRender.popRenderIDE popRenderIDE1;
    // End of variables declaration//GEN-END:variables
}
