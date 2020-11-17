import java.awt.*;
import java.awt.event.*;

/* <applet code="KeyboardEvent" width=100 height=100>
</applet>
*/

public class KeyboardEvent extends Frame implements KeyListener{
 Label l;
 TextArea area;
 KeyboardEvent(){

 l=new Label();
 l.setBounds(20,50,100,20);
 area=new TextArea();
 area.setBounds(20,80,300, 300);
 area.addKeyListener(this);

 add(l);
 add(area);
 setSize(400,400);
 setLayout(null);
 setVisible(true);
 }
 public void keyPressed(KeyEvent e) {
 l.setText("Key is Pressed");
 }
 public void keyReleased(KeyEvent e) {
 l.setText("Key is Released");
 }
 public void keyTyped(KeyEvent e) {
 l.setText("Key is Typing");
 }
 

 public static void main(String[] args) {
 new KeyboardEvent();
 }
} 