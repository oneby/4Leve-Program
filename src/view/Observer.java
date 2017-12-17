package view;

import java.awt.Component;

public interface Observer {
	public void update(int statue);
	public Component getMe();
}
