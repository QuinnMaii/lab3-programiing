package places;

public class Shoal extends Floor {
    private Object object;

    public Shoal(){}

    public void addObject(Object o) {
        if (object == null) {
            object = o;
        }
    }

    public String toString() {
        if (object == null) {
            return " shoal";
        }
        return " shoal, and on it " + object.toString() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Shoal s = (Shoal) o;
        return s.object.equals(this.object);
    }

    @Override
    public int hashCode() {
        if (object == null) {
            return 0;
        }
        return object.hashCode();
    }
}
