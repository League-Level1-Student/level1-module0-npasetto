import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SoundEffectsMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
public static void main(String[] args) {
	SoundEffectsMachine machine  = new SoundEffectsMachine();
	machine.setupGUI();
}

void setupGUI() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	button1.setPreferredSize(new Dimension(100,100));
	button2.setPreferredSize(new Dimension(100,100));
	button3.setPreferredSize(new Dimension(100,100));
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed==button1) {
		playSound("drum.wav");
	}else if(buttonPressed==button2) {
		
			playSound("drum2.wav");
		
	}else {
		playSound("piano.wav");
	}
}
AudioClip sound;
String fileName="";
private void playSound(String fileName) {
	if(!this.fileName.equals(fileName)) {
	this.fileName = fileName;
	sound = JApplet.newAudioClip(getClass().getResource(fileName));
    
}
	sound.play();
}
}
