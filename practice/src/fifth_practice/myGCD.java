package fifth_practice;

import java.util.Scanner;

public class myGCD {
    // 最大公約数を計算するメソッド
	// ユークリッド互助法を用いる
				//	ユークリッドの互助法は、2つの整数の最大公約数（GCD）を見つけるためのアルゴリズム。与えられた2つの整数のうち小さい方を大きい方で割った余りを求め、割られた数を新しい割る数として、剰余を新しい割られる数として、再度割り算を行う。
				//	このプロセスを割り切れるまで続け、割り切れると、割る数が0になるので、そのときの割られる数が最大公約数。
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 最大公約数の計算
        System.out.println("2つの整数を入力してください:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int gcdResult = gcd(num1, num2);
        System.out.println("最大公約数: " + gcdResult);
        
        // 浮動小数点数の平方根の計算
        System.out.println("浮動小数点数を入力してください:");
        double number = scanner.nextDouble();
        double sqrt = Math.sqrt(number);
        System.out.println("平方根: " + sqrt);
        
        scanner.close();
    }
}
