package Lab5_task3.task3;

public class B extends A {
    protected String b;

    public B(String s, X x) {
        super(s, x);
        this.b = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + b;
    }
}