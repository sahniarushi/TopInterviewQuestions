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
