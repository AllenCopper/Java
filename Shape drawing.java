import javax.swing.*;
import java.awt.*;

public class ShapeDrawing extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Call the superclass's method

        // Set color for the shapes
        g.setColor(Color.BLUE);

        // Draw an oval
        g.fillOval(50, 50, 100, 60); // x, y, width, height

        // Set color for the rectangle
        g.setColor(Color.RED);

        // Draw a rectangle
        g.fillRect(200, 50, 150, 80); // x, y, width, height

        // Set color for the line
        g.setColor(Color.GREEN);

        // Draw a line
        g.drawLine(50, 150, 300, 150); // x1, y1, x2, y2

        // Set color for the text
        g.setColor(Color.BLACK);

        // Draw some text
        g.drawString("This is an oval, rectangle, line, and text.", 50, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Drawing Example");
        ShapeDrawing panel = new ShapeDrawing();
        frame.add(panel);
        frame.setSize(400, 300); // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
