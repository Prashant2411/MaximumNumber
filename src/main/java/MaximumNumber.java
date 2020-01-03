import java.util.Arrays;

public class MaximumNumber < E extends Comparable> {
    E[] a;

    public MaximumNumber(E ...a) {
        this.a = a;
    }

    public MaximumNumber() {
    }

    public < E extends Comparable > E getMaximum(E ...a) {
        Arrays.sort(a);
        printMax(a[a.length-1]);
        return a[a.length-1];
    }


    public E testMaximum() {
        E max = getMaximum(a);
        return max;
    }

    private <E> void printMax(E max) {
        System.out.println(max);
    }
}