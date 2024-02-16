import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ques2 {
    public static void main(String[] args){

        Frame frm = new Frame("Question 2");
        frm.setSize(500,600);
        Button btn1 = new Button("Close");
        frm.add(btn1);
        btn1.setBounds(100,100,200,50);
        btn1.setBackground(Color.red);
        btn1.setForeground(Color.red);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.dispose();
            }
        });

        Label l1 = new Label("Name");
        frm.add(l1);
        l1.setBounds(100,200,100,50);


        TextField tf1 = new TextField();
        frm.add(tf1);
        tf1.setBounds(200,200,100,50);


        Label l2 = new Label("Gender : ");
        frm.add(l2);
        l2.setBounds(100,250,100,50);

        Checkbox cb1 = new Checkbox("Male");
        Checkbox cb2 = new Checkbox("Female");
        frm.add(cb1);
        frm.add(cb2);
        cb1.setBounds(200,250,100,50);
        cb2.setBounds(300,250,100,50);

        Label l3 = new Label("Qualification : ");
        frm.add(l3);
        l3.setBounds(100,300,100,50);

        TextField tf3 = new TextField();
        frm.add(tf3);
        tf3.setBounds(200,300,100,50);

        Label l4 = new Label("Address : ");
        TextArea ta = new TextArea();
        frm.add(l4);
        frm.add(ta);

        l4.setBounds(100,350,100,50);
        ta.setBounds(200,350,200,50);
        ta.setBackground(Color.BLACK);
        ta.setForeground(Color.white);

        Button btn2 = new Button("Submit");
        frm.add(btn2);
        btn2.setBounds(100,400,100,50);

        Button btn3 = new Button("Reset");
        frm.add(btn3);
        btn3.setBounds(200,400,100,50);

        Label flr = new Label();
        frm.add(flr);


        frm.setVisible(true);
    }
}
