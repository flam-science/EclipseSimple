package fifth_practice;

public class myScanner {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
    java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // 整数の入力と和の計算
        System.out.println("2つの整数を入力してください:");
        // １つめの数字       
        int num1 = scanner.nextInt();
        // ２つめの数字       
        int num2 = scanner.nextInt();
        // それぞれの和       
        int sum = num1 + num2;
        System.out.println("和: " + sum);
        
        // 円の面積の計算
        System.out.println("円の半径を入力してください:");
        // 入力された円の半径       
        double radius = scanner.nextDouble();
        // Math.クラスで円周率をPIで定義、かつ半径を代入し２乗       
        double area = Math.PI * radius * radius;
        System.out.println("円の面積: " + area);
        
        scanner.close();
    }
}