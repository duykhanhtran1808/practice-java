package chap11;
import java.util.*;

public class Chap11 {   
    public static void main(String[] args) {
        List<SongV3> listSong = Songs.getSongsV3();
        System.out.println("Original: " + listSong);

        // Collections.sort(listSong);
        listSong.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println("Title sort: " + listSong);

        // ArtistCompare artistCompare = new ArtistCompare();
        // listSong.sort(artistCompare);
        listSong.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
        System.out.println("Artist sort: " + listSong);

        listSong.sort(new Comparator<SongV3>() {
            public int compare(SongV3 one, SongV3 two) {
                return one.getBpm() - two.getBpm();
            }
        });
        System.out.println("BPM sort: " + listSong);

        listSong.sort((one, two) -> two.getTitle().compareTo(one.getTitle()));
        System.out.println("Title sort (Desc): " + listSong);

        Set<SongV3> songSet = new HashSet<>(listSong);
        System.out.println("HashSet: " + songSet);

        Set<SongV3> songTreeSet = new TreeSet<>(listSong);
        System.out.println("TreeSet: " + songTreeSet);

        Set<SongV3> songTreeSet2 = new TreeSet<>((o1, o2) -> o1.getBpm() - o2.getBpm());
        songTreeSet2.addAll(listSong);
        System.out.println("TreeSetComparator: " + songTreeSet2);

    }
}

class Songs {
    public static List<String> getSongStrings () {
        List<String> songList = new ArrayList<>();
        songList.add("Nang Am Xa Dan");
        songList.add("2-1=0");
        songList.add("#3 Vol 6");
        songList.add("con mua ngang qua");
        songList.add("anh sai roi");

        return songList;
    }

    public static List<SongV3> getSongsV3 () {
        List<SongV3> songs = new ArrayList<>();

        songs.add(new SongV3("Neu", "Marzuz", 80));
        songs.add(new SongV3("Happy Birthday", "Phan Dinh Tung", 120));
        songs.add(new SongV3("Happy Birthday", "Phan Dinh Tung", 120));
        songs.add(new SongV3("2-1=0", "huyen thoai", 150));
        songs.add(new SongV3("420", "beastmode", 100));
        songs.add(new SongV3("#3 3107", "Nau", 90));
        songs.add(new SongV3("Con mua ngang qua", "Son Tung MTP", 95));
        songs.add(new SongV3("Con mua ngang qua", "Son Tung MTP", 95));


        return songs;
    }
}

class SongV2 {
    private String title; 
    private String artist; 
    private int bpm; 

    public SongV2(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return this.title;
    }
    public String getArtist() {
        return this.artist;
    }
    public int getBpm() {
        return this.bpm;
    }

    public String toString() {
        return this.title;
    }
}
class SongV3  implements Comparable<SongV3>{
    private String title; 
    private String artist; 
    private int bpm; 

    @Override
    public boolean equals(Object aSong) {
        SongV3 other = (SongV3) aSong;
        return this.title.equals(other.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public int compareTo(SongV3 s) {
        return title.compareTo(s.getTitle());
    }

    public SongV3(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return this.title;
    }
    public String getArtist() {
        return this.artist;
    }
    public int getBpm() {
        return this.bpm;
    }

    public String toString() {
        return this.title + ": " + this.artist;
    }
}

class ArtistCompare implements Comparator<SongV3> {
    @Override
    public int compare(SongV3 one, SongV3 two) {
        return one.getArtist().compareTo(two.getArtist());
    }
}