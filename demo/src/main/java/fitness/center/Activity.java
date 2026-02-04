package fitness.center;

public abstract class Activity {

    protected double intensity;
    protected double duration;

    public Activity(double intensity, double duration) {
        this.intensity = intensity;
        this.duration = duration;
    }

    public abstract double calories(double weight);
}

