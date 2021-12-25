package places;

public abstract class River {
    private Intensity intensity;
    private Temperature temperature;

    public River(Temperature t, Intensity i) {
        this.temperature = t;
        this.intensity = i;
    }

    public String toString() {
        return "water was " + temperature.describe() + ", and eletric was " + intensity.describe() + ".";
    }

    public Intensity getIntensity () {
        return this.intensity;
    }

}