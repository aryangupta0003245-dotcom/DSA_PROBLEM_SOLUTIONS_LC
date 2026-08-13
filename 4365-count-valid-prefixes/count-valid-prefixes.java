class Solution {
    public int countValidPrefixes(String s) {
        int countof0=0;
        int countof1=0;
        int validprefix=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                countof0++;
            }
            if(s.charAt(i)=='1'){
                countof1++;
            }
            int absolute = countof0-countof1;
            if(Math.abs(absolute)==1||absolute==0){
                validprefix++;
            }
        } return validprefix;}
        }