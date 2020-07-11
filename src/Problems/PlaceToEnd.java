package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlaceToEnd {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(zerosToEnd(new Integer[]{0, 1, 0, 3, 6, 7, 8, 0, 13, 16, 0})));
        //[1, 3, 6, 7, 8, 13, 16, 0, 0, 0, 0]
    }

    public static Object[] zerosToEnd(Integer[] nums) {
        List<Integer> list = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                k++;
                continue;
            }
            list.add(nums[i]);
        }
        for (int i = 0; i < k; i++) {
            list.add(0);
        }
        return list.toArray();
    }

}