package print;

/**
 * <p>Title: Print Editor</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2002</p>
 * <p>Company: </p>
 * @author unascribed
 * @version 1.0
 */
import java.awt.Graphics2D;

public class PCLine extends PComponent {
    /**
     * 
     */
    private static final long serialVersionUID = 7118791007172688015L;

    public PCLine() {
        this(0, 0, 0, 0);
    }

    public PCLine(int x2, int y2, int width2, int height2) {
        x = x2;
        y = y2;
        width = width2;
        height = height2;
    }

    public void print(Graphics2D g2d) {
        // Graphics2D g2d = (Graphics2D) g;
        g2d.translate((double) x, (double) y);
        g2d.fillRect(0, 0, width, height);
        g2d.translate(-(double) x, -(double) y);
    }
}
