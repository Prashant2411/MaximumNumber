public class MaximumNumber < E extends Comparable> {
    E a,b,c;

    public MaximumNumber(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public MaximumNumber() {
    }

    public < E extends Comparable > E getMaximum(E a, E b, E c) {
        E max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public E testMaximum() {
        E max = getMaximum(a, b, c);
        return max;
    }
}