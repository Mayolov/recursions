public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 5, 8, 88, 99, 120, 133 };

        System.out.println(recursiveBinarySearch(numbers, 140));

    }

    public static int recursiveBinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        return recursiveBinarySearch(list, key, low, high);
    }

    private static int recursiveBinarySearch(int[] list, int key, int low, int high) {
        if (low > high) {
            // list has been exhausted without a match
            return -low - 1;
        }

        int mid = (low + high) / 2;
        if (key < list[mid]) {
            return recursiveBinarySearch(list, key, low, mid - 1);
        } else if (key == list[mid]) {
            return mid;
        } else {
            return recursiveBinarySearch(list, key, low + 1, high);
        }
    }
}
