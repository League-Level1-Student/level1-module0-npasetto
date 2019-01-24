import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class FortuneCookie implements ActionListener {
	Random rand = new Random();
    JFrame frame = new JFrame();
    JButton button = new JButton();
	public static void main(String[] args) {
		FortuneCookie cookie = new FortuneCookie();
        cookie.showButton();
	}
    public void showButton() {
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	System.out.println(JFrame.EXIT_ON_CLOSE);
    	button.addActionListener(this);
    	frame.add(button);
    	frame.pack();
    }
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null,"Woohoo!");
		int fortune=rand.nextInt(5);
		if(fortune==0) {
		JOptionPane.showMessageDialog(null, "Something bad is about to happen.");
		}else if(fortune==1) {
		JOptionPane.showMessageDialog(null, "Something good is about to happen.");
		}else if(fortune==2) {
			JOptionPane.showMessageDialog(null, "You are about to fall of a cliff.");
		}else if(fortune==3) {
			JOptionPane.showMessageDialog(null, "All your semicolons are about to go away.");
		}else {
			JOptionPane.showMessageDialog(null, "Opuijoh jt bcpvu up ibqqfo.");
		}
	}
}
