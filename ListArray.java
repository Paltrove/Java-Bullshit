import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class ListArray {
	//Array for my numbers
	int[] list;
	JPanel aPanel;

	public ListArray(int num,JPanel aPanel){
		//creates an array
		list = new int[num];
		this.aPanel = aPanel;
		randomInt();
	}

	public void randomInt(){
		//fills my array with random variables
		Random rand = new Random();
		for (int i=0; i < list.length; i++){
			//goes through each slot and fills it with numbers between 1-1280
			list[i] = rand.nextInt(800)+1;
		}
	}

	public void bubbleSort(){
		bubbleSort(0, this.list.length);
	}

	public void insertionSort(){
		//goes through and moves the number to its correct place
		int n = list.length;
		for(int i=0; i<n; i++){
			//goes through it once
			int temp = list[i];
			int j = i - 1;
			Graphics pen = this.aPanel.getGraphics();
			Color Back = this.aPanel.getBackground();
			Color Foreground = this.aPanel.getForeground();
			int panelHeight=aPanel.getHeight();
			while (j>=0 && list[j] > temp){
				//checks a number and sees if numbers in front are bigger
				pen.setColor(Back);
				pen.drawLine(j+1, panelHeight, j+1, panelHeight-list[j+1]);
				pen.drawLine(j, panelHeight, j, panelHeight-list[j]);
				list[j + 1] = list[j];
				pen.setColor(Foreground);
				pen.drawLine(j+1, panelHeight, j+1, panelHeight-list[j+1]);
				//if so moves it to that place
				j = j - 1;
			}
			list[j + 1] = temp;
			pen.drawLine(j+1, panelHeight, j+1, panelHeight-list[j+1]);
		}
	}

	public void mergeSort(){
		this.mergeSort(0, this.list.length-1);
	}

	public void mergeSort(int low, int high){
		int length = high-low+1;
		if(length > 4){
			int mid = (low + high) / 2;
			mergeSort(low, mid);
			mergeSort(mid + 1, high);
			bubbleSort(low, high);
		} else{
			bubbleSort(low, high);
		}
	}

	public void threadMergeSort(){
		this.threadMergeSort(0, this.list.length-1);
	}

	public void threadMergeSort(int low, int high){
		Thread t1 = null, t2 = null;
		int length = high-low+1;
		if(length > 4){
			int mid = (low + high) / 2;
			t1 = new Thread(){
				public void run(){
					threadMergeSort(low, mid);
				}
			};
			t2 = new Thread(){
				public void run(){
					threadMergeSort(mid + 1, high);
				}
			};
			t1.start();
			t2.start();
			try{
				t1.join();
				t2.join();
			} catch(InterruptedException e){
				//completed
			}
		} 
		bubbleSort(low, high);

	}

	//must have array of 2-3
	public void bubbleSort(int low, int high){
		//goes through multiple times to sort numbers
		for(int i=low,k=0; i<high; i++,k++){
			//repeats till all numbers are sorted

			for(int j=low; j<high-1-k; j++){
				if(list[j+1] < list[j]){
					this.lineSwap(j+1, j);
				}
			}
		}
	}

	public void revBubbleSort(int low, int high){
		//goes through multiple times to sort numbers
		for(int i=low,k=0; i<high; i++,k++){
			//repeats till all numbers are sorted

			for(int j=high-1; j>low+1+k; j--){
				if(list[j-1] > list[j]){
					this.lineSwap(j, j-1);
				}
			}
		}
	}

	public void dualBubbleSort(){
		dualBubbleSort(0, list.length);
	}

	public void simpsonBubble(){
		int high = this.list.length-1;
		int low = 0;
		for (int j=low; j<high-1;j++){
			for (int i=low ;i<high-1;i++){

				if (list[i]>list[i+1]){
					this.lineSwap(i, i+1);
				}
				if (list[high-i]<list[high-i-1]){
					this.lineSwap(high-i, high-i-1);
				}
			}
		}
	}

	public void dualBubbleSort(int low, int high){
		Thread fB = null, rB = null;


		fB = new Thread(){
			public void run(){
				bubbleSort(0, list.length);
			}
		};
		rB = new Thread(){
			public void run(){
				revBubbleSort(0, list.length);
			}
		};
		fB.start();
		rB.start();
		try{
			fB.join();
			rB.join();
		} catch(InterruptedException e){
			
		}
		clearLines();
		drawLines();
	}

	public void quickSort(){
		int low = 0;
		int high = list.length;
		if (low < high){
			quickSort(0, this.list.length-1);
		}
	}

	public void quickSort(int low, int high){
		int left = low,right = high;
		int pivot = list[left+(right-left)/2];
		while(left<right){
			while(list[left]<pivot){
				left++;
			}
			while(list[right]>pivot){
				right--;
			}
			if (left <= right) {
				int leftNum = list[left];
				int rightNum = list[right];
				lineSwap(left, right);
				left++;
				right--;
			}
		}
		if(low<right){
			quickSort(low, right);
		}
		if(left<high){
			quickSort(left, high);
		}
	}

	public void swap(int i, int j)
	{
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}

	public void lineSwap(int i, int j){
		int temp = 0;
		Graphics pen = this.aPanel.getGraphics();
		Color Back = this.aPanel.getBackground();
		Color Foreground = this.aPanel.getForeground();
		pen.setColor(Back);
		int panelHeight=aPanel.getHeight();
		pen.drawLine(i, panelHeight, i, panelHeight-list[i]);
		pen.drawLine(j, panelHeight, j, panelHeight-list[j]);
		temp = list[i];
		list[i] = list[j];
		list[j] = temp;
		pen.setColor(Foreground);
		pen.drawLine(i, panelHeight, i, panelHeight-list[i]);
		pen.drawLine(j, panelHeight, j, panelHeight-list[j]);
	}

	public void drawLines(){
		Graphics pen = this.aPanel.getGraphics();
		int panelHeight=aPanel.getHeight();
		for (int i=0;i<list.length;i++){
			pen.drawLine(i, panelHeight, i, panelHeight-list[i]);
		}
	}

	public void clearLines(){
		Graphics pen = this.aPanel.getGraphics();
		Color Back = this.aPanel.getBackground();
		Color Foreground = this.aPanel.getForeground();
		pen.setColor(Back);
		int panelHeight=aPanel.getHeight();
		for (int i=0;i<list.length;i++){
			pen.drawLine(i, panelHeight, i, panelHeight-list[i]);
		}
		pen.setColor(Foreground);
	}
}
