import java.util.Random ;

public class Games {
    public static void main(String[] args){
        Random random = new Random() ;
        int number = random.nextInt(1 ,6) ;
        System.out.println(number) ;
    }
}