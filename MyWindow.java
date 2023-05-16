import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JLabel;

public class MyWindow extends JFrame implements ActionListener{
	JPanel panel = new JPanel();;
	//JButton button = new JButton();;
	//JLabel label = new JLabel();;
	//JCheckBox box = new JCheckBox();;
	//JColorChooser color = new JColorChooser();;
	//JScrollBar scrollBar = new JScrollBar();;
	public MyWindow(){
		this.setUp();;
	}

	public void setUp(){
		this.setSize(1000,1000);;
		this.setLayout(null);;
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
	    this.setTitle("I Hate It Here");;
	    //Button
	    //this.button = new JButton("Fuck");;
	    //this.button.setSize(200, 100);;
	    //this.button.setLocation(0, 100);;
	    //this.button.addActionListener(this);;
	    //Label
	    //this.label = new JLabel("Why Am I Here");;
	    //this.label.setSize(200, 100);;
	    //this.label.setLocation(50 , 0);;
	    //Check Box
	    //this.box = new JCheckBox("yes");;
	    //this.box.setSize(200, 100);;
	    //this.box.setLocation(250 , 0);;
	    //Color Chooser
	    //this.color = new JColorChooser();;
	    //this.color.setSize(200, 100);;
	    //this.color.setLocation(250 , 100);;
	    //ScrollBar
	    //this.scrollBar = new JScrollBar();;
	    //Display Items
	    //this.add(this.button);;
	    //this.add(this.label);;
	    //this.add(this.box);;
	    //this.add(this.color);;
	    //this.add(this.scrollBar);;
	    this.setVisible(true);;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("UwU");;
	}
	
	public static void main(String[] args) {
		MyWindow aWindow = new MyWindow();;
	}

	
}
