import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for (int i=0;i<testCase;i++){
            int costOfDisposable = scan.nextInt() * 100;
            int costOfCloth = scan.nextInt() * 10;

            if (costOfDisposable == costOfCloth){
                System.out.println("Cloth");
            }else if (costOfDisposable < costOfCloth){
                System.out.println("Disposable");
            }else {
                System.out.println("Cloth");
            }
        }
    }
}
