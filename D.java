package Lab5_task3.task3;

public class D extends C {
    protected String d;
    protected X x = new X("ddd");

    public D(String s, X x) {
        super(s, x);
        this.d = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + d;
    }
}
