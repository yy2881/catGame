import java.awt.Graphics2D;
import java.awt.geom.QuadCurve2D;
public class QuadCurve implements Shape{
    private Color color = Color.BLACK;
    private double x1;
    private double y1;
    private double ctrlx;
    private double ctrly;
    private double x2;
    private double y2;

    public QuadCurve(double x1, double y1, double ctrlx,double ctrly,double x2, double y2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.ctrlx = ctrlx;
        this.ctrly = ctrly;
        this.y1 = y1;
        this.y2 = y2;
    }
    public int getX()
    {
        return (int) Math.round(Math.min(x1, x2));
    }
    public int getY()
    {
        return (int) Math.round(Math.min(y1, y2));
    }
    public int getWidth()
    {
        return (int) Math.round(Math.abs(x2 - x1));
    }
    public int getHeight()
    {
        return (int) Math.round(Math.abs(y2 - y1));
    }
    public void draw()
    {
        Canvas.getInstance().show(this);
    }
    public void paintShape(Graphics2D g2)
    {
        if (color != null)
        {
            g2.setColor(new java.awt.Color((int) color.getRed(), (int) color.getGreen(), (int) color.getBlue()));
            QuadCurve2D.Double line = new QuadCurve2D.Double(x1, y1, ctrlx, ctrly, x2, y2);
            g2.draw(line);
        }
    }
}
