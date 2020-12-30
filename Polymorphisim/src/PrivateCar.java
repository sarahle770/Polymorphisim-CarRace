/**
 * This file is a part of Polymorphisim project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class PrivateCar extends Vehicle implements RaceCompetitor {
    private int distance;

    //constructor matching super
    public PrivateCar(String factureName, String frameNumber) {
        super (factureName, frameNumber);
    }


    @Override
    public int getDistance() {
        return distance = (int) (Math.random () * 11);
    }

    @Override
    public int getCompetitionNumber() {
        return 45;
    }

    @Override
    public String toString() {
        return "PrivateCar: " + "\n" +
                "Distance: " + distance + "\n" + "FactureName: " + getFactureName ();
    }
}
