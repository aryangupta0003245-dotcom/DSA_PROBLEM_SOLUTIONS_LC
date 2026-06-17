class Solution {
    public int reverse(int x) {
int place =0;
int temp =x;
while(temp!=0){
int digit=temp%10;
if(place>Integer.MAX_VALUE/10||(place==Integer.MAX_VALUE/10&&digit>7)){
    return 0;
}

if(place<Integer.MIN_VALUE/10||(place==Integer.MIN_VALUE/10&&digit<-8)){
    return 0;
}




    place=place*10+digit;
    temp/=10;


}return place;
    }
}