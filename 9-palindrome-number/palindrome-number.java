class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp=x;
        int digit;
        int rev=0;
        while(temp!=0){
        digit=temp%10;
        rev=rev*10+digit;
        temp/=10;
        }
        return x==rev;
    }
}