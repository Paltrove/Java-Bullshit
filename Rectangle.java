/* Programmer: Ethan Liberty
*  Purpose: To piss Mr.Simpson off with the amount of long lines of code and comments and to do rectangle things
*/
//creates the class
public class Rectangle {
	//creates public variables
	double length, width, height;
	//creates a useless method
	public Rectangle() {
	//closes the method
	}
	//creates method to get length
	public double getLength() {
		//returns length
		return length;
	//closes the method
	}
	//creates method to set length
	public void setLength(double length) {
		//sets the length
		this.length = length;
	//closes the method
	}
	//creates method to get width
	public double getWidth() {
		//returns width
		return width;
	//closes the method
	}
	//creates method to set width
	public void setWidth(double width) {
		//sets the width
		this.width = width;
	//closes the method
	}
	//creates method to get height
	public double getHeight() {
		//returns height
		return height;
	//closes the method
	}
	//creates method to set height
	public void setHeight(double height) {
		//sets the height
		this.height = height;
	//closes the method
	}
	//creates method to get the volume
	public double getVolume(){
		//calculates the volume
		return this.getHeight()*this.getLength()*this.getWidth();
	//closes the method
	}
	//creates method to get the surface area
	public double getSurfaceArea(){
		//calculates the surface area
		return (2*(this.getHeight()*this.getLength()))+(2*(this.getHeight()*this.getWidth()))+(2*(this.getLength()*this.getWidth()));
	//closes the method
	}
	//creates method to get the diagonal
	public double getDiagonal(){
		//calculates the diagonal
		return Math.round(Math.sqrt(Math.pow(this.getHeight(), 2)+Math.pow(this.getLength(), 2)+Math.pow(this.getWidth(), 2)));
	//closes the method
	}
	//creates new method to test
	public boolean equals(Object a){
		//creates a test thing
		Rectangle testObj = (Rectangle)a;
		//if this do that
		if (testObj.getLength() == length){
			//if this do that
			if (testObj.getWidth() == width){
				//if this do that
				if (testObj.getHeight() == height){
					//returns true
					return (true);
				//closes the if
				}
				//else do this
				else{
					//returns false
					return(false);
				//closes the else
				}
			//closes the if
			}
			//else do this
			else{
				//returns false
				return(false);
			//closes the else
			}
		//closes the if
		}
		//else do this
		else{
			//returns false
			return(false);
		//closes the else
		}
	//closes the method
	}
	//creates a method to combines outputs
	public String toString(){
		//creates variable for output
		String myOutput = "";
		//adds length to the output
		myOutput += "The length is "+ this.getLength()+"\n";
		//adds width to the output
		myOutput += "The width is "+ this.getWidth()+"\n";
		//adds height to the output
		myOutput += "The height is "+ this.getHeight()+"\n";
		//adds surface area to the output
		myOutput += "The surface area is "+ this.getSurfaceArea()+"\n";
		//adds volume to the output
		myOutput += "The volume is "+ this.getVolume()+"\n";
		//adds diagonal to the output
		myOutput += "The diagonal is "+ this.getDiagonal()+"\n";
		//returns output
		return myOutput;
	//closes the method
    }
	

	//creates new main method
	public static void main(String[] args) {
		//creates a new rectangle
		Rectangle a = new Rectangle();
		//sets the height
		a.setHeight(2);
		//sets the length
		a.setLength(2);
		//sets the width
		a.setWidth(2);
		//creates a new rectangle
		Rectangle b = new Rectangle();
		//sets the height
		b.setHeight(4);
		//sets the length
		b.setLength(2);
		//sets the width
		b.setWidth(2);
		
		/*
		 * Testing the equality of two rects with sames dimensions.
		 */
		
		System.out.println("Testing if they are equal:");
		System.out.println("a has this:");
		System.out.println(a);
		
		
		System.out.println("b has this:");
		System.out.println(b);
		
		System.out.println("We should be equal ie true.");
		//print the toString
		System.out.println(a.equals(b));
	//closes the method
	}
//closes the class
}