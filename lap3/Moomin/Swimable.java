package Moomin;
import places.*;

public interface Swimable {
    default void swim(ShallowRiver r) {
        System.out.println(this.toString() + " like a dog swam dowm the river.");
        if ((r.getIntensity().equals(Intensity.STRONG)) && (this instanceof moomin)) {
            ((moomin) this).setState(State.UNCERTAIN);
        }
    }

    default void swimUsingTail(ShallowRiver r) {
        System.out.println(this.toString() + " using tail.");
    }
}
