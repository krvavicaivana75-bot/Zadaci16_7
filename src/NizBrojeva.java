/*Najveci
Najmanji
Prosjek
Broj parnih brojeva
Broj neparnih brojeva
*/
import java.util.Scanner;

public class NizBrojeva {
    public static void main(String...args){
        Scanner ulaz=new Scanner(System.in);
        int niz[]=new int[5];
        //int najmanji,najveci,br_parnih,br_neparnih,zbroj;
        //double prosjek;
        for(int i=0;i<niz.length;i++){
            System.out.print("Unesi broj: ");
            niz[i]=ulaz.nextInt();
        }
        //najveci(niz);
        System.out.println("Najmanji: "+najmanji(niz));
        prosjek(niz);
        System.out.println("Najveći: "+najveci(niz));
        zbrojparnih(niz);


        }

    private static void prosjek(int[] niz) {
        int zbroj=0;
        for(int br:niz){
            zbroj+=br;
        }
        System.out.println("Prosjek je: "+((double)zbroj/niz.length));
    }

    private static void zbrojparnih(int[] niz) {
        int brparnih=0;
        int brneparnih=0;
        for(int br:niz){
            if(br%2==0){
                brparnih+=br;
            }else{
                brneparnih+=br;
            }
        }
        System.out.println("Zbroj parnih: "+brparnih+" zbroj neparnih: "+brneparnih);
    }

    private static int najmanji(int[] niz) {
        int temp=niz[0];
        int min=temp;
        for(int i=0;i<niz.length;i++){
            if(niz[i]<temp){
                min=niz[i];
            }
        }return min;
    }

    private static int najveci(int[] niz) {
        int temp=niz[0];
        int max=0;
        for(int i=0;i<niz.length;i++){
            if(niz[i]>temp){
                max=niz[i];
            }
        }return max;
    }
}

