/*Napišite Java program koji će omogućiti korisniku unos teksta.
Program treba analizirati uneseni tekst i izvršiti sljedeće operacije:
izbrojati ukupan broj riječi u tekstu
stvoriti novi tekst zamjenom svake riječi koja počinje samoglasnikom s riječju "Java"
*/

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String...args){
        Scanner ulaz=new Scanner(System.in);
        System.out.println("Upiši tekst");
        String tekst=ulaz.nextLine();
        String novi_tekst="";
        String []rijeci=tekst.split(" ");
        System.out.println("Broj rijeci je "+rijeci.length);
        for(int i=0;i< rijeci.length;i++){
            char slovo=rijeci[i].charAt(0);
            if(slovo=='a'||slovo=='e'||slovo=='i'||slovo=='o'||slovo=='u'){
                novi_tekst=novi_tekst+" "+"Java";
            }
            else{
                novi_tekst=novi_tekst+" "+rijeci[i];
            }

            }
        System.out.println(novi_tekst);
        }


}
