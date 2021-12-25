package places;

public class ShallowRiver extends River {
    private Floor floor = new Floor();
    private Shoal shoal = null;
    private Temperature temperature;
    private Intensity intensity;

    public ShallowRiver(Temperature t, Intensity i, boolean hasShoal) {
        super(t, i);
        if (hasShoal) {
            shoal = new Shoal();
        }
    }

    public void touchFloor(Object o) {
        floor.touch(o);
    }

    public Shoal getShoal() {
        return shoal;
    }

    public void addObject(Object o) {
        shoal.addObject(o);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        ShallowRiver r = (ShallowRiver) o;
        if (this.shoal == null) {
            if (r.shoal == null) {
                return this.temperature.equals(r.temperature) && this.intensity.equals(r.intensity);
            }
            else {
                return false;
            }
        }
        return this.temperature.equals(r.temperature) && this.intensity.equals(r.intensity) && this.shoal.equals(r.shoal);
    }

    @Override
    public int hashCode() {
        return temperature.hashCode() & intensity.hashCode() & shoal.hashCode();
    }
}
