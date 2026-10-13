import java.util.*;
public class Lottery {
    public static void main(String []args){
        int[] lottery = new int[5];
        int[] user = new int[5];
        int same_nums = 0;
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

        for (int i=0; i<5; i++)
            lottery[i] = int_rand.nextInt(0, 9);

        System.out.print("Winning numbers: ");
        for (int i=0; i<5; i++){
            System.out.print(lottery[i]+" ");
            if (lottery[i] == user[i])
                same_nums += 1;
        }

        System.out.println("\nYou had "+ same_nums +" matching numbers");

        if (same_nums != 5)
            System.out.println("You didnt win the lottery.");
        else
            System.out.print("You won the lottery!");
        
        int_scan.close();
    }
}
