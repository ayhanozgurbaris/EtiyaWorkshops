public class Main {
    public static void main(String[] args) {

        int number = 9;
        int total = 0;

        for(int i=1; i<number; i++){
            if(number % i == 0){
                total = total + i;
            }
        }

        if(total == number){
            System.out.println("Mukemmel sayi");

        }else
            System.out.println("mukemmel sayi degil");



    }
}