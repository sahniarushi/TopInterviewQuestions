class Solution {
    public boolean isPalindrome(int x) {
         if(x<0){
            return false;
        }
        
        if (x==0) {
            return true;
        }
        
        int temp,rem,revNum=0;
        temp=x;
        while(temp>0){
            rem=temp%10;
            revNum=revNum*10+rem;
            temp/=10;
        }
        
        if(revNum==x) {
            return true;
        }
        return false; 
    }
}
