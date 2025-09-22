
class Processor {

    String generation;
    String ram;
    double clockSpeed;
    String name;

    Processor() {
        super();
    }

    Processor(String generation, String ram,
            double clockSpeed, String name) {
        super();
        this.clockSpeed = clockSpeed;
        this.generation = generation;
        this.ram = ram;
        this.name = name;
    }

    // copy constructor
    Processor(Processor oldMobile) {
        super();
        this.generation = oldMobile.generation;
        this.ram = oldMobile.ram;
        this.clockSpeed = oldMobile.clockSpeed;
        this.name = oldMobile.name;
    }

    // showing the data
    public void displayProcessor() {
        System.out.println("PROCESSOR DETAILS \n");
        System.out.println("name is " + name);
        System.out.println("generation is " + generation);
        System.out.println("ram is " + ram);
        System.out.println("ClockSpeed is " + clockSpeed);
    }
}

// class mobile
class Mobile extends Processor {

    String brand;
    String model;
    double price;
    Processor processor; // non primitve reference data type Processor

    Mobile(String brand, String model, double price, Processor processor) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.processor = processor;
    }

    // copy constructor
    Mobile(Mobile oldMobile) {
        super(new Processor(oldMobile.processor)); // for deep copy make here new object of processors
        this.brand = oldMobile.brand;// data copied from old to new
        this.model = oldMobile.model;
        this.price = oldMobile.price;
        this.processor = oldMobile.processor; // reference sharing only

    }

    public void displayMobile() {
        System.out.println("brand name is " + brand);
        System.out.println("model name is " + model);
        System.out.println("price name is " + price);
        processor.displayProcessor();
    }

}

public class MobileDriver {

    public static void main(String[] args) {

        Mobile mobile = new Mobile("Apple", "17AIR", 139000,
                // passing for the parent one
                new Processor("A19", "8", 2.20, "iphone 17"));

        mobile.displayMobile();

        Mobile copy1 = new Mobile(mobile);
        copy1.model = "18 pro";
        copy1.price = 4500;
        copy1.displayMobile();

        System.out.println("-------------------- ");

        copy1.processor.clockSpeed = 0;
        copy1.displayMobile();
        mobile.displayMobile();
    }

}