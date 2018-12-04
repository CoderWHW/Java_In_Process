import java.util.Scanner;

public class scanner{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String level;
		System.out.println("score:");
		int score = in.nextInt();	//接收输入

		switch (level/10){
			case 10: level = "O";
			break;

			case 9: level = "A";
			break;

			case 8: level = "B";
			break;

			case 7: level = "C";
			break;

			case 6: level = "D";
			break;

			default: level = "E";

		}
		System.out.println("score is:" + level +"\nlevel");
	}
}