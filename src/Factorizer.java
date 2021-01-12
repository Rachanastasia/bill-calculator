public class Factorizer {
    public static void main(String[] args){
        int numberA = 3;
        int numberB = 9;

        Factorizer factorizer = new Factorizer();

        boolean result = factorizer.isFactor(numberA, numberB);
        int ans = numberB % numberA;
        if(ans == 0){
            System.out.printf("%d is a factor of %d\n", numberA, numberB);
        } else {
            System.out.printf("%d is NOT a factor of %d\n", numberA, numberB);
        }
    }
    public boolean isFactor(int a, int b){
        int ans = b % a;
        return ans == 0;
    }
}


