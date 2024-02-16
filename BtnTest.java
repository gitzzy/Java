import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class BtnTest {
    public static void main(String[] args) {
        JFrame frm = new JFrame("Buttons");
        frm.setSize(500, 500);
        frm.setLayout(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollPane pane = new JScrollPane();
        frm.add(pane);
        pane.setLayout(null);
        pane.setBounds(0, 0, 480, 500); // Adjusted size for the JScrollPane

        int num = 50;

        JButton[] buttons = new JButton[num];
        int locX = 0;
        int locY = 100;

        for (int i = 0; i < num; i++) {
            buttons[i] = new JButton("Approve -->");
            pane.add(buttons[i]);
            buttons[i].setBounds(locX, locY, 100, 50);
            locY += 50;
        }

        JLabel[] lbl = new JLabel[num];
        int locY1 = 100;

        for (int i = 0; i < num; i++) {
            lbl[i] = new JLabel("Label : " + i);
            pane.add(lbl[i]);
            lbl[i].setBounds(100, locY1, 100, 50);
            locY1 += 50;
        }

        // Add scrollbar to the JScrollPane
        JScrollBar bar = new JScrollBar(JScrollBar.VERTICAL);
        pane.setVerticalScrollBar(bar);
        bar.setBounds(480, 0, 20, 500);

        frm.setVisible(true);
    }
}
