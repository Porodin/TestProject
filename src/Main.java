public class Main {
    public static void main(String[] args) {

        long number = 600851475143L;

        for(int i = 2; i <= Math.sqrt(number); i++)
        {
            if(number % i == 0)
            {
                number = number / i;
                i--;
            }
        }
            System.out.println("Самый большой делитель числа 600851475143 является число " + number);
    }
}

