import java.util.HashMap;

public class fruitsIntoBaskets {

    public int totalFruit(int[] fruits) {
        int start = 0;
        int max = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int end = 0; end < fruits.length; end++) {

            hash.put(fruits[end], hash.getOrDefault(fruits[end], 0) + 1);

            while (hash.size() > 2) {
                int temp = fruits[start];

                hash.put(temp, hash.get(temp) - 1);
                if (hash.get(temp) == 0) {
                    hash.remove(temp);
                }

                start++;
            }

            max = end-start+1>max ? end-start+1 : max ;
        }
        return max;
    }


    public static void main(String[] args) {
        int [] nums = {1,2,3,2,2};
        int result = new fruitsIntoBaskets().totalFruit(nums);
        System.out.println("Maximum number of fruits: " + result);
    }
}
