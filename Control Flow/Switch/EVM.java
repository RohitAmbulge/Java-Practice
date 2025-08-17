import java.util.Scanner;

public class EVM {

    static int bjp, cong, ss, mns, aap, nota;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the population : ");
        int population = sc.nextInt();

        for (int i = 1; i <= population; i++) {
            System.out.println();
            System.out.println("    Welcome ");
            System.out.println();
            System.out.println("1. BJP");
            System.out.println("2. CONGRESS");
            System.out.println("3. SHIV SENA");
            System.out.println("4. MNS");
            System.out.println("5. AAP");
            System.out.println("6. NOTA");
            System.out.println();
            System.out.println("Enter your vote : ");
            int vote = sc.nextInt();

            switch (vote) {
                case 1: {
                    System.out.println("ACCHE DIN AYENGE");
                    bjp++;
                    break;
                }
                case 2: {
                    System.out.println("BHARAT JODO");
                    cong++;
                    break;
                }
                case 3: {
                    System.out.println("HUM HAI ASLI SENA");
                    ss++;
                    break;
                }
                case 4: {
                    System.out.println("JAI MAHARASHTRA");
                    mns++;
                    break;
                }
                case 5: {
                    System.out.println("AAP KA EK VOTE MUJHE AAZAD KAREGA");
                    aap++;
                    break;
                }
                case 6: {
                    System.out.println("OOHH YOU ARE EDUCATED");
                    nota++;
                    break;
                }
                default: {
                    System.out.println("INVALID INPUT");
                    i--;
                    break;
                }
            }

        }

        System.out.println();
        System.out.println();
        if (bjp >= cong && bjp >= ss && bjp >= mns && bjp >= aap && bjp >= nota)
            System.out.println("BJP won the electio with " + bjp + " votes");

        if (cong >= bjp && cong >= ss && cong >= mns && cong >= aap && cong >= nota)
            System.out.println("CONGRESS won the electio with " + cong + " votes");

        if (ss >= bjp && ss >= cong && ss >= mns && ss >= aap && ss >= nota)
            System.out.println("SHIV SENA won the electio with " + ss + " votes");

        if (mns >= cong && mns >= ss && mns >= bjp && mns >= aap && mns >= nota)
            System.out.println("MNS won the electio with " + mns + " votes");

        if (aap >= cong && aap >= ss && aap >= mns && aap >= bjp && aap >= nota)
            System.out.println("AAP won the electio with " + aap + " votes");

        if (nota >= cong && nota >= ss && nota >= mns && nota >= aap && nota >= bjp)
            System.out.println("NOTA has " + nota + " votes and no one won the election");

    }
}
