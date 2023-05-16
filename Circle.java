
public class Circle {
	
	double radius, angle;
    public Circle(){	//sets up new circle
        this.radius = 1;
        this.angle = 1;
    }
    public Circle(double radius, double angle){
		//Creates New Circle
		this.setRadius(radius);
		this.setAngle(angle);
	}
    public void setRadius(double r){	//sets the radius of the circle
        this.radius = r;
    }
    public double getRadius(){	//gets the radius of the circle
        return this.radius;
    }
    public void setAngle(double a){	//sets the angle of the circle
        this.angle = a;
    }
    public double getAngle(){	//gets the angle of the circle
        return this.angle;
    }
    public double getArea(){	//gets the area of the circle
    	double area = this.getRadius() + this.getRadius() * Math.PI;
    	return area;
    }
    public double getPerimeter(){	//gets the perimeter of the circle
    	double perimeter = 2 * Math.PI * this.getRadius();
    	return perimeter;
    }
    public double getArcLength(){	//gets the arc length of the circle
    	double arcLength = this.getAngle() * Math.PI / 180 * this.getRadius();
    	return arcLength;
    }
    public double getSector(){	//gets the sector of the circle
    	double sector = this.getAngle() / 360 * this.getArea();
    	return sector;
    }
    public String toString(){	//combines the radius with the angle
		String myOutput = "";
		myOutput += "The Radius is "+ this.getRadius();
		myOutput += ", and the Angle is "+ this.getAngle();
		return myOutput;
    }
    public boolean equals(Object a){
		//creates a test thing to see if answers right
		Circle testObj = (Circle)a;
		if (testObj.getRadius() == radius){
			if (testObj.getAngle() == angle){
				return(true);
			}
			else{
				return(false);
			}
		}
		else{
			return(false);
		}
	}

	public static void main(String[] args) {
		Circle a = new Circle();	//creates new circle
		a.setRadius(2);	//sets the circles radius to whats in the brackets
		a.setAngle(30);	//sets the circles angle to whats in the brackets
		System.out.println(a);	//prints the toString
		System.out.println("The area is  "+a.getArea());	//prints area
		System.out.println("The perimeter is  "+a.getPerimeter());	//prints perimeter
		System.out.println("The arc length is  "+a.getArcLength());	//prints arc length
		System.out.println("The sector is  "+a.getSector());	//prints sector
	}

}
