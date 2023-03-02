import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float derece;
        System.out.print("Derece Giriniz (Celcius): ");
        Scanner oku=new Scanner(System.in);
        derece=oku.nextFloat();

        if(derece<5){
            System.out.println("Buzz! Kayak havasi");
        } else if (derece<=15 && derece>5) {
            System.out.println("Biraz soguk. Avm de sinema Havasi");
        } else if (derece>15 && derece<=25) {
            System.out.println("Hava serbet gibi, Piknik vakti");
        } else {
            System.out.println("Cok sicak,yüzmek ferahlatir.");
        }

    }
}