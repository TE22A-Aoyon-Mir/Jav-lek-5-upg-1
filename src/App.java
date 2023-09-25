public class App {
    public static void main(String[] args) throws Exception {

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
    }
}