import java.awt.*;
import java.util.Random;
import javax.swing.*;

abstract class MyShape {
    private int x1, y1, x2, y2;
    private Color color;
    
    public MyShape() {
        this(0, 0, 0, 0, Color.BLACK);
    }
    
    public MyShape(int x1, int y1, int x2, int y2, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }
    
    public void setX1(int x1) { this.x1 = x1; }
    public void setY1(int y1) { this.y1 = y1; }
    public void setX2(int x2) { this.x2 = x2; }
    public void setY2(int y2) { this.y2 = y2; }
    public void setColor(Color color) { this.color = color; }
    
    public int getX1() { return x1; }
    public int getY1() { return y1; }
    public int getX2() { return x2; }
    public int getY2() { return y2; }
    public Color getColor() { return color; }
    
    public int getUpperLeftX() { return Math.min(x1, x2); }
    public int getUpperLeftY() { return Math.min(y1, y2); }
    public int getWidth() { return Math.abs(x2 - x1); }
    public int getHeight() { return Math.abs(y2 - y1); }
    
    public abstract void draw(Graphics g);
}

class MyLine extends MyShape {
    public MyLine(int x1, int y1, int x2, int y2, Color color) {
        super(x1, y1, x2, y2, color);
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawLine(getX1(), getY1(), getX2(), getY2());
    }
}

class MyRectangle extends MyShape {
    private boolean filled;
    
    public MyRectangle(int x1, int y1, int x2, int y2, Color color, boolean filled) {
        super(x1, y1, x2, y2, color);
        this.filled = filled;
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        if (filled) {
            g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        } else {
            g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        }
    }
}

class MyOval extends MyShape {
    private boolean filled;
    
    public MyOval(int x1, int y1, int x2, int y2, Color color, boolean filled) {
        super(x1, y1, x2, y2, color);
        this.filled = filled;
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        if (filled) {
            g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        } else {
            g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        }
    }
}

class DrawPanel extends JPanel {
    private final MyShape[] shapes;
    private static final Random random = new Random();
    
    public DrawPanel(int numShapes) {
        shapes = new MyShape[numShapes];
        
        for (int i = 0; i < numShapes; i++) {
            int x1 = random.nextInt(300);
            int y1 = random.nextInt(300);
            int x2 = random.nextInt(300);
            int y2 = random.nextInt(300);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            
            int shapeType = random.nextInt(3);
            switch (shapeType) {
                case 0 -> shapes[i] = new MyLine(x1, y1, x2, y2, color);
                case 1 -> shapes[i] = new MyRectangle(x1, y1, x2, y2, color, random.nextBoolean());
                case 2 -> shapes[i] = new MyOval(x1, y1, x2, y2, color, random.nextBoolean());
            }
        }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (MyShape shape : shapes) {
            shape.draw(g);
        }
    }
}

public class DrawShapesTest {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o número de formas:");
        int numShapes = Integer.parseInt(input);
        
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        DrawPanel drawPanel = new DrawPanel(numShapes);
        frame.add(drawPanel, BorderLayout.CENTER);
        
        frame.setVisible(true);
    }
}
