package Moomin;
import places.ShallowRiver;
import places.Shoal;

public interface lookforShoal {
    default boolean lookatShoal(ShallowRiver r) {
        Shoal a = r.getShoal();
        if (a != null) {
            System.out.println(this.toString() + " saw " + a.toString());
            return true;
        }
        else {
            System.out.println(this.toString() + "did not see the shoal.");
            return false;
        }
    }
}
