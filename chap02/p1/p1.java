package chap02.p1;

class StreamingSong {

    String title;
    String artist;
    int duration;
  
    void play() {
      System.out.println("Playing song");
    }
  
    void printDetails() {
      System.out.println("This is " + title +
                         " by " + artist);
    }
  }
  
  class p1 {
    public static void main(String[] args) {
    StreamingSong song = new StreamingSong();
      song.artist = "The Beatles";
      song.title = "Come Together";
      song.play();
      song.printDetails();
    }
  }
