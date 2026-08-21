package Core_Java.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Common array patterns frequently used in coding interviews.
 * Run this class to see a small example for every pattern.
 */
public class Array_Interview_Patterns {

    public static void main(String[] args) {
        System.out.println("Two sum indices: " + Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println("Maximum sum of 3 consecutive elements: "
                + maxSumOfKElements(new int[]{2, 1, 5, 1, 3, 2}, 3));
        System.out.println("Subarrays with sum 3: " + countSubarraysWithSum(new int[]{1, 2, 1, 2, 1}, 3));
        System.out.println("Maximum subarray sum: " + maxSubarraySum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

        int[] colors = {2, 0, 2, 1, 1, 0};
        sortZeroOneTwo(colors);
        System.out.println("Dutch national flag sort: " + Arrays.toString(colors));

        System.out.println("Search in sorted array (target 7): "
                + binarySearch(new int[]{1, 3, 5, 7, 9}, 7));
    }

    // 1. Hash map / complement lookup: Two Sum in O(n) time and O(n) space.
    public static int[] twoSum(int[] numbers, int target) {
        requireArray(numbers, "numbers");
        Map<Integer, Integer> indexByValue = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (indexByValue.containsKey(complement)) {
                return new int[]{indexByValue.get(complement), i};
            }
            indexByValue.put(numbers[i], i);
        }
        return new int[0]; // No pair found.
    }

    // 2. Sliding window: fixed-size subarray problems in O(n) time, O(1) space.
    public static int maxSumOfKElements(int[] numbers, int k) {
        requireArray(numbers, "numbers");
        if (k <= 0 || k > numbers.length) {
            throw new IllegalArgumentException("k must be between 1 and array length");
        }

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += numbers[i];
        }

        int maxSum = windowSum;
        for (int right = k; right < numbers.length; right++) {
            windowSum += numbers[right] - numbers[right - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    // 3. Prefix sum + frequency map: count subarrays with a target sum in O(n).
    public static int countSubarraysWithSum(int[] numbers, int target) {
        requireArray(numbers, "numbers");
        Map<Integer, Integer> prefixFrequency = new HashMap<>();
        prefixFrequency.put(0, 1);

        int prefixSum = 0;
        int count = 0;
        for (int number : numbers) {
            prefixSum += number;
            count += prefixFrequency.getOrDefault(prefixSum - target, 0);
            prefixFrequency.put(prefixSum, prefixFrequency.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }

    // 4. Kadane's algorithm: maximum-sum contiguous subarray in O(n), O(1) space.
    public static int maxSubarraySum(int[] numbers) {
        requireArray(numbers, "numbers");
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int currentSum = numbers[0];
        int bestSum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            currentSum = Math.max(numbers[i], currentSum + numbers[i]);
            bestSum = Math.max(bestSum, currentSum);
        }
        return bestSum;
    }

    // 5. Three pointers / Dutch National Flag: sort an array containing only 0, 1, and 2.
    // Time O(n), extra space O(1). Useful for in-place partitioning problems.
    public static void sortZeroOneTwo(int[] numbers) {
        requireArray(numbers, "numbers");
        int low = 0;
        int middle = 0;
        int high = numbers.length - 1;

        while (middle <= high) {
            if (numbers[middle] == 0) {
                swap(numbers, low++, middle++);
            } else if (numbers[middle] == 1) {
                middle++;
            } else if (numbers[middle] == 2) {
                swap(numbers, middle, high--);
            } else {
                throw new IllegalArgumentException("Array can contain only 0, 1, and 2");
            }
        }
    }

    // 6. Binary search: search a sorted array in O(log n) time.
    public static int binarySearch(int[] sortedNumbers, int target) {
        requireArray(sortedNumbers, "sortedNumbers");
        int left = 0;
        int right = sortedNumbers.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2; // Avoids integer overflow.
            if (sortedNumbers[middle] == target) {
                return middle;
            }
            if (sortedNumbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    private static void swap(int[] numbers, int first, int second) {
        int temporary = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = temporary;
    }

    private static void requireArray(int[] numbers, String parameterName) {
        if (numbers == null) {
            throw new IllegalArgumentException(parameterName + " must not be null");
        }
    }
}
