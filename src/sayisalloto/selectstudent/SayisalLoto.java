package sayisalloto.selectstudent;

import java.util.Random;
import java.util.Scanner;

/*
Proje: Sayısal Loto Uygulaması
       bilet için rastgele n tane sayı üretilsin.
       loto sonucu rastgele n tane sayı ile üretilsin.
       sayısal lotoda tekrarlı sayılar olmamalı.

       n(hane sayısı), sayılar için min ve max değerler
       kullanıcıdan alınsın.

       sonuç ve bilet karşılaştırılsın, kaç eşleşme olduğu
       kullanıcıya bildirilsin.

*/
public class SayisalLoto {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.print("Sayısal loto için hane sayısını giriniz: ");
        int slots= inp.nextInt();
        System.out.print("Sayılar için min değer giriniz: ");
        int min= inp.nextInt();
        System.out.print("Sayılar için max değer giriniz: ");
        int max= inp.nextInt();
        //loto ve bilet için
        int[] lotoArr=new int[slots];
        int[] ticketArr=new int[slots];

        int randomNumber1=0;
        int randomNumber2=0;
        Random random= new Random();
        boolean isRepeated;
        for (int i=0;i<slots;i++){
            do {
                isRepeated=false;
                // 0 ile değer arasında rastgele sayı, değer dahil değil
                //   randomNumber1=random.nextInt(10+1-5)+5; // ->0,1,2,3,4,5 -> 5,6,7,8,9,10
                randomNumber1=random.nextInt(max+1-min)+min;
                //random sayı dizide var mı kontrol et
                for (int j=0;j<i;j++){
                    if(lotoArr[j]==randomNumber1){
                        isRepeated=true;
                        break;
                    }
                }

            }while(isRepeated);
            lotoArr[i]=randomNumber1;

            do {
                isRepeated=false;
                // 0 ile değer arasında rastgele sayı, değer dahil değil
                //   randomNumber1=random.nextInt(10+1-5)+5; // ->0,1,2,3,4,5 -> 5,6,7,8,9,10
                randomNumber2=random.nextInt(max+1-min)+min;
                //random sayı dizide var mı kontrol et
                for (int j=0;j<i;j++){
                    if(ticketArr[j]==randomNumber1){
                        isRepeated=true;
                        break;
                    }
                }

            }while(isRepeated);
            ticketArr[i]=randomNumber2;
        }




    }



}
