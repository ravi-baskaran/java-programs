package number;

public class SumOfDigits {

    public static void main(String[] args) {

        int num =1534;
        System.out.println(sumRecursion(num, 0));


    }

    static int sumRecursion(int n, int sum){
        if (n == 0) {
            return sum;
        }

        return sumRecursion(n/10, sum+(n%10));
    }

}
