package sixth_practice;

public class fizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) { // 1から100までのループ
            if (i % 3 == 0 && i % 5 == 0) { // 3と5で割り切れる場合
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) { // 3で割り切れる場合
                System.out.println("Fizz");
            } else if (i % 5 == 0) { // 5で割り切れる場合
                System.out.println("Buzz");
            } else { // そのほかの場合
                System.out.println(i);
            }
        }
    }
}