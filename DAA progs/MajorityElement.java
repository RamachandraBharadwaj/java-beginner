public class MajorityElement {
    
    public static int findMajorityElement(int[] arr) {
        return majorityElementRec(arr, 0, arr.length - 1);
    }

    // Recursive function to find the majority element in the range [low...high]
    private static int majorityElementRec(int[] arr, int low, int high) {
        // Base case: if there is only one element
        if (low == high) {
            return arr[low];
        }

        // Divide the array into two halves
        int mid = low + (high - low) / 2;

        // Find the majority element in the left half and right half
        int leftMajority = majorityElementRec(arr, low, mid);
        int rightMajority = majorityElementRec(arr, mid + 1, high);

        // If both halves agree on the majority element, return it
        if (leftMajority == rightMajority) {
            return leftMajority;
        }

        // Otherwise, count occurrences of leftMajority and rightMajority in the whole range
        int leftCount = countInRange(arr, leftMajority, low, high);
        int rightCount = countInRange(arr, rightMajority, low, high);

        // Return the one with the higher count
        return leftCount > rightCount ? leftMajority : rightMajority;
    }

    // Helper function to count the occurrences of `element` in `arr[low...high]`
    private static int countInRange(int[] arr, int element, int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (arr[i] == element) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int majorityElement = findMajorityElement(arr);
        System.out.println("Majority Element: " + majorityElement);
    }
}
