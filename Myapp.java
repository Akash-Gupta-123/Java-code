import java.awt.*;
import java.applet.*;

/*<!DOCTYPE html>
<html>
<head>
    <title>Addition of two numbers</title>
</head>
<body>
    <applet code="Myapp" width="400" height="200"> </applet>
</body>
</html> */

public class Myapp extends  Applet {

    TextField text1, text2;
    public void init(){
        text1 = new TextField(8);
        text2 = new TextField(8);
        add (text1);
        add (text2);
        text1.setText ("0");
        text2.setText ("0");
    }

    public void paint(Graphics g){
        int x = 0, y = 0, z = 0;
        String s1, s2, s;
        g.drawString("Enter a number in each box:",10,50);
        try{
               s1 = text1.getText();
               x = Integer.parseInt(s1);
               s2 = text2.getText();
               y = Integer.parseInt(s2);
        }
        catch (Exception ex){ }

        z = x + y;
        s = String.valueOf (z);
        g.drawString ("THE SUM IS:", 10, 75);
        g.drawString (s, 100, 75);
    }
   
}
