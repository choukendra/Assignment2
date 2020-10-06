import java.util.Scanner;

class GradeBot {

    public static void main (String[] args) {
        //100-86: A 85-73: B 72-67: C+ 66-60: C 59-50: C- 49-0: F
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double mark = 0;
        double percent = 0;

        System.out.println("What was the test out of?");
        total = sc.nextDouble();

        System.out.println("What mark did you get on your test?");
        mark = sc.nextDouble();

        if (mark > total || total <= 0) {
            System.out.println("ERROR"); 
        }else{
            percent = 100 * (mark/total);
            System.out.println("Your percentage is " + (int)percent + "%");
            if(percent >= 86){
                System.out.println("That's an A, as it should be."); 

            }else if (percent >= 73){
                System.out.println("That's a B, better try harder next time."); 

            }else if (percent >= 67){
                System.out.println("That's a C+, can you put more effort?"); 

            }else if (percent >= 60){
                System.out.println("That's a C, can't go on your phone."); 

            }else if (percent >= 50){
                System.out.println("That's a C-, can't come home tonight."); 

            }else{
                System.out.println("That's an F, find a new family."); 

            }
        }
    }
}
