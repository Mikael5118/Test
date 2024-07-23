package inclass;

public class Car {
    int maxSpeed;
    int currentSpeed;
    String color;
    int gear;
    String model;
    int horsePower;
    Person owner;
    double price;
    boolean isSportCar;


    Car(String model, boolean isSportCar, String color) {
        this.model = model;
        this.isSportCar = isSportCar;
        this.color = color;
        this.currentSpeed = 10;
        this.gear = 1;
    }

    Car(String model, boolean isSportCar, String color, double price, int maxSpeed) {
        this(model, isSportCar, color);
        this.price = price;
        this.maxSpeed = maxSpeed;
    }



    void changeGear(int gear) {
        if(gear <= 5 && gear >= 1) {
            this.gear = gear;
        } else {
            System.out.println("Gear is only allowed between 1 and 5, but you want: " + gear);
        }
    }

    void accelerate() {
        if(this.currentSpeed >= 60) {
            System.out.println("you are driving too fast, your speed is " + currentSpeed);
        }
        this.currentSpeed = this.currentSpeed + 10;
    }

    void changeGearUp(){
        if(this.gear < 5) {
            this.gear++;
            System.out.println("Gear changed to: " + this.gear);
        } else {
            System.out.println("Gear is only allowed between 1 and 5. Current gear is " + gear);
        }
    }




}
