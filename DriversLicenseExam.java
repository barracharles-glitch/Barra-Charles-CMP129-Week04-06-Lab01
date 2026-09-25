import java.util.Scanner;
public class DriversLicenseExam {
    public static void main(String[]args){
        int grade=0;
        Boolean bool=false;
        Scanner str_scan = new Scanner(System.in);
        String[] answers = new String[20];
        String[] anskey = {"A", "D", "B", "B", "C",
                            "B", "A", "B", "C", "D",
                            "A", "C", "D", "B", "D",
                            "C", "C", "A", "D", "B"};

        System.out.println("Welcome to the driving exam.");

        for (int i=0; i<anskey.length; i++){
            System.out.print("Enter answer " + (i+1) + " (A,B,C,D): ");
            do{
            answers[i] = str_scan.nextLine();
            if (answers[i] != "A" && answers[i] != "B"  &&
                answers[i] != "C" && answers[i] != "D"){
                    System.out.println("Not a valid answer!");
                    bool = true;
                }
            else
                bool=false;
            }while(bool);
        }

        for (int i=0; i<anskey.length;i++){
            if (anskey[i].equalsIgnoreCase(answers[i])){
                grade++;
            }
        }
                    
        System.out.println("Your grade is a " + grade/0.2 + "%");
        str_scan.close();
    }
}
