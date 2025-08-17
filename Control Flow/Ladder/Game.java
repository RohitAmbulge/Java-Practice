import java.util.Scanner;

class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println();
			System.out.println("*****************Welcome****************");
			System.out.println("		Game Starts					");
			System.out.println();

			System.out.println("1.STONE    2.PAPER    3.SCISSOR");
			System.out.println();

			System.out.print("Enter your Response : ");
			int userResp = sc.nextInt();

			String response1 = "";

			if (userResp == 1) {
				response1 = "STONE";
			} else if (userResp == 2) {
				response1 = "PAPER";
			} else if (userResp == 3) {
				response1 = "SCISSOR";
			} else {
				System.out.println("INVALID Response");
				continue;
			}

			// bot imp starts

			int botResp = 0;
			for (;;) {
				botResp = (int) (Math.random() * 10);
				if (botResp >= 1 && botResp <= 3)
					break;
			}

			String response2 = "";

			if (botResp == 1) {
				response2 = "STONE";
			} else if (botResp == 2) {
				response2 = "PAPER";
			} else {
				response2 = "SCISSOR";
			}

			System.out.println();
			System.out.println("     	USER      	BOT  ");
			System.out.println("	" + response1 + "    	" + response2);

			// Calculate Winner

			System.out.println();
			if ((response1.equals("PAPER") && response2.equals("STONE")) ||
					(response1.equals("SCISSOR") && response2.equals("PAPER")) ||
					(response1.equals("STONE") && response2.equals("SCISSOR"))) {
				System.out.println("		USER WON");
			} else if ((response1.equals("SCISSOR") && response2.equals("STONE")) ||
					(response1.equals("STONE") && response2.equals("PAPER")) ||
					(response1.equals("PAPER") && response2.equals("SCISSOR"))) {
				System.out.println("		BOT WON       ");
			} else {
				System.out.println("		DRAW          ");
			}

		}
	}

}