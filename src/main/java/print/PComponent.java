package print;

import java.awt.Component;
import java.awt.Graphics2D;
import java.io.Serializable;

import javax.swing.JPanel;
import javax.swing.RepaintManager;

/**
 * <p>
 * Title: Print Editor
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2002
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author unascribed
 * @version 1.0
 */

public abstract class PComponent extends JPanel implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 6798055796876070742L;
    protected ReportPage reportPage;
    protected int x;
    protected int y;

    protected int width;
    protected int height;

    public PComponent() {
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public abstract void print(Graphics2D parG);

    public static void disableDoubleBuffering(Component c) {
        RepaintManager currentManager = RepaintManager.currentManager(c);
        currentManager.setDoubleBufferingEnabled(false);
    }

    public static void enableDoubleBuffering(Component c) {
        RepaintManager currentManager = RepaintManager.currentManager(c);
        currentManager.setDoubleBufferingEnabled(true);
    }
}
