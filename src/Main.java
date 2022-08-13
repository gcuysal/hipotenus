import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b;
        double c, perimeter;

        Scanner inp = new Scanner(System.in);
        System.out.println("a kenarı değeri girin: ");
        a = inp.nextInt();
        System.out.println("b kenarı değeri girin: ");
        b = inp.nextInt();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(c);


        perimeter = (a+b+c);
        double u = (perimeter/2);
        double area = (u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin alanı: " + area);



    }
}
