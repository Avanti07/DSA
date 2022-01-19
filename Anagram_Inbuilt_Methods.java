import java.util.*;

public class Main
{
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "dacb";
        String s3 = "fghk";
        boolean res1 = isAnagram(s1, s2);
        boolean res2 = isAnagram(s1, s3);
        System.out.println(s1+ " "+ s2 +" are anagram: " + res1);
        System.out.println(s1+ " "+ s3 +" are anagram: " + res2);
    }
    
    static boolean isAnagram(String s1, String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        System.out.println(Arrays.toString(c1) + " "+ Arrays.toString(c2) );
        if(Arrays.toString(c1).equals(Arrays.toString(c2)))
            return true;
        
        return false;
    }
}
