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
     * This intruction tells you what you are supposed to do.
     */
    public void printInstructions() {

    }

    public void printGreeting(String input) {
        System.out.println("Hello " + input);
        System.out.println("Welcome to freaky malicious madlibs");
        System.out.println("Answer all of these questions below correctly");

    }

    /** Does the madlib */
    public void doMadlib() {
        Scanner input = new Scanner(System.in); /** This scanner works for the whole method and its function is
        incorporate very word that is written after every question into the madlib*/
        boolean playAgain;

        do {
            System.out.println("Which madlib do you want to play? 1 or 2");
            String response2 = input.nextLine();
           
           
            if(response2.equals("1")) {
                doMadlib1();
            }else {
                doMadlib2();
            }
            /** This piece of code is made to give the player an option to choose what madlib they want to play.
             * Depending on the response2 you will play madlib 1 or 2 */
            


            System.out.println("Do you want to play again? Yes/No");
            String response = input.nextLine();
            playAgain = response.equalsIgnoreCase("yes"); /** This loop is made to ask the player if they want to play 
            again, if yes (boolean) it takes you back to the begin
            where all of the questions are asked again to recreate themadlib */
        } while (playAgain);
            /** I learned this by my classmate Pedro Martins */
    }

    public void doMadlib1() {
        Scanner input = new Scanner(System.in); /** This scanner works for the whole method and its function is
        incorporate very word that is written after every question into the madlib*/
        System.out.println("Type a adjective"); /** Below there are different questions and after the output the word
            included goes directly to the output that includes the whole
            story of the madlib. */ 
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

            System.out.println("In this " + adjective + " morning, I woke up in " + country + " under a tree. I " + verb
                    + " to my closest " + noun + " and began to cook " + foodNoun + ". However, I " + verb1
                    + " with the " + noun1 + " in the floor and smacked my " + bodyPart + ". I later went to the "
                    + noun2 + " and got treatment for my " + injury + ". While receiving I forgot my " + noun3
                    + " was cooking and it burned.");
                    /** This is the main code of the madlib and all of the answered above are added into this piece of code */
    }

    public void doMadlib2() {
        Scanner input = new Scanner(System.in); /** This scanner works for the whole method and its function is
        incorporate very word that is written after every question into the madlib*/
        /** I also made a new method in which I created a econd madlib */
        System.out.println("Type a verb"); /** Below there are different questions and after the output the word
            included goes directly to the output that includes the whole
            story of the madlib. */ 
            String verb = input.nextLine();
            System.out.println("Type a verb");
            String verb1 = input.nextLine();
            System.out.println("Type a room in a house");
            String roomInAHouse = input.nextLine();
            System.out.println("Type a verb");
            String verb2 = input.nextLine();
            System.out.println("Type a food");
            String food = input.nextLine();
            System.out.println("Type a verb");
            String verb3 = input.nextLine();
            System.out.println("Type a noun");
            String noun = input.nextLine();
            System.out.println("Type a body part");
            String bodyPart = input.nextLine();
            System.out.println("Type a verb");
            String verb4 = input.nextLine();

            System.out.println("Today I " + verb + " up and " + verb1 + " to my " + roomInAHouse + ". While " + verb2 + ", I thought of " + food + ". However, I " + verb3
                    + " myself into a " + noun + ". Because of this, I broke my " + bodyPart + ". Now, I am not able to " + verb4 + " for the rest of my life.");
                    /** This is the main code of the madlib and all of the answered above are added into this piece of code */
    }

    public String getUserName() {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = input.nextLine();
        return name;
        /** Here I include the initial questions of the madlib which ask you your name to say hello.
         * After this the main code of the madlib begins */
    }

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
