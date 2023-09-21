import java.io.IOException;

public interface BaseInterface {
    boolean emptyBaseFile();

    void addAccount(String name, int pass) throws IOException, ClassNotFoundException;

    int getLastID() throws IOException, ClassNotFoundException;

    int getPass(String name) throws IOException, ClassNotFoundException;

    boolean checkExistName(String name) throws IOException, ClassNotFoundException;
}

