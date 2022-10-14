package chap02.p2;

class Episode {
 
    int seriesNumber;
    int episodeNumber;
   
    void play() {
        System.out.println("PLaying");
    }

    void skipIntro() {
      System.out.println("Skipping intro...");
    }
    
    void skipToNext() {
      System.out.println("Loading next episode...");
    }
  }
  
  class p2 {
    public static void main(String[] args) {
  
      Episode episode = new Episode();
      episode.seriesNumber = 4;
      episode.play();
      episode.skipIntro();
    }
  }
