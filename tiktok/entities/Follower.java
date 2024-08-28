package tiktok.entities;

public class Follower extends Base {
    private String email;
    private int numberOfLike;

    public Follower(String name, int id, String email, int numberOfLike) {
        super(name, id);
        this.email = email;
        this.numberOfLike = numberOfLike;
    }

    public Follower(String email, int numberOfLike) {
        this.email = email;
        this.numberOfLike = numberOfLike;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }
}
