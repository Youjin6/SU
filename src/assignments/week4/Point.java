package assignments.week4;

public class Point <T extends Number>{
   private T xCoordinate;
   private T yCoordinate;

   public Point(T x, T y) {
      xCoordinate = x;
      yCoordinate = y;
   }

   public void setX(T x) {
      xCoordinate = x;
   }

   public T getxCoordinate() {
      return xCoordinate;
   }

   public void setxCoordinate(T xCoordinate) {
      this.xCoordinate = xCoordinate;
   }

   public T getyCoordinate() {
      return yCoordinate;
   }

   public void setyCoordinate(T yCoordinate) {
      this.yCoordinate = yCoordinate;
   }
}
