package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	ArrayList<String> guestBook = new ArrayList<String>();
	
	public static void main(String[] args) {
		new GuestBook().createUI();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".

	private void createUI() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.setText("add name");
		button2.setText("view names");
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed==button1) {
			String name= JOptionPane.showInputDialog("enter your name");
			guestBook.add(name);
		}
		else {
			String message = "";
			for (int i = 0; i < guestBook.size(); i++) {
				String s = guestBook.get(i);
				message += "Guest #" + (i+1) + ": " + s + "\n";
			}
			JOptionPane.showMessageDialog(null, message);
		}
	}
}
