import java.util.Scanner;
public class TestLab4
{
    public class Circle 
    {
        private double radius;
        private String color;
        private double area;

        public Circle(double radius, String color, double area) 
        {
            super();
            this.radius = radius;
            this.color = color;
            this.area = area;
        }

        public double getRadius() 
        {
            return radius;
        }

        public double setRadius(double radius)
        {
            return this.radius= radius;
        }

        public String getColor()
        {
            return color;
        }

        public String setColor(String color)
        {
            return this.color= color;
        }

        public double getArea() 
        {
            return area;
        }

        public String toString()
        {
            return radius+","+ color+", "+ area; 
        }
    }
    
    public class Cylinder extends Circle
    {
        private double height;
        public double volume;
        public Cylinder(double radius, String color, double area, double height)
        {
            super(radius, color, area);
            this.height = height;   
        }
    
        public double getHeight(double height) 
        {
            return height;
        }
        public double setHeight() 
        {
            return this.height;
        }
        public double getVolume()
        {
            return getArea()*height;
        }  
        public class Circle_Cylinder 
        {
            public static void main(String[] args)
	       {
		      Cylinder input = new Cylinder(2.3 , " Red ", 4.2 ,  7.6);  
		      System.out.println(input.toString()+", "+input.setHeight());
              System.out.println(input.getVolume());
	       }
        }
    }
}