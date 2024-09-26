import java.util.Arrays;

public class primechake {

    public static  boolean[] primenumberchake(int n ){
        boolean[] isprime = new boolean[n+1];
        Arrays.fill(isprime,true);
        isprime[0] = true;
        isprime[1] = true;
        for(int i = 2 ; i<=n/2 ; i++){
            for(int j=2*i ; j<=n ; j+=i){
                isprime[j] = false;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {


        boolean[] prime = primenumberchake(19);
        int total = 0 ;
        for(int i = 1 ; i < prime.length ; i++){
//            System.out.println(prime[i] + " " + i);
            if(prime[i]){
                System.out.println(i + " is prime");
                total ++;
            }
        }
        System.out.println( " total prime number is :- "+total) ;
    }
}
