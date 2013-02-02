/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package san.jmat.view.render.panel.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author wannabe
 */
public class Button3 extends JButton {
    
    private boolean over;
    private ImageIcon image;
    
    public Button3() {
        //Biar tembus pandang
        image = new ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/happy-icon2.png"));
        setIcon(image);
        setOpaque(false);
        //AreaFiled
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                
                image = new ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/happy-icon2.png"));
                setIcon(image);
            }
            
            @Override
            public void mouseEntered(MouseEvent me) {
                
                image = new ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/angry-icon2.png"));
                setIcon(image);
            }

            @Override
            public void mouseClicked(MouseEvent me) {
               image = new ImageIcon(getClass().getResource("/san/jmat/view/render/panel/gambar/foolish-icon2.png"));
               setIcon(image);
            }
            
        });
    }
    
   
}
