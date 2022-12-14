package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
		String sus = "https://play-lh.googleusercontent.com/8ddL1kuoNUB5vUvgDVjYY3_6HwQcrg1K2fd_R8soD-e2QYj8fT9cfhfh3G0hnSruLKec";
		// 2. create a variable of type "Component" that will hold your image
		Component photo;
		// 3. use the "createImage()" method below to initialize your Component
		photo = createImage(sus);
		// 4. add the image to the quiz window
		quizWindow.add(photo);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String amogus = JOptionPane.showInputDialog(null, "What is this icon? (Capital first letter)");
		// 7. print "CORRECT" if the user gave the right answer
		if(amogus.equals("Among us")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}else {
		// 8. print "INCORRECT" if the answer is wrong
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(photo);
		// 10. find another image and create it (might take more than one line
		// of code)
		String sussy = "https://static.wikia.nocookie.net/amogus/images/c/cb/Susremaster.png/revision/latest?cb=20210806124552";
		Component photo2;
		photo2 = createImage(sussy);
		// 11. add the second image to the quiz window
		quizWindow.add(photo2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String amogus2 = JOptionPane.showInputDialog(null, "Who?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(amogus2.equals("AMOGUS")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
