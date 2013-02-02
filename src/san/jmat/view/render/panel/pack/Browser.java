/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package san.jmat.view.render.panel.pack;

import com.stripbandunk.jglasspane.helper.GraphicHelper;
import com.stripbandunk.jglasspane.transition.image.SplitVerticalInImageTransition;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import san.jmat.controler.ControllerWebBrowser;
import san.jmat.model.WebBrowser;
import san.jmat.program.Form;
import san.jmat.view.render.panel.button.Button2;

/**
 *
 * @author wannabe
 */
public class Browser extends javax.swing.JPanel {

    private ControllerWebBrowser controllerWebBrowser;
    private WebBrowser webBrowser;
    private String run;
    private Form form;
    /**
     * Creates new form Browser
     */
    public Browser() {
        initComponents();
        btnFirefox.setVisible(false);
        btnInternetEplorer.setVisible(false);
        btnSafari.setVisible(false);
        webBrowser=new WebBrowser();
        controllerWebBrowser=new ControllerWebBrowser();
        controllerWebBrowser.setWebBrowser(webBrowser);
    }

    public Button2 getBtnFirefox() {
        return btnFirefox;
    }

    public void setBtnFirefox(Button2 btnFirefox) {
        this.btnFirefox = btnFirefox;
    }

    public Button2 getBtnInternetEplorer() {
        return btnInternetEplorer;
    }

    public void setBtnInternetEplorer(Button2 btnInternetEplorer) {
        this.btnInternetEplorer = btnInternetEplorer;
    }

    public Button2 getBtnSafari() {
        return btnSafari;
    }

    public void setBtnSafari(Button2 btnSafari) {
        this.btnSafari = btnSafari;
    }

    public String getRun() {
        return run;
    }

