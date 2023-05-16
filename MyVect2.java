/* Programmer: Ethan Liberty
*   Purpose: To make Mr. Simpson's eyes hurt from reading Math.Pow .... etc
*/
public class MyVect2 {
	double x;
	double y;
	double angleV1;
	public MyVect2() {
		//Creates Vector
		this.setX(1);
		this.setY(1);
		this.setAngleV1(0);
	}
	public MyVect2(double x, double y){
		//Creates New Vector From addVect
		this.setX(x);
		this.setY(y);
		this.setAngleV1(0);
	}
	public double getAngleV1() {
		//Gets The Angle
		return angleV1;
	}
	public void setAngleV1(double angleV1) {
		//Sets The Angle
		this.angleV1 = angleV1;
	}
	public double getX() {
		//Gets The X Value
		return x;
	}

	public void setX(double x) {
		//Sets The X
		this.x = x;
	}

	public double getY() {
		//Gets The Y
		return y;
	}

	public void setY(double y) {
		//Sets The Y
		this.y = y;
	}
	public MyVect2 addVect(MyVect2 v1, MyVect2 v2){
		//Adds 2 Vectors
		double newX = v1.getX() + v2.getX();
		double newY = v1.getY() + v2.getY();
		return new MyVect2(newX, newY);
	}
	public double getLength(){
		//Gets The Hypotnuse Of Vector Triangle
		double length = Math.round(Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2))) ;
		return length;
	}
	public double getAngle(){
		//Gets The Angle Of A Vector
		double angle = Math.round(Math.toDegrees(Math.acos(getX() / getLength())));
		return angle;
	}
	public double getAngleV1(MyVect2 v1,MyVect2 v2){
		//Gets The Angle Of Your 2 Vectors And Your New One
		MyVect2 result = addVect(v1, v2);
		double num = Math.pow(v1.getLength(), 2) + Math.pow(result.getLength(), 2) - Math.pow(v2.getLength(), 2);
		double den = 2 * v1.getLength() * result.getLength();
		double divide = num / den;
		angleV1 = Math.round(Math.toDegrees(Math.acos(divide)));
		return angleV1;
	}
	public String toString(){
		//Adds All Data From Multiple Strings To One
		String myOutput = "";
		myOutput += "X="+ this.getX();
		myOutput += ", Y="+ this.getY()+ "\n";
		myOutput += "Angle = "+ this.getAngle()+ "\n";
		myOutput += "Length = "+ this.getLength()+ "\n";
		return myOutput;
	}

	public static void main(String[] args) {
		//Creates Vector, Sets X And Y, Prints Information
		MyVect2 a = new MyVect2();
		MyVect2 b = new MyVect2();
		MyVect2 c = new MyVect2();
		a.setX(1);
		b.setX(-2);
		a.setY(1);
		b.setY(3);
		System.out.println("this is what v1 is: "+a);
		System.out.println("this is what v2 is: "+b);
		System.out.println("this is what v1 + v2 is: "+c.addVect(a, b));
		System.out.println("this is what v1 + v2 + v3 is: "+c.getAngleV1(a, b));
	}

}
