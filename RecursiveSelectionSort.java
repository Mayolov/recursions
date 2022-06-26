public class RecursiveSelectionSort {
    public static void main(String[] args) {
        double[] cars = { 1.0, 65, 3.2, 54.4, 32.2 };
        sort(cars);

        for (double car : cars)
            System.out.println(car);
    }

    public static void sort(double[] list) {
        // sort the entire list
        sort(list, 0, list.length - 1);
    }

    private static void sort(double[] list, int low, int high) {
        if (low < high) {
            // Find the smallest number and
            // its index in list[low .. high]
            int indexOfMin = low;
            double min = list[low];

            for (int i = low + 1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }
            }
            // Swap the smallest in list[low .. high]
            // with list[low]
            list[indexOfMin] = list[low];
            list[low] = min;
            // Sort the remaining list[low+1 .. high]
            sort(list, low + 1, high);
        }
    }
}
