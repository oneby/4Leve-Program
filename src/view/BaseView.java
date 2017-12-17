package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BaseView extends JPanel{
	private Color color;
	public BaseView(Color color) {
		// TODO Auto-generated constructor stub
		this.color = color;
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(5, 0, 60, 15);
	}
}
