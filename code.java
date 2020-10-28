import java.util.Scanner;

public class code {
    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);
        int batas = input.nextInt();
        System.out.println("masukan batas: ");
        int b = 1;
        int b2 = 1;
        int batasBawah = 0;
        for (int a = 1; a <= batas; a++) {
            for (b2 = 1; b2 <= batas; b2++) {
                System.out.print("+-");
            }
            System.out.println("+");
            for (b = 1; b <= batas; b++) {
                if (b % 2 == 0)//genap
                {
                    System.out.print("x");
                    if (b == batas) {
                        System.out.print("|");
                    }
                } else {
                    System.out.print("|");
                    System.out.print("o");
                    System.out.print("|");
                }

            }
            batasBawah++;
            if (batasBawah == batas) {
                System.out.println("");
                for (batasBawah = 0; batasBawah < batas; batasBawah++) {
                    System.out.print("+-");
                    if (batasBawah == batas - 1) {
                        System.out.println("0");

                    }
                }
            }
            System.out.println();

        }













    }
}
