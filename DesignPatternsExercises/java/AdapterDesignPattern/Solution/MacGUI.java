import java.awt.Frame;

// public class MacGUI implements __________(8)__________ {
public class MacGUI implements GUI {
	public void display() {
		Frame frame = new Frame("Mac Application");
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
