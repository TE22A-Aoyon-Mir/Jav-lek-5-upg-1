import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner tangentbord = new Scanner (System.in);

        //a
        int[] fält1 = new int[5];
        fält1[0] = 8;
        fält1[1] = 4;
        fält1[2] = 6;
        fält1[3] = 3;
        fält1[4] = 9;
        int antal = fält1.length;
        int summa = fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4];
        double medelvärde = summa/5;
        System.out.println("Fält1 inehåller "+fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4]+ " antal element är "+antal+ " och medelvärdet för fält 1 är "+medelvärde);

        //b
        int[] fält2 = new int[5];
        fält2[0] = 18;
        fält2[1] = 14;
        fält2[2] = 16;
        fält2[3] = 13;
        fält2[4] = 19;
        int summaf12 = fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4]+fält2[0]+fält2[1]+fält2[2]+fält2[3]+fält2[4];
        int summa1 = fält2[0]+fält2[1]+fält2[2]+fält2[3]+fält2[4];
        double medelvärde1 = summa1/5;
        System.out.println("Summan av fält1 och fält2 är "+summaf12+" och medelvärdet för fält 2 är "+medelvärde1);

        //c
        int[] summafält = new int[5];
        summafält[0] = fält1[0]+fält2[0];
        summafält[1] = fält1[1]+fält2[1];
        summafält[2] = fält1[2]+fält2[2];
        summafält[3] = fält1[3]+fält2[3];
        summafält[4] = fält1[4]+fält2[4];
        System.out.println("Summafältet är "+summafält[0]+summafält[1]+summafält[2]+summafält[3]+summafält[4]);

        //d
        int[] heltalsfält = new int[4];
        System.out.println("Ange siffror: ");
        heltalsfält[0] = tangentbord.nextInt();
        heltalsfält[1] = tangentbord.nextInt();
        heltalsfält[2] = tangentbord.nextInt();
        heltalsfält[3] = tangentbord.nextInt();
        int summa2 = heltalsfält[0]+heltalsfält[1]+heltalsfält[2]+heltalsfält[3];
        System.out.println("Summan är: "+summa2);
    }
}