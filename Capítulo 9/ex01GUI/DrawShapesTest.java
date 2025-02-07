import java.awt.*;
import java.util.Random;
import javax.swing.*;

class MyShape {
    private int x1, y1, x2, y2;
    private Color color;
    private boolean filled;

    public MyShape() {
        this(0, 0, 0, 0, Color.BLACK, false);
    }

    public MyShape(int x1, int y1, int x2, int y2, Color color, boolean filled) {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        setColor(color);
        setFilled(filled);
    }

    public void setX1(int x1) { this.x1 = Math.max(0, x1); }
    public void setY1(int y1) { this.y1 = Math.max(0, y1); }
    public void setX2(int x2) { this.x2 = Math.max(0, x2); }
    public void setY2(int y2) { this.y2 = Math.max(0, y2); }
    public void setColor(Color color) { this.color = color; }
    public void setFilled(boolean filled) { this.filled = filled; }
    
    public int getX1() { return x1; }
    public int getY1() { return y1; }
    public int getX2() { return x2; }
    public int getY2() { return y2; }
    public Color getColor() { return color; }
    public boolean isFilled() { return filled; }
    
    public int getUpperLeftX() { return Math.min(x1, x2); }
    public int getUpperLeftY() { return Math.min(y1, y2); }
    public int getWidth() { return Math.abs(x2 - x1); }
    public int getHeight() { return Math.abs(y2 - y1); }
}

class MyRectangle extends MyShape {
    public MyRectangle() {
        super();
    }
    public MyRectangle(int x1, int y1, int x2, int y2, Color color, boolean filled) {
        super(x1, y1, x2, y2, color, filled);
    }
    public void draw(Graphics g) {
        g.setColor(getColor());
        if (isFilled()) {
            g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        } else {
            g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        }
    }
}

class MyOval extends MyShape {
    public MyOval() {
        super();
    }
    public MyOval(int x1, int y1, int x2, int y2, Color color, boolean filled) {
        super(x1, y1, x2, y2, color, filled);
    }
    public void draw(Graphics g) {
        g.setColor(getColor());
        if (isFilled()) {
            g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        } else {
            g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        }
    }
}

class DrawPanel extends JPanel {
    private final MyRectangle[] rectangles;
    private final MyOval[] ovals;
    private static final Random random = new Random();

    public DrawPanel() {
        int rectCount = 1 + random.nextInt(5);
        int ovalCount = 1 + random.nextInt(5);
        
        rectangles = new MyRectangle[rectCount];
        ovals = new MyOval[ovalCount];

        for (int i = 0; i < rectCount; i++) {
            rectangles[i] = new MyRectangle(
                random.nextInt(300), random.nextInt(300),
                random.nextInt(300), random.nextInt(300),
                new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)),
                random.nextBoolean()
            );
        }

        for (int i = 0; i < ovalCount; i++) {
            ovals[i] = new MyOval(
                random.nextInt(300), random.nextInt(300),
                random.nextInt(300), random.nextInt(300),
                new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)),
                random.nextBoolean()
            );
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (MyRectangle rect : rectangles) rect.draw(g);
        for (MyOval oval : ovals) oval.draw(g);
    }
    
    public String getStatusText() {
        return "Retângulos: " + rectangles.length + " | Ovais: " + ovals.length;
    }
}

public class DrawShapesTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        DrawPanel drawPanel = new DrawPanel();
        JLabel statusLabel = new JLabel(drawPanel.getStatusText());
        
        frame.add(drawPanel, BorderLayout.CENTER);
        frame.add(statusLabel, BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }
}