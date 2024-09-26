package recursion;

public class R_02_powerofcurrentstring {

    public static void poerofstring(String str, int i, String car) {

            if (i == str.length()) {
                System.out.print( "("+ car +")  ");

                return;
            }
            poerofstring(str, i+1,  car + str.charAt(i));
            poerofstring(str, i+1, car);
        System.out.print("");
    }



    public static void main(String[] args) {
        poerofstring("meet" , 0 ,"");
    }
}
