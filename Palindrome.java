class Solution {
    public boolean isPalindrome(int x) {
        int n=x,a=0,b=0;
        while(n!=0 && n>0){
            a=n%10;
            b=a+b*10;
            n=n/10;
        }
        if(b==x){
            return true;
        }
        return false;
    }
}