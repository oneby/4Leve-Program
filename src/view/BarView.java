package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BarView extends JPanel {
	private Color color;

	public BarView(Color color) {
		// TODO Auto-generated constructor stub
		this.color = color;
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(5, 0, 20, 50);
	}
}
