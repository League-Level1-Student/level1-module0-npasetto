/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
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

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the interned, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
               String URL =  "https://s.yimg.com/ny/api/res/1.2/T8r7fcpu_t.g2d3chsMx3A--~A/YXBwaWQ9aGlnaGxhbmRlcjtzbT0xO3c9ODAw/http://media.zenfs.com/en-US/homerun/popsugar_us_649/00d5d1d1f4e917f79ce05dc46c2500db";
               Component comp;
		// 3. use the "createImage()" method below to initialize your Component
        comp=createImage(URL);
		// 4. add the image to the quiz window
        quizWindow.add(comp);
		// 5. call the pack() method on the quiz window
       
        quizWindow.pack();
        
		// 6. ask a question that relates to the image
        String answer = JOptionPane.showInputDialog("What is the answer to the math problem?");
		// 7. print "CORRECT" if the user gave the right answer
        if(answer.equalsIgnoreCase("1")) {
        	System.out.println("CORRECT");
        }else {
        	System.out.println("INCORRECT");
        }
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
        quizWindow.remove(comp);
		// 10. find another image and create it (might take more than one line of code)
        URL="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSR-cCPUkEM7pVevvqNZi-0l2dJ_08kG2cYNNgbKmR6cGtLtz-E";       
        comp=createImage(URL);
		quizWindow.add(comp);
        // 11. add the second image to the quiz window

		// 12. pack the quiz window
        quizWindow.pack();
		// 13. ask another question
answer = JOptionPane.showInputDialog("What is the answer to the math problem?");
		// 14+ check answer, say if correct or incorrect, etc.
        if(answer.equals("16")) {
        	System.out.println("CORRECT");
        }else {
        	System.out.println("INCORRECT");
        }
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





