public class Main {
    public static void main(String[] args) {
        long number = 600851475143L;
        long i = 2;

        for (; i <= number; i++) {
            if (number % i == 0) {
                number = number / i;
            }
        }
        System.out.println("Самый большой делитель числа 600851475143 является число " + (i-1));
    }
}

