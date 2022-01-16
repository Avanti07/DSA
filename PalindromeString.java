/* Given a string S, check if it is palindrome or not. */

class Solution {
    int isPalindrome(String S) {
        // code here
        char[] rev = new char[S.length()];
    int j =0;
    for(int i = S.length() -1; i>=0; i--){
        rev[j] = S.charAt(i);
        j++;
    }
    String str = new String();  
    String string = str.valueOf(rev);  
    
    if(string.equals(S)){
        return 1;
    }
    return 0;
    }
};
