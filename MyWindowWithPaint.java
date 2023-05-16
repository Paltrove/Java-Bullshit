import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyWindowWithPaint extends JFrame{
	Graphics pen;
	JPanel panel = new JPanel();
	
	public MyWindowWithPaint(){
		this.setSize(800,800);
		this.setLayout(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("F*** This Shit");
	    this.setVisible(true);
	    pen = this.getGraphics();
	}
	
	public void paint(Graphics pen){		
		Color Back = this.getBackground();
		Color Foreground = this.getForeground();
		pen.setColor(Back);
		pen.drawRect(0, 0, this.getWidth(), this.getHeight());
		pen.setColor(Foreground);
		
		pen.drawLine(50, 50, 50, 100);
		pen.drawLine(51, 49, 51, 99);
		pen.drawLine(52, 50, 52, 100);
	}
	
	public static void main(String[] args) {
		MyWindowWithPaint aWindow = new MyWindowWithPaint();
	}
}
