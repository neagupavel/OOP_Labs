package Lab5_task3.task3;

public class H extends G {
    protected String h;
    private X x = new X("hhh");

    public H(String s, X x) {
        super(s, x);
        this.h = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + h;
    }
}