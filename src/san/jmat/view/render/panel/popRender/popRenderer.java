/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package san.jmat.view.render.panel.popRender;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;

/**
 *
 * @author wannabe
 */
public class popRenderer extends JPopupMenu {

    private Image image;

    public popRenderer() {
        setBorderPainted(false);
        setOpaque(false);
        
        image = new ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/Office-icon.png")).getImage();
        
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        Graphics2D create = (Graphics2D) grphcs.create();
        create.setComposite(AlphaComposite.SrcOver.derive(0.5f));
        create.drawImage(image, 45, 109, null);
        
        create.dispose();
    }

   
}
