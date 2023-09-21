import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Language {
    FileReader fileReader;
    BufferedReader bufferReader;
    String fileLanguage = "Language.conf";
    String inputLanguage=setInputLanguage();

    public String createdBase=searchWord("createdBase");
    public String emptyBase=searchWord("emptyBase");
    public String errorCreateBase=searchWord("errorCreateBase");
    public String authentificationCompleted=searchWord("authentificationCompleted");
    public String nameOrPasswordWrong=searchWord("nameOrPasswordWrong");
    public String numberTry=searchWord("numberTry");
    public String regAtLestOne=searchWord("regAtLestOne");
    public String doYouWantReg=searchWord("doYouWantReg");
    public String doYouHaveAcc=searchWord("doYouHaveAcc");

    public String regNewAccount=searchWord("regNewAccount");
    public String doYouWantExit=searchWord("doYouWantExit");
    public String authentification =searchWord("authentification");
    public String authentificationLocked =searchWord("authentificationLocked");
    public String inputName=searchWord("inputName");
    public String cancel=searchWord("cancel");
    public String NameNotExist=searchWord("NameNotExist");
    public String NameAlreadyExist=searchWord("NameAlreadyExist");
    public String inputOtherName=searchWord("inputOtherName");
    public String inputPassword=searchWord("inputPassword");
    public String registrationCompleted=searchWord("registrationCompleted");
    public String languageIsIncorrect=searchWord("languageIsIncorrect");
    public String  notFound=searchWord("notFound");
    public String inputYesNo=searchWord("inputYesNo");

    public Language() throws IOException {
    }

    //  public String AccountAdded=searchWord("AccountAdded");

    // public String AccountAdded=searchWord("AccountAdded");
    //    public String AccountDeleted=searchWord("AccountDeleted");


//    public Language() throws IOException {
//    }

    public String setInputLanguage() throws IOException {
        Scanner scan = new Scanner(System.in);

        //  ==================Creat Buffer Read========================

        fileReader = new FileReader(fileLanguage);
        bufferReader = new BufferedReader(fileReader);
        //  ==================Search all language========================
        String lineSplit;
        String generalLanguage="1";
        ArrayList<String> allLanguages=new ArrayList<>();
        String line="";
        while (line != null) {
            if (line.contains("=")) {
                lineSplit=line.split("=",0)[1];
                allLanguages.add( line.split("=",0)[1]+"");

            }
            line = bufferReader.readLine();
        }                System.out.println(allLanguages);
        //  ==================input language========================

        while (!allLanguages.contains(generalLanguage)) {
            System.out.println("input correct language:" + allLanguages);
            generalLanguage = scan.nextLine();
        }
        return generalLanguage;
    }

    public String searchWord(String word) throws IOException {
        // String[] findWordSplit = new String[2];
        String[] findWordSplit=new String[3];
        fileReader = new FileReader(fileLanguage);
        bufferReader = new BufferedReader(fileReader);
        String line="";
//        line = bufferReader.readLine();
        while (line != null&&!line.equals("language="+inputLanguage)){
            line = bufferReader.readLine();
        }
        while ((line != null &&!line.equals("}")&&!line.contains(word+":"))){
            line = bufferReader.readLine();

        }
        if (line.contains(word+":")&&line != null&&!line.equals("}")) {
            findWordSplit=line.split(":\t",2);
            return findWordSplit[1];
        }else {System.out.println(" |"+word+"|    "+notFound+"    "+fileLanguage);
            return null;
        }
        // return findWordSplit[1];

    }

/**05.08.23
 */
}
