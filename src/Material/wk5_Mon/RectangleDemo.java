package Material.wk5_Mon;

public class RectangleDemo {
   public static void main(String[] args) {
      Rectangle box = new Rectangle();

      box.setWidth(20.0);
      box.setLength(10.0);

      System.out.println("The box's length is: " + box.getLength());
      System.out.println("The box's width is: " + box.getWidth());
      System.out.println("The box's area is: " + box.getArea());
   }
}
