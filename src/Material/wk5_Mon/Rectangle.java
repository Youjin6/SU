package Material.wk5_Mon;

public class Rectangle {
   private double length;
   private double width;

   public double getLength() {
      return length;
   }

   public double getWidth() {
      return width;
   }

   public void setLength(double length){
      this.length = length;
   }

   public void setWidth(double width) {
      this.width = width;
   }
   public double getArea() {
      return length * width;
   }
}
