package recursion;

public class R_01_paindrome {

    public static boolean isPalindrome(String s , int l , int r) {

        if (l >= r ){
            return true;
        }
        if(s.charAt(l) != s.charAt(r)){
            return false;
        }
        return isPalindrome(s , l+1 , r-1);
    }

    public static void main(String[] args) {
        String racecar = "racecar";
        String meet = "meet";
        boolean ans =  isPalindrome(racecar, 0, racecar.length()-1);
        boolean ans1 =  isPalindrome(meet, 0, meet.length()-1);
        System.out.println( racecar +" is : "+ans);
        System.out.println( meet + " is : " + ans1);

    }
}
