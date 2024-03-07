public class Rectangle {
    private  double length;
    private double width;

    public Rectangle(double length, double width)
    {
        this.length=length;
        this.width=width;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length=length;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }

    public double area()
    {
        return length*width;
    }
    public double perimeter()
    {
        return 2*(length+width);
    }
    public static void main(String[] args) 
    {
        Rectangle q= new Rectangle(17.0,11.5);        
        System.out.println("length :" + q.getLength());
        System.out.println("width :"+ q.getWidth());
        System.out.println("area = "+ q.area());
        System.out.println("perimeter = "+ q.perimeter());
    }
}
