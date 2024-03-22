import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Panels {
    public static void main(String[] args) {
        JFrame frm = new JFrame();
        frm.setSize(500,500);
        frm.setLayout(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);

        JPanel pnl = new JPanel();
        pnl.setBounds(100,100,100,50);
        frm.add(pnl);

    }
}
