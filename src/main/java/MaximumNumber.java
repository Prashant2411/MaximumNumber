public class MaximumNumber < E extends Comparable> {
    E[] a;

    public MaximumNumber(E ...a) {
        this.a = a;
    }

    public MaximumNumber() {
    }

    public < E extends Comparable > E getMaximum(E ...a) {
        E max = a[1];
        for (int i=0; i < a.length-1; i++) {
            for (int j=0; j < a.length-i-1 ;j++) {
                if (a[j].compareTo(a[j+1]) > 0) {
                    E temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a[2];
    }

    public E testMaximum() {
        E max = getMaximum(a);
        return max;
    }
}