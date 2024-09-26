public class findmatrixpath {

    public static int findpath(int n, int m) {
        if (n == 1 || m == 1) {
            return 1;
        }
        return findpath(n - 1, m) + findpath(n, m - 1);
    }

    public static void main(String[] args) {

        System.out.println(findpath(3, 3));
    }
}
