public class BinarySearch {
    public static int findTarget(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex < arr.length && endIndex >= 0) {
            int midIndex = (endIndex + startIndex)/2;
//            System.out.println("Mid index = "+midIndex);
//            System.out.println("Start index = "+startIndex);
//            System.out.println("End index = "+endIndex);
            if (arr[midIndex] == target) {
                return midIndex;
            } else if (arr[midIndex] < target) {
                startIndex = midIndex + 1;
            } else {
                endIndex = midIndex - 1;
            }
        }
        return -1;
    }
}
