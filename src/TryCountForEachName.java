public class TryCountForEachName {
    private int tryCount;
    private String name;
    public TryCountForEachName(int tryCount, String name){
        this.tryCount=tryCount;
        this.name=name;
    }
    public TryCountForEachName(){

    }

    public int getTryCount() {
        return tryCount;

    }

    public String getName() {
        return name;
    }

    public void setTryCount(int tryCount) {
        this.tryCount = tryCount;
    }
    public void decrease(){
        tryCount--;
    }
}
