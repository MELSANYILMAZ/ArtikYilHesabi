import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        System.out.print("Lütfen Yılınızı Giriniz:");
        int yil= Input.nextInt();
        Boolean artikYil=false;

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    artikYil = true;
                }
            } else {
                artikYil = true;
            }
        }

        if (artikYil) {
            System.out.println(yil + " bir artık yıldır!");
        } else {
            System.out.println(yil + " bir artık yıl değildir!");
        }
    }
}

