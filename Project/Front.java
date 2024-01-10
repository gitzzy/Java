import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Front {


    protected static int progressValue;

    public static void main(String[] args) {
        
        JFrame frm = new JFrame("Emi Tracker");
        frm.setSize(500, 500);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CardLayout cards = new CardLayout();
        JPanel cardPanel = new JPanel(cards);
        frm.add(cardPanel);

        JPanel p1 = new JPanel();
        cardPanel.add(p1, "cards1");
        p1.setLayout(null);
        p1.setBounds(0, 0, 500, 500);

        JButton btn1 = new JButton("Home");
        p1.add(btn1);
        btn1.setBounds(150, 100, 200, 100);

        JButton btn2 = new JButton("Add");
        p1.add(btn2);
        btn2.setBounds(150, 200, 200, 100);



        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
// if(e.getSource()== btn2){
//     new Thread(() -> {
//         ProgressBarExample pb = new ProgressBarExample();
//                 }).start();

// }
 cards.show(cardPanel,"cards2");

      }
        });

        JButton btn3 = new JButton("Insert");
        p1.add(btn3);
        btn3.setBounds(150, 300, 200, 100);

         btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
cards.show(cardPanel,"cards3");
            }
        });

        JPanel p2 = new JPanel();
        cardPanel.add(p2, "cards2");
        p2.setLayout(null);
        JLabel l1 = new JLabel("This is Add Page");
        p2.add(l1);
        l1.setBounds(0, 0, 200, 200);

        JPanel p3 = new JPanel();
        cardPanel.add(p3, "cards3");
        p3.setLayout(null);
        JLabel l2 = new JLabel("This is Insert Page");
        p3.add(l2);
        l2.setBounds(0, 0, 200, 200);
        JButton btnHome = new JButton("Home");
        JButton btnHome1 = new JButton("Home");
        p3.add(btnHome1);
        p2.add(btnHome);
        btnHome.setBounds(100,150,200,100);
        btnHome1.setBounds(100,150,200,100);

         btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
cards.show(cardPanel,"cards1");
            }
        });

        btnHome1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
cards.show(cardPanel,"cards1");
            }
        });

        cards.show(cardPanel, "cards1");

        frm.setVisible(true);


    }
}
