import carParts.Wheels;
import carParts.carBody;
import carParts.engine;

class car {
    private String name;
    private engine engine1;
    private carBody carBody1;
    private Wheels wheel1;
    private int mileage;
    public static boolean isOn;

    public car(String name, engine engine1, carBody carBody1, Wheels wheel1, int mileage) {
        this.name = name;
        this.engine1 = engine1;
        this.carBody1 = carBody1;
        this.wheel1 = wheel1;
        this.mileage = mileage;



    }

    public static void turnOn(){
        isOn = true;
        System.out.println("Kachichichichi Vroooom!! bruv ");
    }

}