    public void setForm(Form form) {
        this.form = form;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popRenderWebBrowser1 = new san.jmat.view.render.panel.popRender.popRenderWebBrowser();
        menuJavaMaster = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuInternetExplorer = new javax.swing.JMenuItem();
        menuFirefox = new javax.swing.JMenuItem();
        menuSafari = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuDekstop = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lblWebBrowser = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnInternetEplorer = new san.jmat.view.render.panel.button.Button2();
        btnFirefox = new san.jmat.view.render.panel.button.Button2();
        btnSafari = new san.jmat.view.render.panel.button.Button2();

        menuJavaMaster.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        menuJavaMaster.setText("Java Master");
        popRenderWebBrowser1.add(menuJavaMaster);
        popRenderWebBrowser1.add(jSeparator1);

        menuInternetExplorer.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        menuInternetExplorer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/browser/Internet-Explorer-icon7.png"))); // NOI18N
        menuInternetExplorer.setText("Internet Explorer");
        menuInternetExplorer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInternetExplorerActionPerformed(evt);
            }
        });
        popRenderWebBrowser1.add(menuInternetExplorer);

        menuFirefox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        menuFirefox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/browser/browser-firefox-icon7.png"))); // NOI18N
        menuFirefox.setText("Mozilla Firefox");
        menuFirefox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFirefoxActionPerformed(evt);
            }
        });
        popRenderWebBrowser1.add(menuFirefox);

        menuSafari.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        menuSafari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/browser/safari-icon6.png"))); // NOI18N
        menuSafari.setText("Safari");
        menuSafari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSafariActionPerformed(evt);
            }
        });
        popRenderWebBrowser1.add(menuSafari);
        popRenderWebBrowser1.add(jSeparator2);

        menuDekstop.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        menuDekstop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/Misc-Back-icon2.png"))); // NOI18N
        menuDekstop.setText("Back To Menu");
        menuDekstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDekstopActionPerformed(evt);
            }
        });
        popRenderWebBrowser1.add(menuDekstop);

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(551, 77));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        lblWebBrowser.setFont(new java.awt.Font("Comic Sans MS", 3, 55)); // NOI18N
        lblWebBrowser.setForeground(new java.awt.Color(51, 0, 204));
        lblWebBrowser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWebBrowser.setText("Web Browser");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWebBrowser, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblWebBrowser)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setOpaque(false);
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });

        btnInternetEplorer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/browser/Internet-Explorer-icon2.png"))); // NOI18N
        btnInternetEplorer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInternetEplorerMouseEntered(evt);
            }
        });
        btnInternetEplorer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInternetEplorerActionPerformed(evt);
            }
        });
        jPanel2.add(btnInternetEplorer);

        btnFirefox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/browser/browser-firefox-icon2.png"))); // NOI18N
        btnFirefox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFirefoxMouseEntered(evt);
            }
        });
        btnFirefox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirefoxActionPerformed(evt);
            }
        });
        jPanel2.add(btnFirefox);

        btnSafari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/browser/safari-icon2.png"))); // NOI18N
        btnSafari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSafariMouseEntered(evt);
            }
        });
        btnSafari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSafariActionPerformed(evt);
            }
        });
        jPanel2.add(btnSafari);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFirefoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirefoxActionPerformed
        // TODO add your handling code here:
        run="firefox.exe";
        controllerWebBrowser.runBrowser(this);
    }//GEN-LAST:event_btnFirefoxActionPerformed

    private void btnInternetEplorerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInternetEplorerMouseEntered
        // TODO add your handling code here:
        lblWebBrowser.setText("Internet Explorer");
        lblWebBrowser.setForeground(Color.yellow);

    }//GEN-LAST:event_btnInternetEplorerMouseEntered

    private void btnInternetEplorerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInternetEplorerActionPerformed
        // TODO add your handling code here:
        run="iexplore.exe";
        controllerWebBrowser.runBrowser(this);
    }//GEN-LAST:event_btnInternetEplorerActionPerformed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        lblWebBrowser.setText("Web Browser");
        lblWebBrowser.setForeground(Color.blue);
        controllerWebBrowser.cekkingFileExe(this);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
        jPanel1MouseEntered(evt);
        
    }//GEN-LAST:event_jPanel2MouseEntered

    private void btnFirefoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirefoxMouseEntered
        // TODO add your handling code here:
        lblWebBrowser.setText("Mozilla Firefox");
        lblWebBrowser.setForeground(Color.yellow);
    }//GEN-LAST:event_btnFirefoxMouseEntered

    private void btnSafariMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSafariMouseEntered
        // TODO add your handling code here:
        lblWebBrowser.setText("Safari");
        lblWebBrowser.setForeground(Color.yellow);
    }//GEN-LAST:event_btnSafariMouseEntered

    private void btnSafariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSafariActionPerformed
        // TODO add your handling code here:
        run="safari.exe";
        controllerWebBrowser.runBrowser(this);
    }//GEN-LAST:event_btnSafariActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        if(evt.getButton()== MouseEvent.BUTTON3 ){
            popRenderWebBrowser1.show((Component) evt.getSource(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
       // TODO add your handling code here:
        jPanel1MouseClicked(evt);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void menuDekstopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDekstopActionPerformed
        // TODO add your handling code here:
        SplitVerticalInImageTransition transition=new SplitVerticalInImageTransition();
        transition.setCoordinate(GraphicHelper.getLocation(form.getPanelBackground1(), form.getGlassPane()));
        form.getImageTransitionComponent1().setTransition(transition);
        form.getImageTransitionComponent1().start(1000);
        CardLayout cardLayout=(CardLayout) form.getPanelBackground1().getLayout();
        cardLayout.show(form.getPanelBackground1(), "Menu Dekstop");
    }//GEN-LAST:event_menuDekstopActionPerformed

    private void menuInternetExplorerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInternetExplorerActionPerformed
        // TODO add your handling code here:
        btnInternetEplorerActionPerformed(evt);
    }//GEN-LAST:event_menuInternetExplorerActionPerformed

    private void menuFirefoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFirefoxActionPerformed
        // TODO add your handling code here:
        btnFirefoxActionPerformed(evt);
    }//GEN-LAST:event_menuFirefoxActionPerformed

    private void menuSafariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSafariActionPerformed
        // TODO add your handling code here:
        btnSafariActionPerformed(evt);
    }//GEN-LAST:event_menuSafariActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private san.jmat.view.render.panel.button.Button2 btnFirefox;
    private san.jmat.view.render.panel.button.Button2 btnInternetEplorer;
    private san.jmat.view.render.panel.button.Button2 btnSafari;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lblWebBrowser;
    private javax.swing.JMenuItem menuDekstop;
    private javax.swing.JMenuItem menuFirefox;
    private javax.swing.JMenuItem menuInternetExplorer;
    private javax.swing.JMenuItem menuJavaMaster;
    private javax.swing.JMenuItem menuSafari;
    private san.jmat.view.render.panel.popRender.popRenderWebBrowser popRenderWebBrowser1;
    // End of variables declaration//GEN-END:variables
}
