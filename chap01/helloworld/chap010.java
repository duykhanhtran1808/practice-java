package chap01.helloworld;

class Movie {
    String title;
    String genre;
    int rating;

    void PlayIt() {
        System.out.println("Playing the movie");
    }
}

public class chap010 {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.title = "Cu Lao Xac Song";
        m1.genre = "Kinh di";
        m1.rating = 10;
        m1.PlayIt();
        
    } // end main method
}
