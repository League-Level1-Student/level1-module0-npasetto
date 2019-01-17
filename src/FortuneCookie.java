import javax.swing.JFrame;

public class FortuneCookie {
    JFrame frame = new JFrame();
	public static void main(String[] args) {
		FortuneCookie cookie = new FortuneCookie();
        cookie.showButton();
	}
    public void showButton() {
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
