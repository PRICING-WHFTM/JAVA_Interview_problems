package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSorted {
    public static void main(String[] args) {
        System.out.println(sorted(Arrays.asList(new Integer [] {7,3,4,9,13,2})));
    }

    public static List<Integer> sorted(List<Integer> original) {
        Collections.sort(original);
        return original;
    }





}
