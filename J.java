package Lab5_task3.task3;

public class J extends I {
    protected String j;

    public J(String s, X x) {
        super(s, x);
        this.j = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + j;
    }
}
