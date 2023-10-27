import java.util.Scanner;

class Demo {
    static String isPrime(int number) {  
        if (number <= 1) {
            return "Isn't prime";
        }

        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {  
                return "Isn't prime";
            }
        }
        return "Is prime";
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        String output = isPrime(number);
        System.out.println(output);
    }
}