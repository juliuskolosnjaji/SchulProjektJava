import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        //Draw Line
        g.drawLine(50, 50, 200, 150);

        //Draw Point
        g.setColor(Color.RED);
        g.fillRect(259, 100, 5, 5);
    }

    public void setPoint(int x, int y, Graphics g){
        g.setColor(Color.red);
        g.fillRect(x, y, 5, 5);
    }

    public void setLine(Graphics g, int x1, int y1, int x2, int y2){
        g.drawLine(x1, y1, x2, y2);
    }

    public static void main(String[] args) {

        //Baum 
        BinaryTree links = new BinaryTree<String>("Amogus", null, null);
        BinaryTree rechts = new BinaryTree<String>("Ligma", null, null);
        BinaryTree root = new BinaryTree<String>("Loool", links, rechts);

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Punkt und Linie");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            Main drawingPanel = new Main();
            frame.add(drawingPanel);

            // Set the size of the window
            frame.setSize(400, 300);
            
            // Center the window on the screen
            frame.setLocationRelativeTo(null);
            
            // Make the window visible
            frame.setVisible(true);
        });
    }
}
