package solutions.funtions;

public class OddOrEven {
    static String oddOrEven(int n) {

        if(n%2==0){
            return "Even";
        }else{
            return "Odd";
        }

    }
    public static void main(String[] args) {
        int n;

        n = 22;
        System.out.println(n + " is a " + oddOrEven(n) );

        n = 11;
        System.out.println(n + " is a " + oddOrEven(n) );
    }
}
