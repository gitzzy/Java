package testers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Test2 {
    static boolean check;
    static int ii;

    public static void main(String[] args) {

        JFrame frm = new JFrame("Buttons");
        frm.setSize(500, 500);
        frm.setLayout(new BorderLayout());
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLocation(350, 200);
        int Count = 0;
        JScrollPane sPane = new JScrollPane();
        sPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JPanel sPanel = new JPanel(new GridLayout(Count, 1, 0, 5));
        sPane.setViewportView(sPanel);

        ArrayList<String> ar1 = new ArrayList<>();
        ArrayList<String> phn = new ArrayList<>();
        ArrayList<String> mail = new ArrayList<>();
        ArrayList<String> sDob = new ArrayList<>();


        Data1 obj = new Data1();
        try {
            String q1 = "select * from admin1";
            PreparedStatement pt0 = obj.con.prepareStatement(q1);
            ResultSet rs = pt0.executeQuery();
            while (rs.next()) {
                Count += 1;
                ar1.add(rs.getString("full_Name"));
                phn.add(rs.getString("Phone"));
                mail.add(rs.getString("mail"));
                sDob.add(rs.getString("dob"));

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        JButton[] btn = new JButton[Count];
        JPanel[] pnl = new JPanel[Count];
        JButton[] btns = new JButton[Count];
        JLabel[] lbl = new JLabel[Count];
        JLabel[] Name = new JLabel[Count];
        JLabel[] Phone = new JLabel[Count];
        JLabel[] Mail = new JLabel[Count];

        JLabel[] Dob = new JLabel[Count];

        // String[] acc = new String[Count];

        for (int i = 0; i < Count; i++) {

            ii = i;
            pnl[i] = new JPanel();
            pnl[i].setPreferredSize(new Dimension(100, 100));
            sPanel.add(pnl[i]);
            pnl[i].setLayout(null);

            btn[i] = new JButton("Approve");
            pnl[i].add(btn[i]);
            btn[i].setBounds(400, 0, 80, 50);
            btn[i].addActionListener(e ->{
                JOptionPane.showMessageDialog( null, "You Have Approved : ");
            });

            btns[i] = new JButton("Deny");
            pnl[i].add(btns[i]);
            btns[i].setBounds(400, 50, 80, 50);

            lbl[i] = new JLabel("Application : " + (i + 1));
            pnl[i].add(lbl[i]);
            lbl[i].setBounds(5, -10, 100, 50);
            lbl[i].setForeground(Color.white);

            Name[i] = new JLabel("Name : " + ar1.get(i));
            // ar1.removeFirst();
            pnl[i].add(Name[i]);
            Name[i].setBounds(5, 10, 300, 50);
            Name[i].setForeground(Color.green);

            Phone[i] = new JLabel("Phone : "+phn.get(i));
            pnl[i].add(Phone[i]);
            Phone[i].setBounds(5, 25, 300, 50);
            Phone[i].setForeground(Color.green);

            Mail[i] = new JLabel("Mail : "+mail.get(i));
            pnl[i].add(Mail[i]);
            Mail[i].setBounds(5, 40, 300, 50);
            Mail[i].setForeground(Color.green);

            Dob[i] = new JLabel("DOB : "+sDob.get(i));
            pnl[i].add(Dob[i]);
            Dob[i].setBounds(5, 55, 300, 50);
            Dob[i].setForeground(Color.green);


            if (i % 2 == 0) {
                pnl[i].setBackground(Color.black);
            } else {
                pnl[i].setBackground(Color.black);
            }

        }

        frm.add(sPane, BorderLayout.CENTER);

        frm.setVisible(true);
    }
}
