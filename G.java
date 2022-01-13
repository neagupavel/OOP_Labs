package Lab5_task3.task3;

public class G extends F {
    protected String g;

    public G(String s, X x) {
        super(s, x);
        this.g = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + g;
    }
}