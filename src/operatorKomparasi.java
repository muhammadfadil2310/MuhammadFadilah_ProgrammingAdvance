 public class operatorKomparasi {
        public static void main(String[] args) {
            int a,b;
            boolean hasilKomparasi;

            System.out.println("===========Persamaan");
            a = 10;
            b = 10;
            hasilKomparasi = (a==b);
            System.out.printf("%d = %d --> %s\n",a,b,hasilKomparasi);

            a = 12;
            b = 10;
            hasilKomparasi = (a==b);
            System.out.printf("%d = %d --> %s\n",a,b,hasilKomparasi);

            System.out.println("===========Pertidaksamaan");
            a = 10;
            b = 10;
            hasilKomparasi = (a!=b);
            System.out.printf("%d = %d --> %s\n",a,b,hasilKomparasi);

            a = 12;
            b = 10;
            hasilKomparasi = (a!=b);
            System.out.printf("%d = %d --> %s\n",a,b,hasilKomparasi);

            System.out.println("nilai A");
            System.out.println("nilai B");
            System.out.println("nilai C");


        }
    }


