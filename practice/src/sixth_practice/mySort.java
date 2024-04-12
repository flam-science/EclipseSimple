package sixth_practice;

import java.util.Scanner;

public class mySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 配列のサイズを入力
        System.out.print("配列のサイズを入力してください: ");
        int size = scanner.nextInt();
        // 配列のサイズ決定
        int[] array = new int[size];

        // 入力された配列のサイズ分、配列に数字を入力
        for (int i = 0; i < size; i++) {
            System.out.print("数字を入力してください: ");
            array[i] = scanner.nextInt();
        }

        // ソート方法の選択
        System.out.print("ソート方法を選択してください（昇順または降順）: ");
        String order = scanner.next();

        // 選択されたソートをおこなっていく
        if (order.equalsIgnoreCase("昇順")) {
        	// 昇順のソート       	
            ascendingSort(array);
        // 昇順ではないとき、降順だとすれば、        
        } else if (order.equalsIgnoreCase("降順")) {
        	// 降順のソート       	
        	descendingSort(array);
        } else {
        // 昇順でも降順でもない方法が入力された場合、       
            System.out.println("無効な選択です。");
            return;
        }

        // ソート結果の表示
        System.out.println("ソート結果:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    // 昇順ソート
    public static void ascendingSort(int[] array) {
        // ループを通じて配列の全ての要素を比較する
        for (int i = 0; i < array.length - 1; i++) {
        	   // i番目の要素とそれ以降の要素を比較するためのループ
            for (int j = i + 1; j < array.length; j++) {
            	  // i番目の要素がj番目の要素より大きい場合
                if (array[i] > array[j]) {
                	 // 一時変数tempを使って値を交換する(三角関係)
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // 降順ソート
    public static void descendingSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
