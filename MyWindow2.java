import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow2 extends JFrame implements ActionListener{
	private JPanel scratchPanel;
	private ListArray myList;
	private JButton reset;
	private JButton bubble;
	private JButton insertion;
	private JButton merge;
	private JButton threadMerge;
	private JButton quick;
	private JButton shell;
	private JButton dualBubble;
	private JButton placeHolder6;
	private JButton placeHolder7;
	
	public MyWindow2(){
		this.scratchPanel=new JPanel();
		this.scratchPanel.setSize(800,800);
		this.myList = new ListArray(800,this.scratchPanel);
		this.setSize(1000, 839);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.add(scratchPanel);
		
		this.reset=new JButton("Load New Array");
		this.reset.setSize(184, 80);
		this.reset.setLocation(800, 0);
		this.reset.addActionListener(this);
		this.add(reset);
		
		this.bubble=new JButton("Bubble Sort");
		this.bubble.setSize(184, 80);
		this.bubble.setLocation(800, 80);
		this.bubble.addActionListener(this);
		this.add(bubble);
		
		this.insertion=new JButton("Insertion Sort");
		this.insertion.setSize(184, 80);
		this.insertion.setLocation(800, 160);
		this.insertion.addActionListener(this);
		this.add(insertion);
		
		this.merge=new JButton("Merge Sort");
		this.merge.setSize(184, 80);
		this.merge.setLocation(800, 240);
		this.merge.addActionListener(this);
		this.add(merge);
		
		this.threadMerge=new JButton("Threaded Merge Sort");
		this.threadMerge.setSize(184, 80);
		this.threadMerge.setLocation(800, 320);
		this.threadMerge.addActionListener(this);
		this.add(threadMerge);
		
		this.quick=new JButton("Quick Sort");
		this.quick.setSize(184, 80);
		this.quick.setLocation(800, 400);
		this.quick.addActionListener(this);
		this.add(quick);
		
		this.shell=new JButton("Shell Sort");
		this.shell.setSize(184, 80);
		this.shell.setLocation(800, 480);
		this.shell.addActionListener(this);
		this.add(shell);
		
		this.dualBubble=new JButton("Dual Bubble Sort");
		this.dualBubble.setSize(184, 80);
		this.dualBubble.setLocation(800, 560);
		this.dualBubble.addActionListener(this);
		this.add(dualBubble);
		
		this.placeHolder6=new JButton("placeHolder6");
		this.placeHolder6.setSize(184, 80);
		this.placeHolder6.setLocation(800, 640);
		this.placeHolder6.addActionListener(this);
		this.add(placeHolder6);
		
		this.placeHolder7=new JButton("placeHolder7");
		this.placeHolder7.setSize(184, 80);
		this.placeHolder7.setLocation(800, 720);
		this.placeHolder7.addActionListener(this);
		this.add(placeHolder7);
		
		this.myList.clearLines();
		this.myList.drawLines();		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.reset){
			this.myList.clearLines();
			this.myList.randomInt();
			this.myList.drawLines();
		}
		else if(e.getSource()==this.bubble){
			this.myList.bubbleSort();
		}
		else if(e.getSource()==this.insertion){
			this.myList.insertionSort();	
		}
		else if(e.getSource()==this.merge){
			this.myList.mergeSort();	
		}
		else if(e.getSource()==this.threadMerge){
			this.myList.threadMergeSort();	
		}
		else if(e.getSource()==this.quick){
			this.myList.quickSort();	
		}
		else if(e.getSource()==this.shell){
			//this.myList.shellSort();	
		}
		else if(e.getSource()==this.dualBubble){
			this.myList.simpsonBubble();	
		}
	}
	
	public static void main(String[] args) {
		new MyWindow2();
	}

}
