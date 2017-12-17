import javax.swing.JFrame;

import view.MainView;

public class Test extends JFrame{
	private static Test uniqueInstance=null;
	public static Test getInstance(){
		if(uniqueInstance==null){
			uniqueInstance = new Test();
		}
		return uniqueInstance;
	}
	private Test(){
		
	}
	public static void main(String[] args) {
//		new Test();
//		Test.getInstance();
		Test frame = new Test();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new MainView().getView());
		frame.setVisible(true);
		
	}
}
