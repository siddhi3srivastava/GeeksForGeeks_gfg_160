/* You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 

Note: The answer should be returned in an increasing format. */

import java.util.HashMap;
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        
        int n=nums.length;
        List<Integer> majority= new ArrayList<>();
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        
        List<Integer> keyArr= new ArrayList<>(map.keySet());
        for(int i=0; i<keyArr.size(); i++){
            int key= keyArr.get(i);
            if(map.get(key)>(n/3) && !majority.contains(key)){
                majority.add(key);
            }
        }
        
        return majority;
        
    }
}
