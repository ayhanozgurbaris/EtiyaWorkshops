public class Main {
    public static void main(String[] args) {

        //for döngüsü
        for (int i=2;i<10;i+=2){
            System.out.println(i);
        }
        System.out.println("for döngüsü bitti");


        //while döngüsü
        int i=2;

        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While döngüsü bitti");


        //do-while döngüsü
         int j =100;
         do {
             System.out.println(j);
             j+=2;
         }while (j<10);
        System.out.println("Do-while döngüsü bitti");

    }
}