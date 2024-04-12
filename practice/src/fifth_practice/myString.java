package fifth_practice;

public class myString {
    // 文字列を逆順にするメソッド
    public static String reverseString(String str) {
    	// StringBuilder オブジェクトを作成し、文字列を逆順に格納するための準備をする
        StringBuilder reversed = new StringBuilder();
        // 入力文字列を逆順するループ
        // 入力文字列の数-1までループを続ける       
        for (int i = str.length() - 1; i >= 0; i--) {
        	// 文字列を逆順にして StringBuilder オブジェクトに追加する
            reversed.append(str.charAt(i));
        }
     // StringBuilder オブジェクトを文字列に変換して返す
        return reversed.toString();
    }
    
    // 3つの整数の平均を計算するメソッド
    public static double calculateAverage(int num1, int num2, int num3) {
    	// 3つの整数の合計を計算し、3.0で割って平均値を求める
        return (num1 + num2 + num3) / 3.0;
    }
    
    // main メソッド
    public static void main(String[] args) {
      // 逆順の文字列を表示
    	// 入力文字列を定義
        String str = "ABCDEFG";
        // reverseString メソッドを使って文字列を逆順にし、表示する
        System.out.println("逆順の文字列: " + reverseString(str));
        
      // 平均の計算
        // 3つの整数を定義
        int num1 = 2, num2 = 7, num3 = 1;
        // calculateAverage メソッドを使って平均値を計算し、表示する
        System.out.println("3つの整数の平均: " + calculateAverage(num1, num2, num3));
    }
}