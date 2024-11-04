
import javax.swing.*;
import java.awt.*;

public class ShapeDrawing extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Call the superclass's method to ensure proper rendering

        // Set color and draw an oval
        g.setColor(Color.BLUE);
        g.fillOval(50, 50, 100, 60); // x, y, width, height

        // Set color and draw a rectangle
        g.setColor(Color.RED);
        g.fillRect(200, 50, 150, 80); // x, y, width, height

        // Set color and draw a line
        g.setColor(Color.GREEN);
        g.drawLine(50, 150, 300, 150); // x1, y1, x2, y2

        // Set color and draw text
        g.setColor(Color.BLACK);
        g.drawString("This is an oval, rectangle, line, and text.", 50, 200);
    }

    public static void main(String[] args) {
        // Create a JFrame to hold the panel
        JFrame frame = new JFrame("Shape Drawing Example");
        ShapeDrawing panel = new ShapeDrawing();
        
        // Add panel to the frame and set frame properties
        frame.add(panel);
        frame.setSize(400, 300); // Set the window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // Make the window visible
    }
}
