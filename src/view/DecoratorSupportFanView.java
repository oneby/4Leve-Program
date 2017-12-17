package view;

import java.awt.BorderLayout;
import java.awt.Color;


public class DecoratorSupportFanView extends FanView{
	private FanView fanView;
	public DecoratorSupportFanView(FanView fanView) {
		// TODO Auto-generated constructor stub
		super();
		this.fanView = fanView;
		this.setLayout(new BorderLayout());
		this.add("North",fanView);
		this.add("Center",new BarView(Color.BLACK));
		this.add("South",new BaseView(Color.GRAY));
	}
}
