public class point {
    private double x;
    private double y;

    public point(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }
    public point(point other)
    {
        this.x=other.getX();
        this.y=other.gety();
    }
    public double getX()
    {
        return x;
    }
    public void setX(double X)
    {
        this.x=x;
    }
    public double gety()
    {
        return y;
    }
    public void setY(double Y)
    {
        this.y =y;
    }
    public static void main(String[] args) {
        point p1 = new point(3,4);
        point p2= new point(p1);
        System.out.println("point p1: ("+p1.getX() + "," + p1.gety()+")");
        System.out.println("point p2: ("+p2.getX() + "," + p2.gety()+")");
        p1.setX(5);
        System.out.println("after modyfying p1:");
        System.out.println("point p1: ("+p1.getX() + "," + p1.gety()+")");
        System.out.println("point p2: ("+p2.getX() + "," + p2.gety()+")");
    }
}
