package Lab5_task3.task3;

public class C extends B {
    protected String c;

    public C(String s, X x) {
        super(s, x);
        this.c = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + c;
    }
}
