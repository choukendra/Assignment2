import java.util.Scanner;

class Example {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next("password");
        
        System.out.println("Answer the riddle for my secret to be revealed. What "); 
        if (str.equals("password")){
            System.out.println("Correct! My secret is");    
        }else{
            System.out.println("Incorrect. Unable to view secret.");    
        }

    }
}

        //... other variables go here

        //2. get user input

        //use sc.nextDouble(); to get a decimal or an int value from terminal.
        //    sc.nextInt(); to get only an int value from terminal.
        //    sc.nextBoolean(); to get a boolean from terminal.
        //    sc.nextLine(); to get a String from terminal.

        //3. calculate and display answer