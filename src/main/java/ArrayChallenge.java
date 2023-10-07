import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayChallenge {
    public static String arrayChallenge(int[] arr) {
        if (arr.length % 2 != 0) {
            return "-1";
        }
        int totalSum = Arrays.stream(arr).sum();
        if (totalSum % 2 != 0) {
            return "-1";
        }
        int targetSumInPart = totalSum / 2;
        Arrays.sort(arr);
        int firstPartIndex = 0;
        int secondPartIndex = arr.length - 1;
        boolean flag = true;
        List<Integer> set1 = new ArrayList<>();
        List<Integer> set2 = new ArrayList<>();
        while (firstPartIndex < secondPartIndex) {
            if (firstPartIndex + 1 == secondPartIndex) {
                int currentSum = set1.stream().mapToInt(Integer::intValue).sum();
                int difference = targetSumInPart - currentSum;
                if (difference == arr[firstPartIndex]) {
                    set1.add(arr[firstPartIndex++]);
                    set2.add(arr[secondPartIndex--]);
                } else {
                    set1.add(arr[secondPartIndex--]);
                    set2.add(arr[firstPartIndex++]);
                }
            } else if (flag) {
                set1.add(arr[firstPartIndex++]);
                set2.add(arr[firstPartIndex++]);
                flag = false;
            } else {
                set1.add(arr[secondPartIndex--]);
                set2.add(arr[secondPartIndex--]);
                flag = true;
            }
        }
        if (set1.size() != set2.size()) {
            return "-1";
        }
        set1.sort(Integer::compareTo);
        set2.sort(Integer::compareTo);
        StringBuilder result = new StringBuilder();
        for (Integer integer : set1) {
            result.append(integer).append(",");
        }
        for (Integer integer : set2) {
            result.append(integer).append(",");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}
