package Moomin;

public enum State {
    NEUTRAL, THINKING, UNCERTAIN;

    public String describe() {
        switch (this) {
            case THINKING:
                return "thinking";
            case UNCERTAIN:
                return "uncertain";
            default:
                return "neutral";
        }
    }
}