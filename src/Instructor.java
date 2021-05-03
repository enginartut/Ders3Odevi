public class Instructor extends User {

    public Instructor(int id, String name, String lastName, String email) {
        super.setId(id);
        super.setName(name);
        super.setLastName(lastName);
        super.setEmail(email);
    }

    private String webpage;
    private String youtubeChannel;

    public String getWebpage() {
        return webpage;
    }

    public void setWebpage(String webpage) {
        this.webpage = webpage;
    }

    public String getYoutubeChannel() {
        return youtubeChannel;
    }

    public void setYoutubeChannel(String youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
    }


}
