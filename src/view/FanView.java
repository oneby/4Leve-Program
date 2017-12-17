package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FanView extends JPanel implements Runnable, Observer {
	private int increment;
	private int statue;

	public FanView() {
		// TODO Auto-generated constructor stub
		increment = 10;
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		if (statue == 2) {
			g.setColor(Color.RED);
		} else {
			g.setColor(Color.BLUE);
		}
		for (int i = 0; i < 4; i++) {
			g.fillArc(10, 10, 300, 300, i * (360 / 4) + increment, 40);
		}

	}

	@Override
	public void update(int statue) {
		// TODO Auto-generated method stub
		this.statue = statue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			increment += 2;
			if (statue == 3) {
				increment += 5;
			} else if (statue == 4) {
				increment += 10;
			} else if (statue == 5) {
				increment += 15;
			} else if (statue == 0) {
				increment = 0;
			}
			this.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
	}

	@Override
	public Component getMe() {
		// TODO Auto-generated method stub
		return this;
	}

}
