package chap04.p1;

class Song {
    String title;
    String artist;

    void setTitle(String titleToSet) {
        title = titleToSet;
    }

    void setArtist(String artistToSet) {
        artist = artistToSet;
    }

    void play() {
        System.out.println("Playing " + title);
    }

    String getArtistName() {
        return artist;
    }
}

class ElectricGuitar {
    private String brand;
    private int numOfPickups;
    private boolean rockStarUsesIt;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String aBrand) {
        brand = aBrand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }

    public void setNumOfPickups(int num) {
        numOfPickups = num;
    }

    public boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    public void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }
}

public class SongList {
    public static void main(String[] args) {
        // ElectricGuitar fender2 = new ElectricGuitar();
    }
}
