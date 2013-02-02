/*
 * |----------------JMat (Java Master)-------------------------------------|
 * |Setiap Manusia Yang Menata Hidupnya adalah Programmer                  |
 * |Hak Cipta Hanya Milik Allah SWT, Hamba-Nya Hanya Memanfaatkan.         |
 * |Manusia Tidak Bisa Mewujudkan Apa-apa, Manusia Hanya Bisa Merencanakan.| 
 * |----------------JMat (Java Master)-------------------------------------| 
 */
package san.jmat.view.render.panel.pack;

import com.stripbandunk.jglasspane.helper.GraphicHelper;
import com.stripbandunk.jglasspane.transition.image.WipeDownImageTransition;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import san.jmat.controler.ControllerOffice;
import san.jmat.model.Office;
import san.jmat.program.Form;
import san.jmat.view.render.panel.button.Button2;

/**
 *
 * @author joker
 */
public class officePack extends javax.swing.JPanel {
    
    private ControllerOffice controllerOffice;
    private Office office;
    private String openOffice;
    private Form form;
    /**
     * Creates new form officePack
     */
    public officePack() {
        initComponents();
        //Matikan Button
        btnWord.setVisible(false);
        btnExcel.setVisible(false);
        btnPowerPnt.setVisible(false);
        btnAccsess.setVisible(false);
        btnPublisher.setVisible(false);
        btnOutlook.setVisible(false);
        btnInfoPath.setVisible(false);
        btnNote.setVisible(false);
        btnGroove.setVisible(false);
        //Matikan PopUp
        menuWord.setVisible(false);
        menuExcel.setVisible(false);
        menuPowerPnt.setVisible(false);
        menuAccess.setVisible(false);
        menuPublisher.setVisible(false);
        menuOutLook.setVisible(false);
        menuInfoPath.setVisible(false);
        menuNote.setVisible(false);
        menuGroove.setVisible(false);
        office = new Office();
        controllerOffice = new ControllerOffice();
        controllerOffice.setOffice(office);
        
    }
    //Ambil semua Objek Button
    public Button2 getBtnExcel() {
        return btnExcel;
    }
    
    public Button2 getBtnPowerPnt() {
        return btnPowerPnt;
    }
    
    public Button2 getBtnWord() {
        return btnWord;
    }
    
    public String getOpenOffice() {
        return openOffice;
    }
    
    public void setOpenOffice(String openOffice) {
        this.openOffice = openOffice;
    }
    
    public Button2 getBtnAccsess() {
        return btnAccsess;
    }

    public Button2 getBtnPublisher() {
        return btnPublisher;
    }

    /**
     *
     * @return
     */
    public Button2 getBtnOutlook() {
        return btnOutlook;
    }

    /**
     *
     * @return
     */
    public Button2 getBtnInfoPath() {
        return btnInfoPath;
    }

    /**
     *
     * @return
     */
    public Button2 getBtnNote() {
        return btnNote;
    }

    /**
     *
     * @return
     */
    public Button2 getBtnGroove() {
        return btnGroove;
    }
    
