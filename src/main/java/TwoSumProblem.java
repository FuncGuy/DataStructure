import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public static void main(String[] args) {
        int target = 7;
        int []numbers = {2, 3, 7, 4 ,8};

        System.out.println(Arrays.toString(getTwoSum(target, numbers)));
    }

    private static int[] getTwoSum(int target, int[] numbers) {

        Map<Integer, Integer> visitedNumbers = new HashMap<>();

        for(int i = 0; i < numbers.length;i++){

            int delta = target - numbers[i];

            if(visitedNumbers.containsKey(delta)){
                return new int[]{i, visitedNumbers.get(delta)};
            }
            visitedNumbers.put(numbers[i], i);
        }
        return new int[]{-1, -1};
    }
}
