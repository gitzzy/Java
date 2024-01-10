import javax.swing.*;

public class ProgressBarExample extends JFrame {

    static JProgressBar Bar; // Initialize the JProgressBar

    ProgressBarExample() {
        Bar = new JProgressBar(); // Instantiate the JProgressBar

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Bar.setStringPainted(true);
        Bar.setValue(0);

        this.add(Bar);
        this.setVisible(true);
        this.setLayout(null);
        fill();
    }

    public static void fill() {
        int progressValue = 0;
        while (progressValue <= 100) {
            Bar.setValue(progressValue);
            progressValue++;
            try {
                Thread.sleep(50); // Add a small delay to make the progress visible
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (progressValue == 101) { // Check for 101 as the loop increments progressValue one more time after reaching 100
            JOptionPane.showMessageDialog(null, "Loading complete!");
            
        }
    }
    public static void main(String args[]) {
                new ProgressBarExample();
        }

    public void Bar() {
    }
}