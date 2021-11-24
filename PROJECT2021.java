package PROJECT2021;
import java.util.Scanner;
public class PROJECT2021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter assignment marks: ");
         int assignment = in.nextInt();
        System.out.print("Enter final exam marks:");
         int final_exam=in.nextInt();
        int total= assignment + final_exam;
        System.out.print("Total marks: "+total);
        int average=total/2;
        System.out.println("\nAverage:"+average);




    }
}
