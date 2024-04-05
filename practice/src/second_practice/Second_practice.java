package second_practice;

public class Second_practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		課題1】if文の使用
//		任意の整数型の変数 score を宣言し、任意の値で初期化してください。
//		score が80以上ならば「合格」と表示し、それ未満ならば「不合格」と表示してください。
		int score = 100 ;
		if(score >= 80) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		};
				
//		【課題2】switch文の使用
//		1から7までの整数型の変数 dayOfWeek を宣言し、任意の値で初期化してください。
//		dayOfWeek の値に応じて、それぞれの曜日名を表示してください。
		int dayOfWeek = 7;
		
		switch (dayOfWeek) {

		case 1:
            System.out.println("月曜日");
            break;

		case 2:
            System.out.println("火曜日");
            break;
        
		case 3:
            System.out.println("水曜日");
            break;
        
		case 4:
            System.out.println("木曜日");
            break;
        
		case 5:
            System.out.println("金曜日");
            break;
        
		case 6:
            System.out.println("土曜日");
            break;
        
		case 7:
            System.out.println("日曜日");
            break;
        
		default:
            System.out.println("無効な曜日");
            break;
		};

		
//		【課題3】条件演算子の使用
//		任意の整数型の変数 num1 と num2 を宣言し、任意の値で初期化してください。
//		num1 が num2 より大きい場合は「num1が大きい」と表示し、それ以外の場合は「num2が大きい」と表示してください。
		int num1 = 5 ;
		int num2 = 7 ;
		
		String result = ( num1 > num2 ) ? "num1が大きい" : "num2が大きい";
		System.out.println(result);
		
	}

}
