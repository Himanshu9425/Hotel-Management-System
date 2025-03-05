package Hotel.management.system;

import javax.swing.*;
import java.awt.*;

public class SearchRoom extends JFrame {

    // Constructor for SearchRoom
    SearchRoom() {
        // Create a panel


        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);
        // Set frame properties
        setTitle("Search Room");
        setVisible(true);
        setLayout(null);  // Ensure the frame uses a null layout
        setSize(700, 500);  // Set the size of the JFrame
        setLocation(500, 200); // Set the location of the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the window properly
    }

    // Main method to run the program
    public static void main(String[] args) {
        new SearchRoom(); // Create and show the SearchRoom frame
    }
}
