package Moomin;
import places.*;

public class moomin implements Swimable, lookforShoal {
    private String name = "moomin";
    private State state = State.NEUTRAL;
    private ShallowRiver river = null;

    public moomin(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public void setState(State s) {
        this.state = s;
        System.out.println(this.name + " in state " + s.describe() + ".");
    }

    public void enterRiver(ShallowRiver r) {
        this.river = r;
        System.out.println(this.toString() + " enter the river.");
        System.out.println(r.toString());
    }

    public void swim() {
        this.swim(river);
    }

    public void swimUsingTail() {
        this.swimUsingTail(river);
    }

    public boolean lookforShoal() {
        return this.lookatShoal(river);
    }

    public void touch() {
        river.touchFloor(this);
        this.setState(State.NEUTRAL);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        moomin m = (moomin) o;
        if (this.river == null) {
            if (m.river == null) {
                return this.name.equals(m.name) && this.state.equals(m.state);
            }
            else {
                return false;
            }
        }
        return this.name.equals(m.name) && this.state.equals(m.state) && (this.river).equals(m.river);
    }

    @Override
    public int hashCode() {
        return name.hashCode() & state.hashCode() & river.hashCode();
    }
}
