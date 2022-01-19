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
        char[] c = new char[256];
        for(int i =0; i < s1.length(); i++){
            c[s1.charAt(i)]++;
        }
        for(int i =0; i < s2.length(); i++){
            c[s2.charAt(i)]--;
        }
        for(int i =0; i < c.length; i++){
            if(c[i] >0)
                return false;
        }
        return true;
    }
}
