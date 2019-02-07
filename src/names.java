import javax.swing.JOptionPane;

public class names {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What name do you want to abbreviate?");
	String initials = name.charAt(0)+".";
	int n = 1;
	while(name.charAt(n)!=' ') {
		n++;
	}
	initials=initials+name.charAt(n+1);
	JOptionPane.showMessageDialog(null, initials);
}
}
