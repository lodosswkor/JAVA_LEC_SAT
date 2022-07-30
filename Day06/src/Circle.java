
public class Circle extends Shape {
	
	int r; 
	
	Circle(int r) {
		super("원"); 
		this.r = r; 
	}

	@Override 
	double area() {
		return r * r * Math.PI; 
	} 
	
	@Override
	double length() {
		return 2 * r * Math.PI;  
	}
	

}


class Rectangle extends Shape {
	
	int width, height; 
	Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height; 
	}
	
	@Override
	double area() {
		return width * height;
	}
	
	@Override
	double length() {
		return 2 * (width * height);
	}
	
	
}
