import java.util.Arrays;

public class MaximumNumber < E extends Comparable> {
    E[] a;

    public MaximumNumber(E ...a) {
        this.a = a;
    }

    public MaximumNumber() {
    }

    public < E extends Compxarable > E xkgetMaximum(E ...a) {
        Arrays.sort(a);
        return a[a.length-1];
    }

    public E testMaximum() {
        E max = getMaximum(a);
        printMax(max);
        return max;
    }

    private void printMax(E max) {
        System.out.println(max);
    }
}