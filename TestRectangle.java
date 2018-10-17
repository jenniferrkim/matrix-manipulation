/**
 * This program allows the user to test their Rectangle object code.
 * @author Joanna Klukowska
 * @version March 21, 2016
 *
 */

public class TestRectangle {

	public static void main(String[] args) {
		// c r e a t e a d e f a u l t R e c t a n g l e o b j e c t
		Rectangle rec1 = new Rectangle () ;
		System.out.printf("rectangle 1:" 
				+ "\n %-12s %.3f x %.3f"
				+ "\n %-12s %.3f"
				+ "\n %-12s %.3f\n\n",
				"dimensions:", rec1.getWidth() , rec1.getHeight(),
				"area:", rec1.getArea(), "perimeter:", rec1.getPerimeter());
		
		// c r e a t e a d e f a u l t R e c t a n g l e o b j e c t
		// a n d t h e n s e t v a l u e s of w i d t h a n d h e i g h t
		Rectangle rec2 = new Rectangle () ;
		rec2.setWidth(3.33333333);
		rec2.setHeight(5.1);
		System.out.printf("rectangle 2:"
				+ "\n %-12s %.3f x %.3f"
				+ "\n %-12s %.3f"
				+ "\n %-12s %.3f\n\n",
				"dimensions:", rec2.getWidth() , rec2.getHeight(),
				"area:", rec2.getArea(), "perimeter:", rec2.getPerimeter());
		
		// c r e a t e a R e c t a n g l e o b j e c t u s i n g 2 - p a r a m c o n s t r u c t o r
		Rectangle rec3 = new Rectangle (13.7, 2.3) ;
		System.out.printf("rectangle 2:"
				+ "\n %-12s %.3f x %.3f"
				+ "\n %-12s %.3f"
				+ "\n %-12s %.3f\n\n",
				"dimensions:", rec3.getWidth() , rec3.getHeight(),
				"area:", rec3.getArea(), "perimeter:", rec3.getPerimeter());
	}

}
