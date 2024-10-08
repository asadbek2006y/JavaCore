package Enum;

enum Planet {
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8);

    int number;

    // Constructor for the enum
    Planet(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

public class Main {
    public static void main(String[] args) {
        Planet myPlanet = Planet.EARTH;
        canILiveHere(myPlanet);
    }

    static void canILiveHere(Planet myPlanet) {
        switch (myPlanet) {
            case EARTH: // Fixed 'catch' to 'case'
                System.out.println("You can live here!"); // Fixed 'SySystem' to 'System'
                break;
            default:
                System.out.println("You cannot live here."); // Handle other planets
        }
    }
}
