
import java.util.Arrays;

public class MergeSort {

  /**
    * @Description:  Mergesort with recursion
    * @param to_sort
    * @return int[]
    */

  public static int[] merge_sort(int[] to_sort) {

    if (to_sort == null) return new int[0];

    // If only one number left, return that number.
    if (to_sort.length == 1) return to_sort;

    // Divide array by 2.
    int mid = to_sort.length / 2;
    int[] left = Arrays.copyOfRange(to_sort, 0, mid);
    int[] right = Arrays.copyOfRange(to_sort, mid, to_sort.length);

    // Sort each array.
    left = merge_sort(left);
    right = merge_sort(right);

    // Merge the two sorted arrays.
    int[] merged = merge(left, right);

    return merged;

  }


}
