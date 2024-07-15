/***15.09.23 remastered*/
/***************************************************************************************/
/**
 * 21.09.23 working
 * */
import java.io.IOException;


public class Main {
    private static Language language;
    private static BaseInterface base;
    private static Input input;
    private static Authentication auth;


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        language = new Language();
        base = new BaseObject(language);
        input = new Input(language);
        auth = new Authentication(language);

        do {
            if (base.emptyBaseFile()) {
                filingBase();
            } else {
                askAction();
            }

        } while (!WantExit());
    }

    public static void filingBase() throws IOException, ClassNotFoundException {
        System.out.println(language.emptyBase);
        System.out.println(language.regAtLestOne);
        System.out.println(language.doYouWantReg);

        switch (input.checkCommands(language.doYouWantReg)) {
            case "yes":

                Registration reg = new Registration(language);
                reg.regAcc(base, language);
                break;
            case "no":
                break;
        }
    }

    static void askAction() throws IOException, ClassNotFoundException {
        System.out.println(language.doYouHaveAcc);
//=====================General menu========================================
//=====================checking input commands========================================

        switch (input.checkCommands(language.doYouHaveAcc)) {
            case "exit":
                break;
            case "no":
                System.out.println(language.doYouWantReg);
                switch (input.checkCommands(language.doYouWantReg)) {
                    case "no":
                    case "exit":
                        break;
                    case "yes":


                        System.out.println(language.regNewAccount);
                        Registration reg = new Registration(language);
                        reg.regAcc(base, language);
                        break;
                }
                break;

            case "yes":
                auth.authFunc(base);
                break;
        }

    }

    static boolean WantExit() {
        System.out.println(language.doYouWantExit);
        return "yes".equals(input.checkCommands(language.doYouWantExit));
    }
}


//15.07.24

