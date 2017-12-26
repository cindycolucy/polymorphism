class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public Car(int cylinders, String name) {
        this.wheels = wheels;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine() {
        return "The car engine is starting.";
    }

    public String accelerate() {
        return "The car is accelerating.";
    }

    public String brake() {
        return "The car is braking.";
    }
}

class Fiat extends Car {
    public Fiat() {
        super(6, "Fiat");

    }

    @Override
    public String startEngine() {
        return "The " + getName() + " is starting up with " + getCylinders() + " cylinders.";
    }
}

class Prius extends Car {
    public Prius() {
        super(4, "Prius");
    }

    @Override
    public String accelerate() {
        return "The " + getName() + " is accelerating with " + getCylinders() + " cylinders.";
    }
}

class Flex extends Car {
    public Flex() {
        super(8, "Flex");
    }

    @Override
    public String brake() {
        return "The " + getName() + " is braking with " + getCylinders() + " cylinders.";
    }
}

    public class Base {

        public static void main(String[] args) {

            Car car = new Car(8, "Base car");
            System.out.println(car.startEngine());
            System.out.println(car.accelerate());
            System.out.println(car.brake());

            Fiat fiat = new Fiat();
            System.out.println(fiat.startEngine());

            Prius prius = new Prius ();
            System.out.println(prius.accelerate());

            Flex flex = new Flex ();
            System.out.println(flex.brake());


        }
    }