    /**
     * Untuk mengambil Objek Form
     * @return
     */
    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }
  //ambil objek menuItem

    public JMenuItem getMenuAccess() {
        return menuAccess;
    }

    public JMenuItem getMenuExcel() {
        return menuExcel;
    }

    public JMenuItem getMenuGroove() {
        return menuGroove;
    }

    public JMenuItem getMenuInfoPath() {
        return menuInfoPath;
    }

    public JMenuItem getMenuNote() {
        return menuNote;
    }

    public JMenuItem getMenuOutLook() {
        return menuOutLook;
    }

    public JMenuItem getMenuPowerPnt() {
        return menuPowerPnt;
    }

    public JMenuItem getMenuPublisher() {
        return menuPublisher;
    }

    public JMenuItem getMenuWord() {
        return menuWord;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popRenderer1 = new san.jmat.view.render.panel.popRender.popRenderer();
        menuJavaMaster = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuWord = new javax.swing.JMenuItem();
        menuExcel = new javax.swing.JMenuItem();
        menuPowerPnt = new javax.swing.JMenuItem();
        menuGroove = new javax.swing.JMenuItem();
        menuAccess = new javax.swing.JMenuItem();
        menuPublisher = new javax.swing.JMenuItem();
        menuOutLook = new javax.swing.JMenuItem();
        menuNote = new javax.swing.JMenuItem();
        menuInfoPath = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuBackDekstop = new javax.swing.JMenuItem();
        imageTransitionComponent1 = new com.stripbandunk.jglasspane.component.ImageTransitionComponent();
        jGlassPane1 = new com.stripbandunk.jglasspane.JGlassPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnWord = new san.jmat.view.render.panel.button.Button2();
        btnExcel = new san.jmat.view.render.panel.button.Button2();
        btnPowerPnt = new san.jmat.view.render.panel.button.Button2();
        btnGroove = new san.jmat.view.render.panel.button.Button2();
        btnAccsess = new san.jmat.view.render.panel.button.Button2();
        btnPublisher = new san.jmat.view.render.panel.button.Button2();
        btnOutlook = new san.jmat.view.render.panel.button.Button2();
        btnNote = new san.jmat.view.render.panel.button.Button2();
        btnInfoPath = new san.jmat.view.render.panel.button.Button2();

        menuJavaMaster.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        menuJavaMaster.setText("Java Master");
        popRenderer1.add(menuJavaMaster);
        popRenderer1.add(jSeparator1);

        menuWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/office/MS-Word-2-icon2.png"))); // NOI18N
        menuWord.setText("Microsoft Word");
        menuWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuWordActionPerformed(evt);
            }
        });
        popRenderer1.add(menuWord);

        menuExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/office/Excel-icon2.png"))); // NOI18N
        menuExcel.setText("Microsoft Excel");
        menuExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcelActionPerformed(evt);
            }
        });
        popRenderer1.add(menuExcel);

        menuPowerPnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/office/PowerPoint-icon2.png"))); // NOI18N
        menuPowerPnt.setText("Microsoft Power Point");
        menuPowerPnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPowerPntActionPerformed(evt);
            }
        });
        popRenderer1.add(menuPowerPnt);

        menuGroove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/office/Groove-icon2.png"))); // NOI18N
        menuGroove.setText("Microsoft Groove");
        menuGroove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGrooveActionPerformed(evt);
            }
        });
        popRenderer1.add(menuGroove);

        menuAccess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/office/Microsoft-Office-Access-icon2.png"))); // NOI18N
        menuAccess.setText("Microsoft Access");
        menuAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAccessActionPerformed(evt);
            }
        });
        popRenderer1.add(menuAccess);

        menuPublisher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/office/Microsoft-Office-Publisher-icon2.png"))); // NOI18N
        menuPublisher.setText("Microsoft Publisher");
        menuPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPublisherActionPerformed(evt);
            }
        });
        popRenderer1.add(menuPublisher);

        menuOutLook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/office/Outlook-icon2.png"))); // NOI18N
        menuOutLook.setText("Microsoft OutLook");
        menuOutLook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOutLookActionPerformed(evt);
            }
        });
        popRenderer1.add(menuOutLook);

        menuNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/office/Microsoft-Office-One-Note-icon2.png"))); // NOI18N
        menuNote.setText("Microsoft Note");
        menuNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNoteActionPerformed(evt);
            }
        });
        popRenderer1.add(menuNote);

        menuInfoPath.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/office/Microsoft-Office-InfoPath-icon2.png"))); // NOI18N
        menuInfoPath.setText("Microsoft InfoPaht");
        menuInfoPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInfoPathActionPerformed(evt);
            }
        });
        popRenderer1.add(menuInfoPath);
        popRenderer1.add(jSeparator2);

        menuBackDekstop.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        menuBackDekstop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/Misc-Back-icon2.png"))); // NOI18N
        menuBackDekstop.setText("Back To Menu");
        menuBackDekstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBackDekstopActionPerformed(evt);
            }
        });
        popRenderer1.add(menuBackDekstop);

        setOpaque(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 55)); // NOI18N
        jLabel1.setForeground(java.awt.Color.yellow);
        jLabel1.setText("  Microsoft Office  ");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);

        add(jPanel1);

        btnWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/office/MS-Word-2-icon.png"))); // NOI18N
        btnWord.setToolTipText("Open Microsoft Word");
        btnWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWordActionPerformed(evt);
            }
        });
        add(btnWord);

        btnExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/office/Excel-icon.png"))); // NOI18N
        btnExcel.setToolTipText("Open Microsoft Excel");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });
        add(btnExcel);

        btnPowerPnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/office/PowerPoint-icon.png"))); // NOI18N
        btnPowerPnt.setToolTipText("Open Microsoft PowerPoint");
        btnPowerPnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerPntActionPerformed(evt);
            }
        });
        add(btnPowerPnt);

        btnGroove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/office/Groove-icon.png"))); // NOI18N
        btnGroove.setToolTipText("Open Microsoft Groove");
        btnGroove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrooveActionPerformed(evt);
            }
        });
        add(btnGroove);

        btnAccsess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/office/Microsoft-Office-Access-icon.png"))); // NOI18N
        btnAccsess.setToolTipText("Open Microsoft Access");
        btnAccsess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccsessActionPerformed(evt);
            }
        });
        add(btnAccsess);

        btnPublisher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/office/Microsoft-Office-Publisher-icon.png"))); // NOI18N
        btnPublisher.setToolTipText("Open Microsoft Publisher");
        btnPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublisherActionPerformed(evt);
            }
        });
        add(btnPublisher);

        btnOutlook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/office/Microsoft-Office-Outlook-icon.png"))); // NOI18N
        btnOutlook.setToolTipText("Open Microsoft Outlook");
        btnOutlook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutlookActionPerformed(evt);
            }
        });
        add(btnOutlook);

        btnNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/office/Microsoft-Office-One-Note-icon.png"))); // NOI18N
        btnNote.setToolTipText("Open Microsoft Note");
        btnNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoteActionPerformed(evt);
            }
        });
        add(btnNote);

        btnInfoPath.setIcon(new javax.swing.ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/office/Microsoft-Office-InfoPath-icon.png"))); // NOI18N
        btnInfoPath.setToolTipText("Open Microsoft InfoPath");
        btnInfoPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoPathActionPerformed(evt);
            }
        });
        add(btnInfoPath);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        controllerOffice.cekekkingPackOffice(this);
    }//GEN-LAST:event_formMouseEntered
    
    private void btnWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWordActionPerformed
        // TODO add your handling code here:
        setOpenOffice("winword.exe");
        controllerOffice.runOffice(this);
    }//GEN-LAST:event_btnWordActionPerformed
    
    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        // TODO add your handling code here:
        setOpenOffice("excel.exe");
        controllerOffice.runOffice(this);
    }//GEN-LAST:event_btnExcelActionPerformed
    
    private void btnPowerPntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowerPntActionPerformed
        // TODO add your handling code here:
        setOpenOffice("powerpnt.exe");
        controllerOffice.runOffice(this);
    }//GEN-LAST:event_btnPowerPntActionPerformed
    
    private void btnAccsessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccsessActionPerformed
        // TODO add your handling code here:
        setOpenOffice("msaccess.exe");
        controllerOffice.runOffice(this);
    }//GEN-LAST:event_btnAccsessActionPerformed
    
    private void btnPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublisherActionPerformed
        // TODO add your handling code here:
        setOpenOffice("mspub.exe");
        controllerOffice.runOffice(this);
    }//GEN-LAST:event_btnPublisherActionPerformed

    private void btnOutlookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutlookActionPerformed
        // TODO add your handling code here:
        setOpenOffice("outlook.exe");
        controllerOffice.runOffice(this);
    }//GEN-LAST:event_btnOutlookActionPerformed

    private void btnInfoPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoPathActionPerformed
        // TODO add your handling code here:
        setOpenOffice("infopath.exe");
        controllerOffice.runOffice(this);
    }//GEN-LAST:event_btnInfoPathActionPerformed

    private void btnNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoteActionPerformed
        // TODO add your handling code here:
        setOpenOffice("onenote.exe");
        controllerOffice.runOffice(this);
    }//GEN-LAST:event_btnNoteActionPerformed

    private void btnGrooveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrooveActionPerformed
        // TODO add your handling code here:
         setOpenOffice("groove.exe");
        controllerOffice.runOffice(this);
    }//GEN-LAST:event_btnGrooveActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        if(evt.getButton()== MouseEvent.BUTTON3){
            popRenderer1.show((Component) evt.getSource(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_formMouseClicked

    private void menuBackDekstopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBackDekstopActionPerformed
        // TODO add your handling code here:
        WipeDownImageTransition transition=new WipeDownImageTransition();
        transition.setCoordinate(GraphicHelper.getLocation(form.getPanelBackground1(), form.getGlassPane()));
        form.getImageTransitionComponent1().setTransition(transition);
        form.getImageTransitionComponent1().start(1000);
        CardLayout cardLayout=(CardLayout) form.getPanelBackground1().getLayout();
        cardLayout.show(form.getPanelBackground1(), "Menu Dekstop");
    }//GEN-LAST:event_menuBackDekstopActionPerformed

    private void menuWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuWordActionPerformed
        // TODO add your handling code here:
        btnWordActionPerformed(evt);
    }//GEN-LAST:event_menuWordActionPerformed

    private void menuExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcelActionPerformed
        // TODO add your handling code here:
        btnExcelActionPerformed(evt);
    }//GEN-LAST:event_menuExcelActionPerformed

    private void menuPowerPntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPowerPntActionPerformed
        // TODO add your handling code here:
        btnPowerPntActionPerformed(evt);
    }//GEN-LAST:event_menuPowerPntActionPerformed

    private void menuGrooveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGrooveActionPerformed
        // TODO add your handling code here:
        btnGrooveActionPerformed(evt);
        
    }//GEN-LAST:event_menuGrooveActionPerformed

    private void menuAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAccessActionPerformed
        // TODO add your handling code here:
        btnAccsessActionPerformed(evt);
    }//GEN-LAST:event_menuAccessActionPerformed

    private void menuPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPublisherActionPerformed
        // TODO add your handling code here:
        btnPublisherActionPerformed(evt);
    }//GEN-LAST:event_menuPublisherActionPerformed

    private void menuOutLookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOutLookActionPerformed
        // TODO add your handling code here:
        btnOutlookActionPerformed(evt);
    }//GEN-LAST:event_menuOutLookActionPerformed

    private void menuNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNoteActionPerformed
        // TODO add your handling code here:
        btnNoteActionPerformed(evt);
    }//GEN-LAST:event_menuNoteActionPerformed

    private void menuInfoPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInfoPathActionPerformed
        // TODO add your handling code here:
        btnInfoPathActionPerformed(evt);
    }//GEN-LAST:event_menuInfoPathActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private san.jmat.view.render.panel.button.Button2 btnAccsess;
    private san.jmat.view.render.panel.button.Button2 btnExcel;
    private san.jmat.view.render.panel.button.Button2 btnGroove;
    private san.jmat.view.render.panel.button.Button2 btnInfoPath;
    private san.jmat.view.render.panel.button.Button2 btnNote;
    private san.jmat.view.render.panel.button.Button2 btnOutlook;
    private san.jmat.view.render.panel.button.Button2 btnPowerPnt;
    private san.jmat.view.render.panel.button.Button2 btnPublisher;
    private san.jmat.view.render.panel.button.Button2 btnWord;
    private com.stripbandunk.jglasspane.component.ImageTransitionComponent imageTransitionComponent1;
    private com.stripbandunk.jglasspane.JGlassPane jGlassPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem menuAccess;
    private javax.swing.JMenuItem menuBackDekstop;
    private javax.swing.JMenuItem menuExcel;
    private javax.swing.JMenuItem menuGroove;
    private javax.swing.JMenuItem menuInfoPath;
    private javax.swing.JMenuItem menuJavaMaster;
    private javax.swing.JMenuItem menuNote;
    private javax.swing.JMenuItem menuOutLook;
    private javax.swing.JMenuItem menuPowerPnt;
    private javax.swing.JMenuItem menuPublisher;
    private javax.swing.JMenuItem menuWord;
    private san.jmat.view.render.panel.popRender.popRenderer popRenderer1;
    // End of variables declaration//GEN-END:variables
}
