package normalPattern;

public abstract class Pokemon {
    public void introduce() {
        name();
        attack();
        passive();
    }
    abstract void name();
    abstract void attack();
    abstract void passive();
}
