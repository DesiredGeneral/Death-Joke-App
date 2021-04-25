import java.util.Scanner;

class mainScreen {
    public void screen() {
        System.out.print("\t===============================================\n");
        System.out.print("\t           Welcome to Desired's:\n");
        System.out.print("\t             Death Calculator\n\n");
        System.out.print("\t                 Rules:\n");
        System.out.print("\t      - Read the README.MD file first!\n");
        System.out.print("\t      - Have fun!\n");
        System.out.print("\t===============================================\n\n");
    }
}

class game {
    public void mainGame() {
        Scanner in = new Scanner(System.in);

        System.out.print("How much food do you eat on a daily?\n\n1. 5 or more meals\n2. 10 or more meals\n3. 15 or more meals\n4. 20 or more meals\n5. 25 or more meals\n\nEnter your amount(1-5): ");
        String userInput = in.nextLine();
        switch(userInput) {
            case "1":
                System.out.print("Your going to die in: 20 years");
                break;
            case "2":
                System.out.print("Your going to die in: 5 years");
                break;
            case "3":
                System.out.print("Your going to die in: 1 year");
                break;
            case "4":
                System.out.print("Your going to die in: 20 minutes");
                break;
            case "5":
                System.out.print("Your already dead.");
                break;

        }
        
        in.close();
    }

}

public class Main {
    public static void main(String[] args) {
        mainScreen mscrn = new mainScreen();
        game scrn = new game();
        mscrn.screen();
        scrn.mainGame();
    }
}