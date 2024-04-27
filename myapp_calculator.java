import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myapp_calculator implements ActionListener{

    Frame f = new Frame("Akash Gupta -- calculator");
    TextField text1 = new TextField(10);
    TextField text2 = new TextField(10);
    TextField text3 = new TextField(10);
    Label l1 = new Label("Enter 1st number:");
    Label l2 = new Label("Enter 2nd number:");
    Label l3 = new Label("          Result:");
    Button b1 = new Button("Addition");
    Button b2 = new Button("Subtraction");
    Button b3 = new Button("Multiplication");
    Button b4 = new Button("Division");

    public myapp_calculator() {
        f.setLayout(null);
        f.setSize(400,400);
        text1.setBounds(120,40,100,30);
        text2.setBounds(120,80,100,30);
        text3.setBounds(120,120,100,30);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b1.setBounds(10,160,80,30);
        b2.setBounds(100,160,80,30);
        b3.setBounds(10,200,80,30);
        b4.setBounds(100,200,80,30);
        l1.setBounds(10,20,100,50);
        l2.setBounds(10,60,100,50);
        l3.setBounds(10,100,100,50);
        f.add(text1);f.add(text2);f.add(text3);
        f.add(l1);f.add(l2);f.add(l3);
        f.add(b1);f.add(b2);f.add(b3);f.add(b4);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new myapp_calculator();
    }

    public void actionPerformed(ActionEvent e){

        int i = Integer.parseInt(text1.getText());
        int j = Integer.parseInt(text2.getText());

        String s = e.getActionCommand();

        if(s.equals("Addition")){
            int z = i + j;
            Integer result = z;
            text3.setText(result.toString());
        }

        if(s.equals("Subtraction")){
            int z = i - j;
            Integer result = z;
            text3.setText(result.toString());
        }

        if(s.equals("Multiplication")){
            int z = i * j;
            Integer result = z;
            text3.setText(result.toString());
        }

        if(s.equals("Division")){
            int z = i / j;
            Integer result = z;
            text3.setText(result.toString());
        }

    }

}





