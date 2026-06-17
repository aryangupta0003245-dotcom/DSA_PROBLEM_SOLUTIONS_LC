#include<bits/stdc++.h>
class Solution {
public:
    int reverse(int x) {
    
    // > 214748364 &&  >7
    // 1534236469 : 9646.....
    // -2147483648
    int temp = x;// 12 
    int reverse = 0;
    while(temp != 0){
        int digit = temp % 10; //2 1 

        if(reverse > INT_MAX/10 || reverse >= INT_MAX && digit > 7 )return 0;
        if(reverse < INT_MIN/10 || reverse <= INT_MIN && digit < -8)return 0 ;
        reverse = reverse * 10 + digit; //20 + 1 = 21 
        temp /= 10;//rev :  213738364 : 5 6 7 8 9 
    }
return reverse;

    
    }
};