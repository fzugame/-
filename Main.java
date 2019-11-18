package Shopping;
import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		JFrame frame=new JFrame("test");
		frame.add(new FirstWindow());
		frame.setVisible(true);
		frame.setBounds(200,150,800,600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.validate();
		
	}

}
