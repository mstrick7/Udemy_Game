import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
public class Block extends Rectangle {
	
	Image pic;
	boolean destroyed;
	
	int posX,posY;
	int width,height;
	
	Block(int x, int y, int w, int h, String s){
		this.posX=x;
		this.posY=y;
		
		this.width=w;
		this.height=h;
		
		try {
			pic = ImageIO.read(new File("src/"+s));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		
	}
	
	public void draw(Graphics g, Component c) {
		if(!destroyed)
			g.drawImage(pic, posX, posY, width, height, c);
	}

}
