package animation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;

public class BlueRotatingRect extends Animation {

    /**
     * 
     */
    private static final long serialVersionUID = -4985635637129010816L;
    int angle;
    Image offscreen;
    int imagewidth, imageheight;

    public BlueRotatingRect() {
        setSize(new Dimension(50, 50));
        setStartStatus(false);
        angle = 0;
    }

    public void paintComponent(Graphics g) {
        if (getStartStatus()) {
            Graphics2D g2 = (Graphics2D) g;
            AffineTransform transForm = AffineTransform.getRotateInstance(Math.PI * angle / 360, 25, 25);
            g2.transform(transForm);
            g2.setColor(Color.blue);
            g2.fillRect(12, 12, 25, 25);
            angle = angle + 10;
            if (angle > 360) {
                angle = 0;
            }
        }
    }
}
