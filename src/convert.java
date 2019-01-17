import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class convert implements ActionListener {
	Random rand = new Random();
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton button = new JButton();
    JTextField input = new JTextField(10);
    JTextField output = new JTextField(20);
	public static void main(String[] args) {
	convert shifter=new convert();	
    shifter.setupGUI();
	}

	void setupGUI() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(input);
		panel.add(output);
		output.setEditable(false);
		button.setText("convert");
		button.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String in = input.getText();
		String letters="abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < 26; i++) {
			in=in.replaceAll((letters.charAt(i)+""),(letters.charAt((i+13)%26)+""));
		}
		output.setText(in);	
		
		
		
	}
    
}
