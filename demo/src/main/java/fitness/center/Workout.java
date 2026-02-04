package fitness.center;

public class Workout extends Activity {

    public Workout(double intensity, double duration) {
        super(intensity, duration);
    }

    @Override
    public double calories(double weight) {
        return intensity * duration * (weight / 70.0);
    }
}

