public class Main {
    public static void main(String[] args) {

        int maxSize = 100;
        ArraySelectSort arr = new ArraySelectSort(maxSize);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(22);
        arr.insert(88);

        arr.display();
        arr.SelectionSort();
        arr.display();
    }
}
