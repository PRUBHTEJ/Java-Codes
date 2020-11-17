import java.awt.*;
import java.applet.*;
/*
<applet code = "SA" width = 500 height = 200>
</applet>
*/

public class SA extends Applet{
	String message;

	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.red);

		message+= "Inside the init() method --->";

	}

	public void start(){
		message+="Inside the Start() method --->";

	}

	//Displays the message in a window
    public void paint(Graphics g){

    	message+= "Inside the start() method --->";
    	g.drawString(message, 10, 30);


    }
}