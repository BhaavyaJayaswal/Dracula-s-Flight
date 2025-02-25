import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 400;      
        int boardHeight = 640;

        JFrame frame = new JFrame("Dracula's Flight");
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        DraculasFlight dracFlight = new DraculasFlight();
        frame.add(dracFlight);
        frame.pack();
        dracFlight.requestFocusInWindow();
        frame.setVisible(true);
    }
}
