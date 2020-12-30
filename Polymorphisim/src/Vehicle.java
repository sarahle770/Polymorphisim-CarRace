/**
 * This file is a part of Polymorphisim project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public abstract class Vehicle {
    private final String factureName;
    private final String frameNumber;

    public Vehicle(String factureName, String frameNumber) {
        this.factureName = factureName;
        this.frameNumber = frameNumber;
    }

    public String getFactureName() {
        return factureName;
    }

    public String getFrameNumber() {
        return frameNumber;
    }
}
