import java.util.Scanner;

class ClassPassword {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";

        System.out.println("Answer the riddle for my secret to be revealed.");
        System.out.println("I am not alive, but I grow; I don't have lungs, but I need air; I don't have a mouth, but water kills me. What am I? "); 

        answer = sc.nextLine();

        if ("fire".equals(answer)){
            System.out.println("Correct! My secret is that I am an arsonist. (jk plz dont take it seriously)");    
        }else{
            System.out.println("Incorrect. Unable to view secret.");    
        }

    }
}

