package AnonymousObject;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame();
        
        // Create an ArrayList to hold JLabels for the card images
        ArrayList<JLabel> deck = new ArrayList<>();

        // Loop through 54 cards and add them to the ArrayList
        for (int i = 1; i <= 54; i++) {
            // Load the image for each card
            ImageIcon cardIcon = new ImageIcon("AnonymousObject/cards/" + i + ".png");

            // Scale the image to 100x150 pixels
            Image scaledImage = cardIcon.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);

            // Add the JLabel with the scaled card image to the ArrayList
            deck.add(new JLabel(new ImageIcon(scaledImage)));

            // Add each JLabel to the frame
            frame.add(deck.get(i - 1)); // Use (i - 1) to get the correct index
        }

        // Set the frame's properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);  // Increase the frame size to fit all cards
        frame.setLayout(new FlowLayout()); // FlowLayout to arrange the cards
        frame.setVisible(true);
    }
}
