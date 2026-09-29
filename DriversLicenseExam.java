import java.util.Scanner;
public class DriversLicenseExam {
    public static void main(String[]args){
        int grade=0;
        Scanner str_scan = new Scanner(System.in);
        String[] answers = new String[20];
        String[] anskey = {"A", "D", "B", "B", "C",
                            "B", "A", "B", "C", "D",
                            "A", "C", "D", "B", "D",
                            "C", "C", "A", "D", "B"};

        System.out.println("Welcome to the driving exam.");

        for (int i=0; i<anskey.length; i++){
            System.out.print("Enter answer " + (i+1) + " (A,B,C,D): ");
            answers[i] = str_scan.nextLine();

            while (!answers[i].equalsIgnoreCase("A") && 
            !answers[i].equalsIgnoreCase("B") && 
            !answers[i].equalsIgnoreCase("C") && 
            !answers[i].equalsIgnoreCase("D")){
                System.out.println("Not a valid answer!");
                System.out.print("Enter answer " + (i+1) + " (A,B,C,D): ");
                answers[i] = str_scan.nextLine();
            }
        }

        for (int i=0; i<anskey.length;i++){
            if (anskey[i].equalsIgnoreCase(answers[i])){
                grade++;
            }
            else{
                System.out.println("Answer " + (i+1) + " is wrong.");
            }
            
        }
                    
        System.out.println("Correct answers: " + grade + "\n" +
                           "Incorrect answers: " + (20-grade));
        if (grade >= 15)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");

        str_scan.close();
        
    }
}
