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
        System.out.println("Fält1 inehåller "+fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4]+ " antal element är "+antal+ " och medelvvärdet är "+medelvärde);
    }
}