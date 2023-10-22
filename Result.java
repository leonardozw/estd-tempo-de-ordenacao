public class Result {
    long time;
    String tag;

    public Result(long time, String tag) {
        this.time = time;
        this.tag = tag;
    }
    public long getTime() {
        return time;
    }
    public void setTime(long time) {
        this.time = time;
    }
    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }

}
