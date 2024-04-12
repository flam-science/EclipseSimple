package sixth_practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = null;

        // プログラムを終了するまで繰り返す
        do {
            // １つ目の数字の入力
            System.out.print("1つ目の数字を入力してください: ");
            double num1 = scanner.nextDouble();

            // 演算子の入力
            System.out.print("四則演算のための演算子を入力してください(入力例　→　+　 -　 *　/　): ");
            char operator = scanner.next().charAt(0);

            // ２つ目の数字の入力
            System.out.print("2つ目の数字を入力してください: ");
            double num2 = scanner.nextDouble();

            // 計算結果の表示
            // 選択された四則演算ごとの計算方法を定義
            double result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                	// 数字を０で割ることはできないため、以下を定義                    	
                	if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("ご確認ください：0で割ることはできません。");
                        continue; // ゼロで割る場合はループの最初に戻る
                    }
                    break;
                default:
                    System.out.println("無効な演算子です。");
                    continue; // 無効な演算子の場合はループの最初に戻る
            }
            System.out.println("計算結果: " + result);

            // 続行／終了の選択
            System.out.print("続行しますか？(続行 / 終了): ");
            choice = scanner.next();
        } while (!choice.equalsIgnoreCase("終了"));

        System.out.println("プログラムを終了します。");
        scanner.close();
    }
}
