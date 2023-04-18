import mypackage.Human;

class carOwner extends Human {
    private car car1;

    public carOwner(String name, int age, car car1) {
        super(name, age);
        this.car1 = car1;
    }

    public static void drive(car car1) {
        if (car1.isOn = true) {
            System.out.println("Vroom vroom! bruv ");
        } else {
            System.out.println("Start the car first bruv ");
        }
        System.out.println("Vroom vroom! bruv ");
    }
    // command to congiure git
    // git config --global user.name "username"

}