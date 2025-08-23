package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithExactlyDistinctK {

    public static int lengthOfLongestSubstring(String s, int k) {
        // code here
        Map<Character , Integer> mpp = new HashMap<>();

        int left = 0 , right = 0, length = -1;
        for(; right < s.length(); right++){
            mpp.put(s.charAt(right), mpp.getOrDefault(s.charAt(right), 0) +1);

            if(mpp.size()==k) length = Math.max( length , right - left+1);
            else if(mpp.size()>k){
                while(mpp.get(s.charAt(left)) != 0){

                    mpp.put(s.charAt(left) , mpp.get(s.charAt(left)) - 1);

                    if(mpp.get(s.charAt(left))==0){
                        mpp.remove(s.charAt(left));
                        left++;
                        break;
                    }

                    left++;
                }
            }



        }

        return length;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        int k = 2;
        System.out.println(lengthOfLongestSubstring(s, k));
    }
}
