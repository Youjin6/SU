package code.wk5;

/**
 * RectangleTest class tests the Generic Rectangle class.
 * @author
 * @version
 */
public class RectangleTest {
   public static void main(String[] args) {
      // create double and integer Rectangles
      Rectangle<Double> rectD = new Rectangle<>(1.2, 3.4);
      Rectangle<Integer> rectI = new Rectangle<>(4, 5);

      // print info
      System.out.println("double rectangle: " + rectD);
      System.out.println("integer rectangle: " + rectI);
   }
} 