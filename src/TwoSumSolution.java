import java.util.HashMap;
import java.util.Map;

/**
 * Clase TwoSumSolution que contiene la función para resolver el problema de Two Sum.
 */
public class TwoSumSolution {
    /**
     * Encuentra los índices de dos números en el array que sumen el valor target.
     *
     * @param nums   Array de enteros en el que se buscarán los números.
     * @param target Valor objetivo de la suma.
     * @return Array de enteros que contiene los índices de los dos números que suman el target.
     * @throws IllegalArgumentException si no se encuentra una solución válida.
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two elements add up to the target.");
    }
}
