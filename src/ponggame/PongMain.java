package ponggame;

import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

public class PongMain{

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        JFrame frame = new JFrame("Pong");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        File soundFile = new File("bass.wav");
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        
        
        PongPanel pongPanel = new PongPanel();
        frame.add(pongPanel, BorderLayout.CENTER);

        frame.setSize(500,500);
        frame.setVisible(true);

    }
}