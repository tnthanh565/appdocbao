package demo;

public class news {
    int newid;
    String newtitle;
    byte[] newImage;
    String path;

    public news(int newid, String newtitle, String path) {
        this.newid = newid;
        this.newtitle = newtitle;
        this.path = path;
    }

    public int getNewid() {
        return newid;
    }

    public void setNewid(int newid) {
        this.newid = newid;
    }

    public String getNewtitle() {
        return newtitle;
    }

    public void setNewtitle(String newtitle) {
        this.newtitle = newtitle;
    }

    public byte[] getNewImage() {
        return newImage;
    }

    public void setNewImage(byte[] newImage) {
        this.newImage = newImage;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
