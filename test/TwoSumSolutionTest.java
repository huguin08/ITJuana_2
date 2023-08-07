import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Clase de pruebas unitarias para la función TwoSumSolution.twoSum().
 */
public class TwoSumSolutionTest {

    @Test
    public void testTwoSumExample1() {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = TwoSumSolution.twoSum(nums1, target1);
        int[] expected1 = {0, 1};
        Assertions.assertArrayEquals(expected1, result1);
    }

    @Test
    public void testTwoSumExample2() {
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = TwoSumSolution.twoSum(nums2, target2);
        int[] expected2 = {1, 2};
        Assertions.assertArrayEquals(expected2, result2);
    }

    @Test
    public void testTwoSumExample3() {
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = TwoSumSolution.twoSum(nums3, target3);
        int[] expected3 = {0, 1};
        Assertions.assertArrayEquals(expected3, result3);
    }
}
