import java.awt.*;
import java.applet.*;
/*
<applet code = "Sample Applet" width = 500 height = 200>
</applet>
*/

public class SA extends Applet{
	String message;

	public void init(){
		setBackground(Color.cyan);
		SetForeground(Color.red);

		msg+ = "Inside the init() method -----";

	}

	public void start(){
		msg+="Inside the Start() method -----";

	}

	//Displays the message in a window
    public void paint(Graphics g){

    	msg+ = "Inside the start() method -----";
    	g.drawString(msg, 10, 30);


    }
}