import multithreading.ReverseSequencer;
import multithreading.Sequencer;

import javax.sound.midi.Sequence;

public class Main {
    public static void main(String[] args) {
        System.out.println("staring main");
        Thread t1 = new Thread(new Sequencer());
        Thread t2 = new Thread(new ReverseSequencer());
        t2.start();
        t1.start();

        for (int i = 100; i < 110; i++) {
            System.out.print(i + " ");
        }
    }
}