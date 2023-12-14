import java.util.Scanner;

public class CalculatorSederhana {

    public static void main(String[] args) {

        Scanner inputUser;
        float A, B, hasil;
        String jarimatika;

        inputUser = new Scanner(System.in);

        System.out.println("nilai A = ");
        A = inputUser.nextFloat();
        System.out.println("jarimatika = ");
        jarimatika = inputUser.next();
        System.out.println("nilai B =");
        B = inputUser.nextFloat();

        switch (jarimatika){
            case "+":
                //penjumlahan
                hasil = A + B;
                System.out.println("hasil =" + hasil);
                break;
            case "=":
                //pengurangan
                hasil = A - B;
                System.out.println("hasil =" + hasil);
                break;
            case "*":
                //perkalian
                hasil = A * B;
                System.out.println("hasil =" + hasil);
                break;
            case "/":
                //pembagian
                hasil = A / B;
                System.out.println("hasil =" + hasil);
                break;
            default:
                System.out.println("jarimatika" + jarimatika + " hasil tidak ditemukan");


        }


    }
}
