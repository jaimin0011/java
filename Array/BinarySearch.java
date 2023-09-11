package Array;

public class BinarySearch {

    public static int binarySearch(int num[], int key) {
        int start = 0, end = num.length-1 ;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;  
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 4;
        System.out.println("index of key is : " + binarySearch(num, key));
    }
}