package basic;

public class maxsubarray {

    public static void maxsubarraysum(int number[]) {
        int max = 0;
        int left = 0;
        int right = 0;
        int currentSum = 0;
        int[] prefix = new int[number.length];

        prefix[0] = number[0];
        for (int i = 1; i < number.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
            System.out.println(prefix[i]);
        }

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                currentSum = i == 0 ? prefix[i] : prefix[j] - prefix[i-1];
            }
            max = Math.max(max, currentSum);
        }
        System.out.println(max);
    }


    public static void main(String[] args) {

        int[] number = {1,-2,6,-1,3};

        maxsubarraysum(number);
    }
}
