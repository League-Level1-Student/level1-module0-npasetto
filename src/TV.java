import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.*;

public class TV implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
public static void main(String[] args) {
	TV tv = new TV();
	tv.start();
}
void start() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	button1.setPreferredSize(new Dimension(150,150));
	button1.setText("Ducks");
	button1.addActionListener(this);
	button2.setPreferredSize(new Dimension(150,150));
	button2.setText("Frog");
	button2.addActionListener(this);
	button3.setPreferredSize(new Dimension(150,150));
	button3.setText("Unicorn");
	button3.addActionListener(this);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	frame.pack();
}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46youQ");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed==button1) {
		showDucks();
	}else if(buttonPressed==button2) {
		showFrog();
	}else {
		showFluffyUnicorns();
	}
}
}
