package mikera.gui;

import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class BackgroundPanel extends JPanel {

	private BufferedImage image=null;

	public BackgroundPanel() {
		super();
	}
	
	public void setImage(BufferedImage b) {
		this.image=b;
	}
	
	public BufferedImage getImage() {
		return this.image;
	}
	
	public BackgroundPanel(LayoutManager layout) {
		super(layout);
	}
	
	public void paintComponent(Graphics g) {
		Rectangle r=g.getClipBounds();
		int w=image.getWidth();
		int h=image.getHeight();
		
		for (int x=r.x/w; x<(r.x+r.width); x+=w) {
			for (int y=r.y/h; y<(r.y+r.height); y+=h) {
				g.drawImage(image, x, y, null);
			}
		}
		
	}
}
