/*
 * |----------------JMat (Java Master)-------------------------------------|
 * |Setiap Manusia Yang Menata Hidupnya adalah Programmer                  |
 * |Hak Cipta Hanya Milik Allah SWT, Hamba-Nya Hanya Memanfaatkan.         |
 * |Manusia Tidak Bisa Mewujudkan Apa-apa, Manusia Hanya Bisa Merencanakan.| 
 * |----------------JMat (Java Master)-------------------------------------| 
 */
package san.jmat.view.render.panel.button;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author joker
 */
public class Button2 extends JButton {

    private Paint paint;
    private Shape shape;
    private boolean over;

    public Button2() {
        //Biar tembus pandang
        setOpaque(false);
        //AreaFiled
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setOver(true);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setOver(false);
            }
        });
    }

    public Boolean getOver() {
        return over;
    }

    public void setOver(Boolean over) {
        this.over = over;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics grphcs) {

        if (over) {
            Graphics2D create = (Graphics2D) grphcs.create();
            paint = new GradientPaint(0, 0,
                    new Color(1f, 1f, 1f, 0.5f), 0, getHeight(),
                    new Color(1f, 1f, 1f, 0f));
            create.setPaint(paint);
            create.fillRoundRect(0, 0, getWidth(), getHeight(), 50, 50);
            create.dispose();

        }
        super.paintComponent(grphcs);
    }
}
