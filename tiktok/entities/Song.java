package tiktok.entities;

public class Song extends Base {
    private String singer;



    public Song(String name, int id, String singer) {
        super(name, id);
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
