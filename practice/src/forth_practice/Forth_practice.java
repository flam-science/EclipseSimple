package forth_practice;

public class Forth_practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		【課題1】
//		10個の整数を要素とする新しい1次元配列を宣言して初期化し、任意の値を代入する。
//		整数は10、12、14、16、18、20、22、24、26、28とする。
		int[] numbers = new int[10];
		
		numbers[0] = 10;
		numbers[1] = 12;
		numbers[2] = 14;
		numbers[3] = 16;
		numbers[4] = 18;
		numbers[5] = 20;
		numbers[6] = 22;
		numbers[7] = 24;
		numbers[8] = 26;
		numbers[9] = 28;
		
		System.out.println(numbers[6]);
		
		
//		配列の要素を for ループを使用して順番に表示するプログラム。
//		配列の要素は11,12,13,14,15とする。
		int[] numbers2 = new int[5];
		
		numbers2[0] = 11;
		numbers2[1] = 12;
		numbers2[2] = 13;
		numbers2[3] = 14;
		numbers2[4] = 15;
		//lengthにて要素数を取得する
		for( int i = 0 ; i < numbers2.length ; i++) {
			System.out.println(numbers2[i]);
		}
		
//		配列の要素を合計してその結果を表示するプログラム。
//		配列の要素は55,60,70,82とする。
		int[] numbers3 = new int[4];
		
		numbers3[0] = 55;
		numbers3[1] = 60;
		numbers3[2] = 70;
		numbers3[3] = 82;

		//要素の合計値をsumResultとする
		int sumResult = 0;
		//sumResultに要素を順に足していく		
		for( int i = 0 ; i < numbers3.length ; i ++) {
			sumResult += numbers3[i];
		}
		
		System.out.println(sumResult);
		
//		配列の要素を for ループを使用して表示し、その中で偶数の場合は「偶数」と、奇数の場合は「奇数」と表示するプログラム
//		配列の要素は5, 8, -1, 2とする。
		int[] numbers4 = new int[4];
		
		numbers4[0] = 5;
		numbers4[1] = 8;
		numbers4[2] = -1;
		numbers4[3] = -2;
		
		for( int i = 0 ; i < numbers4.length ; i ++) {
			//偶数であるということは、２で割ると余りが０となる
			if( numbers4[i] % 2 == 0 ) {
				System.out.println(numbers4[i] + "は偶数");
			}else {
				System.out.println(numbers4[i] + "は奇数");
				}
			}
		
//		配列の要素の合計が特定の閾値を超える場合に「閾値を超えました」と表示するプログラム。
//		閾値は100とする。
		int[] numbers5 = new int[4];
		
		numbers5[0] = 30;
		numbers5[1] = 35;
		numbers5[2] = 40;
		numbers5[3] = 45;

		//各要素の合計値をsumResult2とする
		int sumResult2 = 0;
		for( int i = 0 ; i < numbers5.length ; i ++) {
			
			//各要素の合計値をもとめる
			sumResult2 += numbers5[i];
			
			if( sumResult2 > 100 ) {
				//各要素の合計値が100をこえたとき、以下の処理
				System.out.println("閾値を超えました");
			}else {
				//そうでないとき、以下の処理				
				System.out.println(numbers5[i]);
				}
			}
		
				
//		【課題2】
//		9*9の整数型2次元配列を宣言して初期化し、for文で九九を代入するプログラム
		
		//２次元配列における行列の要素数を定義
		int[][] numbers6 = new int[9][9];
		
		//iで行に入る値を定義するが、０から始めなければいけない
		for ( int i = 0 ; i < 9 ; i++) {
			
			//jで行に入る値を定義するが、０から始めなければいけない
			for( int j = 0 ; j < 9 ; j++) {
				
				//それぞれ０から始めているために、積を求める式には各項+1をする必要がある
				numbers6[i][j] = (i + 1) * (j + 1) ;
				System.out.println(numbers6[i][j]);
			}
		}
		
	}

}
