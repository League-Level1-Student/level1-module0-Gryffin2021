package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JButton button = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
	
	
	public void showButton() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        
        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        
        frame.add(panel);
        frame.pack();
        
   }
	private void playSound(String soundFile) {
		String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == button) {
		playSound("feet.wav");
		}else if(buttonPressed == button2) {
		playSound("claps.wav");
		}else if(buttonPressed == button3) {
		playSound("trees.wav");
		}
	}
}
