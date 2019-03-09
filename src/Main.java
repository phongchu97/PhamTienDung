public class Main {

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }

        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    void numbersSmallerThaOneThousand() {
        for(int i = 2; i < 1000; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static int fibonacciLoop(int number) {
        int sum = 1;
        int fibS = 0;
        int fib1 = 0;
        int fib2 = 1;
        if (number == 1) {
            sum = 0;
        } else if(number == 2) {
            sum = 1;
        } else {
            for(int i = 3; i <= number; i++) {
                fibS = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibS;
                sum += fibS;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println("Start Running");
        Main homework = new Main();
        System.out.println(fibonacciLoop(20));
        homework.numbersSmallerThaOneThousand();



    }


}
