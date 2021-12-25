package places;

public class Floor {
    public Floor() {}

    public void touch(Object o) {
        System.out.println(o.toString() + " touch the bottom.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() { return 1; }

    @Override
    public String toString() { return "floor"; }
}
