/**
 * This file is a part of Polymorphisim project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class SportCar extends Vehicle implements RaceCompetitor {
    private int distance;

    public SportCar(String factureName, String frameNumber) {
        super (factureName, frameNumber);
    }

    @Override
    public int getDistance() {
        //I could of just return distance with no value
        return distance = (int) (Math.random () * 11);
    }

    @Override
    public int getCompetitionNumber() {
        return 77;
    }

    @Override
    public String toString() {
        return "SportCar: " + "\n" +
                "Distance: " + distance + "\n" + "factureName: " + getFactureName ();
    }
}
