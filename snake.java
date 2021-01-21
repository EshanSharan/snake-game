package snake;
import javax.swing.*;

public class snake extends JFrame{

	snake(){
		add(new board());
		pack();
		setLocationRelativeTo(null);
		setTitle("Snake Game");
		setResizable(false);
		//setLocation(400,200);same as above function just typing manually
	}

	public static void main(String[] args) {
		new snake().setVisible(true);
	}
}
