import Moomin.*;
import Objects.*;
import places.*;

public class lap3 {
    public static void main(String[] args) {
        moomin moomin = new moomin("Moomin-troll");
        ShallowRiver river = new ShallowRiver(Temperature.WARM, Intensity.STRONG, true);
        BlackObject hat = new BlackObject();
        river.addObject(hat);

        moomin.setState(State.THINKING);
        moomin.enterRiver(river);
        moomin.swim();
        boolean lookForShoal = moomin.lookforShoal();
        if (lookForShoal) {
            moomin.swimUsingTail();
            moomin.touch();
        }
    }
}
