package sayisalloto.selectstudent;

import java.util.Scanner;
import java.util.SortedMap;

public class SelectStudent {
    /*
    Proje: Spor kursu için seçilecek öğrencileri belirleyen
           bir uygulama yazınız.

           kurs gereklilikleri:
                erkekler: boy: 1.60 ve üstü
                          kilo:70-90 kg
                kızlar: boy: 1.50 ve üstü
                        kilo:50-70 kg

           kullanıcıdan öğrenci sayısı ve herbir öğrenci
           için isim , cinsiyet, kilo ve boy bilgilerini girmesini
           isteyiniz.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Merhaba, lutfen formu doldurunuz");
        System.out.println("Ogrenci sayisini giriniz");
        int numStd = scanner.nextInt();

        String[] students = new String[numStd];
        String[] gender = new String[numStd];
        double[] height = new double[numStd];
        double[] weight = new double[numStd];
        boolean isSuccess=true;

        do{
            isSuccess= true;
            for (int i = 0; i < numStd; i++) {
                System.out.print("isim: ");
                students[i] = scanner.next();

                System.out.print("isim: ");
                String gen = scanner.next().substring(0,1).toUpperCase();
                if (gen.equals("K")||gen.equals("E")) { gender[i] = gen;
                }else{
                    System.out.println("Hatali giris");
                    isSuccess = false;
                    break;
                }

                System.out.print("Boy: ");
                height[i] = scanner.nextDouble();

                System.out.println("kilo :");
                weight[i] = scanner.nextDouble();
            }
        }while (!isSuccess);

        int counter=0;
        System.out.println("*** kursa seçilen öğrenciler ***");
        for(int i=0;i<numStd; i++){
            if(gender[i].equals("K") && weight[i]>=50 && weight[i]<=70 && height[i]>=1.50){
                System.out.println("isim: "+students[i]+" cinsiyet: "+gender[i]+" boy: "+height[i]+" kilo: "+weight[i]);
                counter++;
            }else if(gender[i].equals("E") && weight[i]>=70 && weight[i]<=90 && height[i]>=1.60){
                System.out.println("isim: "+students[i]+" cinsiyet: "+gender[i]+" boy: "+height[i]+" kilo: "+weight[i]);
                counter++;
            }
        }
        //kursa seçilen öğrenci yoksa
        if(counter==0){
            System.out.println("Malesef kurs gereksinimlerini sağlayan öğrenci bulunamadı.");
        }
    }


}
