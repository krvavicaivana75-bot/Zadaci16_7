import java.util.Scanner;

/*Napišite Java program koji će stvoriti i ispisati kvadratnu matricu zadane veličine
Korisnik treba unijeti veličinu matrice (npr. 3 za matricu 3x3, 4 za matricu 4x4)
*/
public class Zadatak3 {
    public static void main(String...args){
        Scanner ulaz=new Scanner(System.in);
        System.out.println("unesi veličinu matrice");
        int vel_matrice=ulaz.nextInt();

        for(int i=0;i<vel_matrice;i++){
            System.out.print("|");
            for(int j=0;j<vel_matrice;j++){
                System.out.print("X"+(i+1)+(j+1)+"  ");
                            }
            System.out.println("|");
        }
    }
}
