/**
 * This program designs a class named Rectangle to represent a rectangle.
 * @author YunSeo (Jennifer) Kim
 * @version March 21, 2016
 *
 */

class Rectangle {
	private double width; 
	private double height;

	/**
	 * This program creates a no args constructor for the default rectangle.
	 * no param, no return
	 */
	//no args constructor for default rectangle
	Rectangle() {
		width = 0;
		height = 0;
	}
	
	/**
	 * This program creates a constructor that creates a rectangle with a specified width and height.
	 * @param newWidth
	 * @param newHeight
	 */
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	/**
	 * This program is a setter method to modify width.
	 * @param newWidth
	 */
	void setWidth (double newWidth) {
		width = newWidth;
	}
	
	/**
	 * This program is a setter method to modify height.
	 * @param newHeight
	 */
	void setHeight (double newHeight) {
		height = newHeight;
	}
	
	/**
	 * This program is a getter method to modify width.
	 * @return width of the rectangle
	 */
	public double getWidth(){
		return width;
	}
	
	/**
	 * This program is a getter method to modify height.
	 * @return height of rectangle
	 */
	public double getHeight(){
		return height;
	}
	
	/**
	 * This program returns the area of the rectangle.
	 * @return area of rectangle
	 */
	double getArea() {
		return width * height;
	}
	
	/**
	 * This program returns the perimeter of the rectangle.
	 * @return perimeter of the rectangle
	 */
	double getPerimeter() {
		return (2 * width) + (2+ height);
	}
}


