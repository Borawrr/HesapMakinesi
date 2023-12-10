import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1,n2,islem;

        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = scanner.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Sectiginiz Islem : ");
        islem = scanner.nextInt();

        switch (islem)
        {
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Hicbir islem secmediniz");

        }
        
    }
}
