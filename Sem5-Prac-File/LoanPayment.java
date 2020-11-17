import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code = "LoanPayment" width=500 height=300 >
</applet>
*/
public class LoanPayment extends Applet implements ActionListener
{
TextField amt_t, rate_t, period_t, choice_t;
Button compute = new Button("Compute");
boolean monthlyRate;
public void init()
{
Label choice_l = new Label("Enter 0/1 for choice, for monthly or anually");
Label amt_l = new Label("Enter the Amount: ");
Label rate_l = new Label("Enter the Rate: ", Label.CENTER); 
Label period_l = new Label("Enter the Time Period: ", Label.RIGHT);
choice_t = new TextField(1);
amt_t = new TextField(10);
rate_t = new TextField(10);
period_t = new TextField(10);
add(choice_l);
add(choice_t);
add(amt_l);
add(amt_t);
add(rate_l);
add(rate_t);
add(period_l);
add(period_t);
add(compute);
choice_t.setText("0");
amt_t.setText("0");
rate_t.setText("0");
period_t.setText("0");
monthlyRate= Boolean.valueOf(getParameter("monthlyRate"));
amt_t.addActionListener(this);
rate_t.addActionListener(this);
period_t.addActionListener(this);
compute.addActionListener(this);
}
public void paint(Graphics g)
{
double amt=0, rate=0, period=0, payment=0, choice=0;
String amt_s, rate_s, period_s, payment_s, choice_s;
g.drawString("Input the choice, Loan Amount, Rate and Period in the respective boxes and press Compute", 50,100);
try
{
choice_s = choice_t.getText();
choice = Double.parseDouble(choice_s);
amt_s = amt_t.getText();
amt = Double.parseDouble(amt_s);
rate_s = rate_t.getText();
rate = Double.parseDouble(rate_s);
period_s = period_t.getText();
period = Double.parseDouble(period_s);
}
catch (Exception e) { }
if (monthlyRate)

payment = amt * period * rate * 12 / 100;

else

payment = amt * period * rate / 100;

payment_s = String.valueOf(payment);
g.drawString("The total amount to be paid is: ", 50, 150);
g.drawString(payment_s, 250, 150);
}
public void actionPerformed(ActionEvent ae) {
repaint();
}
}