package Lab5_task3.task3;

public class A {
    protected String a;
    protected X x = new X("xxx");

    public A(String s, X x) {
        this.a = s;
        this.x = x;
    }

    @Override
    public String toString() {
        return x.toString() + " " + a;
    }
}
