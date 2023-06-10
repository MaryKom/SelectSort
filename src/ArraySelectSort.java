public class ArraySelectSort {
    private long[] a;
    private int nElements;

    public ArraySelectSort(int max) {
        a = new long[max];
        nElements = 0;
    }

    public void insert(long value) {
        a[nElements++] = value;
    }

    public void display() {
        for (int i = 0; i < nElements; i++) {
            System.out.println(a[i]);
        }
        System.out.println("");
    }

    public void SelectionSort() {
        int min, in;
        for (int out = 0; out < nElements - 1; out++) {
            min = out;
            for (in = out + 1; in < nElements; in++) {
                if (a[in] < a[out]) {
                    min = in;
                }
            }
            swap(out, min);
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
