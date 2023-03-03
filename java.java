import java.util.Scanner;
class CodeRunner{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = input.nextInt(); // 정수형 입력
		String chr = input.next();
		if(num == 123){
			System.out.println("int");
		}
	}
}