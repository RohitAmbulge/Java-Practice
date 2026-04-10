import java.util.Scanner;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		

		while(true){
			System.out.println("Enter number");
			int n = sc.nextInt();
			if(n % 7 == 3){
				System.out.println(n);
			}
			else if(n == 0){
				System.out.println("Exit");
				break;
			}
			


		}

		System.out.println("out of loop");
	}
}