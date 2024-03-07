class laptop{
    private String model;
    private double price;

    public laptop(String model, double price){
        this.model = model;
        this.price = price;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void  setPrice(double price){
        this.price= price;
}
public String toString(){
    return " model "+model+" Price: $ "+price;
}

public class main {
    public static void main (String[] args)
    {
        laptop l1 = new laptop("Macbook Pro",2500);
        l1.setModel("Macbook air");
        System.out.println(l1.toString());
    }

}
}
