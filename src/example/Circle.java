// equals and compareTo


package example;


public class Circle implements Comparable<Circle> {
	
	  // instance variable
	  protected float radius;
	  // static variable
	  protected static final float PI = 3.14f;
      
	  
	  
	  public Circle(float radius) {
		    this.radius = radius;
	  }    
    
  
	  
	  
	  
	  // Precondition: circle != null
	  // Returns true if the circles have the same radius;
	  // otherwise, returns false.
	  public boolean equals(Circle circle) {
		    if (this.radius == circle.radius)
		    	return true;
		    else
		    	return false;
	  }
  
  
	  
	  
	  // Precondition: o != null
	  // Returns a negative integer, zero, or a positive integer as this Circle 
	  // is less than, equal to, or greater than the parameter Circle.  
	  public int compareTo(Circle o) {
		    if (this.radius < o.radius)
		    	return -1;
		    else
			      if (this.radius == o.radius)
			    	  return 0;
		      else
		    	  return 1;
	  }
	       
	  
	  
	  // Returns perimeter of this figure.	//perimeter= circumference 
	  public float perimeter() {
	    return(2 * PI * radius);
	  }
	  
	  
	  
	  
	  // Returns area of this figure.  
	  public float area() {
		  return(PI * radius * radius);
	  }
	  
	  
}
