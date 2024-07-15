import java.util.Scanner;

public class Input {
    Language language;
    Scanner scan = new Scanner(System.in);
    public Input(Language lng){
        language=lng;
    }
    public String checkCommands(String phrase) {
        boolean commandRight = false;
        String out = "";
        String command = scan.nextLine();
        do {
            switch (command) {
                case "äà":
                case "y":
                case "yes":
                case "ÄÀ":
                case "YES":
                case "ä":
                case "Ä":
                    commandRight = true;
                    out = "yes";
                    break;
                case "íåò":
                case "n":
                case "no":
                case "NO":
                case "ÍÅÒ":
                case "Í":
                case "í":
                    commandRight = true;
                    out = "no";
                    break;
                case "exit":
                case "EXIT":
                case "âûõîä":
                case "ÂÛÕÎÄ":
                case "Â":
                case "â":
                case "e":
                    commandRight = true;
                    out = "exit";
                    break;
                default:
                    System.out.println(phrase);
                    command = scan.nextLine();
            }
        } while (!commandRight);
        return out;
    }
}
//25.06.23