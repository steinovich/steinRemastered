import java.io.IOException;

public class BaseSQL implements BaseInterface {
    @Override
    public boolean emptyBaseFile() {
        return false;
    }

    @Override
    public void addAccount(String name, int pass) throws IOException, ClassNotFoundException {

    }

    @Override
    public int getLastID() throws IOException, ClassNotFoundException {
        return 0;
    }

    @Override
    public int getPass(String name) throws IOException, ClassNotFoundException {
        return 0;
    }

    @Override
    public boolean checkExistName(String name) throws IOException, ClassNotFoundException {
        return false;
    }
}
