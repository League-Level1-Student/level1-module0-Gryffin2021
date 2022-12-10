package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
    public void showButton() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if(rand == 0) {
			JOptionPane.showMessageDialog(null, "It's okay to talk to strangers...");
		}else if(rand == 1) {
			JOptionPane.showMessageDialog(null, "You can create your own happiness...");
		}else if(rand == 2) {
			JOptionPane.showMessageDialog(null, "Life's journey is always an adventure...");
		}else if(rand == 3) {
			JOptionPane.showMessageDialog(null, "It's time to show someone you care...");
		}else if(rand == 4) {
			JOptionPane.showMessageDialog(null, "Do you actually think this little text bubble is going to predict your entire future?");
		}
	}
    
}