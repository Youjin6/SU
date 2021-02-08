package code.wk5;

/**
 * Rectangle class - Generic version
 * @author
 * @version
 */
public class Rectangle<T>
{
   private T length;
   private T width;

   /**
    * Constructor
    * @param len The length of the rectangle.
    * @param w The width of the rectangle.
    */
   public Rectangle(T len, T w)
   {
      length = len;
      width = w;
   }

   /**
    * The setLength method stores a value in the length field.
    * @param len The value to store in length.
    */
   public void setLength(T len)
   {
      length = len;
   }

   /**
    * The setWidth method stores a value in the width field.
    * @param w The value to store in width.
    */
   public void setWidth(T w)
   {
      width = w;
   }

   /**
    * The getLength method returns a Rectangle object's length.
    * @return The value in the length field.
    */
   public T getLength()
   {
      return length;
   }

   /**
    * The getWidth method returns a Rectangle object's width.
    * @return The value in the width field.
    */  
   public T getWidth()
   {
      return width;
   }

   /**
    * The toString method returns the string representation of 
    * the Rectangle.
    * @return The length and width of the Rectangle.
    */  
   @Override
   public String toString()
   {
      StringBuilder sb = new StringBuilder();
      sb.append("length: ");
      sb.append(length);
      sb.append(", width: ");
      sb.append(width);
      return sb.toString();
   }
}
