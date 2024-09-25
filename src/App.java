import java.util.Scanner;

public class App {
    
    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */

    public void start() {
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        doMadlib();
    }
    
    /**
     * Document what this method does here!
     */
    public void printInstructions() {

    }
    public void printGreeting (String input)  {
    System.out.println("Hello " + input); 
    System.out.println("Welcome to freaky malicious mad lib");
    System.out.println("Answer all of these questions below correctly");
        
    }
    public void doMadlib()   {
    Scanner input = new Scanner(System.in);
    boolean playAgain;
    do {
    System.out.println("Type a adjective");
    String adjective = input.nextLine();
    System.out.println("Name a country");
    String country = input.nextLine(); 
    System.out.println("Type a verb");
    String verb = input.nextLine();
    System.out.println("Type a noun");
    String noun = input.nextLine();
    System.out.println("Type a food noun");
    String foodNoun = input.nextLine();
    System.out.println("Type a verb");
    String verb1 = input.nextLine();
    System.out.println("Type a noun");
    String noun1 = input.nextLine();
    System.out.println("Type a body part");
    String bodyPart = input.nextLine();
    System.out.println("Type a noun");
    String noun2 = input.nextLine();
    System.out.println("Type an injury");
    String injury = input.nextLine();
    System.out.println("Type a noun");
    String noun3 = input.nextLine();

    System.out.println("In this " + adjective + " morning, I woke up in " + country + " under a tree. I " + verb + " to my closest " + noun + " and began to cook " + foodNoun + ". However, I " + verb1 + " with the " + noun1 + " in the floor and smacked my " + bodyPart + ". I later went to the " + noun2 + " and got treatment for my " + injury + ". While receiving I forgot my " + noun3 + " was cooking and it burned.");
    System.out.println("Do you want to play again? Yes/No");
    String response = input.nextLine();
    playAgain = response.equalsIgnoreCase("yes");
} while(playAgain);

}
   
   
   
    public String getUserName()  {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = input.nextLine();
        return name;
    }
    // add and implement the other methods you need in this area below!
    
  

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
