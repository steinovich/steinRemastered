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
                case "��":
                case "y":
                case "yes":
                case "��":
                case "YES":
                case "�":
                case "�":
                    commandRight = true;
                    out = "yes";
                    break;
                case "���":
                case "n":
                case "no":
                case "NO":
                case "���":
                case "�":
                case "�":
                    commandRight = true;
                    out = "no";
                    break;
                case "exit":
                case "EXIT":
                case "�����":
                case "�����":
                case "�":
                case "�":
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