public class RemoveElement {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6, 9 };
        int target = 4;

        int index = findIndex(arr, target);

    }

    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }

        return -1;
    }

    public static int[] removePartOfArray(int[] arr, int start, int end) {

    }
}