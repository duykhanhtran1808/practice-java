package chap13;

// import javax.sound.midi.*;

public class Chap13 {
    public void play() {
        // try {
        //     Sequencer sequencer = MidiSystem.getSequencer();
        //     System.out.print("Sequencer is here");
        // } catch (MidiUnavailableException e) {
        //     System.out.println("Can't get sequencer");
        // }
        int[] nums = {1,2,3,4,5,6,7,8,9};
        for(int num: nums) {
            System.out.println(num);
        }
        
    }

    public static void main(String[] args) {
        Chap13 musique = new Chap13();
        musique.play();
    }
}
