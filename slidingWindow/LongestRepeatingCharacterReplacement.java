public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int [] count = new int[26];
        int maxWindow = 0;
        int maxFreq = 0;

        for (int right=0; right < s.length() ; right++){
            count[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq , count[s.charAt(right) - 'A']);

            int window = right - left + 1;

            if(window - maxFreq > k){
                count[s.charAt(left)- 'A']--;
                left++;
            }

            window = right - left+1;
            maxWindow = Math.max(maxWindow , window);
        }

        return maxWindow;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        LongestRepeatingCharacterReplacement obj = new LongestRepeatingCharacterReplacement();
        System.out.println(obj.characterReplacement(s,k));
    }
}