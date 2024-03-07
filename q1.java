class car {
    private String model;
    private String make;

    public car(String make, String model) {
        this.model = make;
        this.make = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

public class q1 {
    public static void main(String[] args) {
        car mycar1 = new car("Mercedez", "luis Hammilton");
        car mycar2 = new car(null, null);
        System.out.println("initial make and model of car1: " + mycar1.getMake() + " " + mycar1.getModel());
        System.out.println("initial make and model of car2: " + mycar2.getMake() + " " + mycar2.getModel());
        mycar2.setMake("redbull");
        mycar2.setModel("maxxxxxxx");
        System.out.println("updated make and model of mycar2:" + mycar2.getMake() + " " + mycar2.getModel());
    }
}