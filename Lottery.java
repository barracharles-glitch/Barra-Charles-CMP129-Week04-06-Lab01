import java.util.*;
public class Lottery {
    public static void main(String []args){
        int[] lottery = new int[5];
        int[] user = new int[5];
        Scanner int_scan = new Scanner(System.in);
        Random int_rand = new Random();

        System.out.println("Enter your five lottery numbers:");
        for (int i=0; i<5; i++){
            System.out.print(i+1 + ": ");
            user[i] = int_scan.nextInt();
            while (user[i] > 9 || user[i] < 0){
                System.out.println("Not a valid number please try again");
                System.out.print(i+1 + ": ");
                user[i] = int_scan.nextInt();
            }
        }

        for (int i=0; i<5; i++){
            lottery[i] = int_rand.nextInt(0, 9);
        }
    }
}
