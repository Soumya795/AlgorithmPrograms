public class InsertionSort {

    public static void main(String[] args) {
        String[] arr = {"Atlanta", "New York", "Dallas", "San Francisco","Omaha" };
        String[] sortedArray;
        sortedArray = sort_sub(arr, arr.length);
        for (String s : sortedArray) {
            System.out.println(s);
        }
    }

    public static String[] sort_sub(String[] array, int f) {
        var temp = "";
        for (int i = 0; i < f; i++) {
            for (int j = i + 1; j < f; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

