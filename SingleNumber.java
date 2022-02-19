class Solution {
    public int singleNumber(int[] nums) {
        
        int res;
        
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums) {
            if(set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        
        
        return set.iterator().next();
        
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0;i<nums.length;i++)
        {
            result ^= nums[i]; // 1 ^ 1 = 0, 0 ^ x = x
        }
        
        return result;
    }
}


