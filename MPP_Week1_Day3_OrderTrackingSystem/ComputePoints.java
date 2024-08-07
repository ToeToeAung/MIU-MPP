package MPP_Week1_Day3_OrderTrackingSystem;

public abstract class ComputePoints implements IComputePoints {
    protected double points;

    @Override
    public abstract double getPoints();
}