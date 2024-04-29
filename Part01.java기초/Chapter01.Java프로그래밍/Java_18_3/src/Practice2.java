import java.util.ArrayList;

public class Practice2 {
    public static ArrayList<Integer> solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;

            if (nums[idx] < 0) {
                list.add(Math.abs(idx + 1));
            }

            nums[idx] = -nums[idx];
        }

        return list;
    }

    public static void main(String[] args) {
        // Test code
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solution(nums));

        nums = new int[]{1, 1, 2};
        System.out.println(solution(nums));

        nums = new int[]{1, 3, 1, 3, 5, 5};
        System.out.println(solution(nums));
    }
}
