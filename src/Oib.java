import java.util.Scanner;

public class Oib {
    public static void main(String...args){
        Scanner ulaz=new Scanner(System.in);
        System.out.println("Unesi oib");
        String oib=ulaz.nextLine();
        if (oib.length()!=11){
            System.out.println("Oib nije valjan (manjak/višak) znakova");
        }
        else{

            int znak11=Character.getNumericValue(oib.charAt(10));
            int br=10;
            for(int i=0;i<oib.length()-1;i++){
                int znak1=Character.getNumericValue(oib.charAt(i));
                int korak1=znak1+br;
                if(korak1%10==0){
                    korak1=10;
                }else{
                    korak1%=10;
                }
                korak1*=2;
                korak1=korak1%11;
                br=korak1;

            }
            if(znak11==(11-br)%10){
                System.out.println("kontrolni broj je"+znak11+"OiB je valjan");

            }else{
                System.out.println("kontrolni broj je"+znak11+"OiB nije valjan");
            }




        }

    }

}
