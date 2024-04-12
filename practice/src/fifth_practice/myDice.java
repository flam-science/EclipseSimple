package fifth_practice;

import java.util.Random;
import java.util.Scanner;

public class myDice {
    public static void main(String[] args) {
    	// ユーザーの入力を受け付けるScannerオブジェクトの作成
        Scanner scanner = new Scanner(System.in);
        // ランダムな数を生成するRandomオブジェクトの作成
        Random random = new Random();
        
        // サイコロの目を生成
        // 1から6までのランダムな数を生成し、diceRoll変数に代入
        int diceRoll = random.nextInt(6) + 1; 
        
        System.out.println("サイコロを振りました。出目を予想してください。（1 ~ 6の数値を入力してください。）");
        
        // ユーザーの予想を取得
        // ユーザーが入力した数値をguess変数に代入
        int guess = scanner.nextInt();
        
        // 結果を表示
        // ユーザーの入力が1から6の範囲外の場合
        if (guess < 1 || guess > 6) {
            System.out.println("1から6の数値を入力してください。");
        } else {
        	// ユーザーの入力が1から6の範囲内の場合、サイコロの目を表示
            System.out.println("サイコロの目: " + diceRoll);
            if (guess == diceRoll) {
            	// ユーザーの予想がサイコロの目と一致する場合
                System.out.println("当たりです。おめでとう。");
            } else {
            	 // ユーザーの予想がサイコロの目と一致しない場合
                System.out.println("ハズレです。残念でした。");
            }
        }
        
        scanner.close();
    }
}