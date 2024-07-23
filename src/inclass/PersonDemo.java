package inclass;

public class PersonDemo {
    public static void main(String[] args) {
        Person silvia = new Person(20, "Silvia Ivanova");
        System.out.println(silvia.age);
        System.out.println(silvia.name);

        Person galina = new Person();

        System.out.println(silvia);
        System.out.println(galina);

        galina = silvia;

        System.out.println(silvia);
        System.out.println(galina);

        Car bmw = new Car("X1", false, "Red");
        Car bmw1 = new Car("X1", false, "Red");
        Car bmw2 = new Car("X1", false, "Red");
        Car bmw3 = new Car("X1", false, "Red");

        Car moskvich = new Car("12-ka", true, "Black");

        Car kia = new Car("Sportage", true, "White");


        bmw1.changeGear(3);

        kia.changeGear(4);
        moskvich.changeGear(2);
        bmw.changeGear(5);

        kia.accelerate();
        kia.accelerate();
        kia.accelerate();
        moskvich.accelerate();
        bmw.accelerate();

        System.out.println(kia.currentSpeed);
        System.out.println(kia.gear);

    }


}
