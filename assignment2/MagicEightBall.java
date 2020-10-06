
import java.util.Scanner;

class MagicEightBall {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int reply = (int) (Math.random()*20) + 1;
        System.out.println("Ask me anything, yes or no questions only. ");
        sc.nextLine();

        if (reply == 1) {
            System.out.println("As I see it, yes.");
        }
        else if (reply == 2) {
            System.out.println("Ask again later.");
        }
        else if (reply == 3) {
            System.out.println("Better not tell you now.");
        }
        else if (reply == 4) {
            System.out.println("Cannot predict now.");
        }
        else if (reply == 5) {
            System.out.println("Concentrate and ask again.");
        }
        else if (reply == 6) {
            System.out.println("Don’t count on it.");
        }
        else if (reply == 7) {
            System.out.println("It is certain.");
        }
        else if (reply == 8) {
            System.out.println("It is decidedly so.");
        }
        else if (reply == 9) {
            System.out.println("Most likely.");
        }
        else if (reply == 10) {
            System.out.println("My reply is no.");
        }        else if (reply == 11) {
            System.out.println("My sources say no.");
        }
        else if (reply == 12) {
            System.out.println("Outlook not so good.");
        }
        else if (reply == 13) {
            System.out.println("Outlook good.");
        }
        else if (reply == 14) {
            System.out.println("Reply hazy, try again.");
        }        else if (reply == 15) {
            System.out.println("Signs point to yes.");
        }
        else if (reply == 16) {
            System.out.println("Very doubtful.");
        }
        else if (reply == 17) {
            System.out.println("Without a doubt.");
        }
        else if (reply == 18) {
            System.out.println("Yes.");
        }
        else if (reply == 19) {
            System.out.println("Yes – definitely.");
        }
        else {
            System.out.println("You may rely on it.");
        }
    }
}