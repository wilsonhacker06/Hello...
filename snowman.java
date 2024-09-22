import java.awt.*;
import javax.swing.*;
class Main extends JFrame {

public Main (){
setTitle("Swing with Java");  
setSize(500,500);  
setVisible(true);
setResizable(false);  
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public void paint(Graphics gui){
//background
gui.setColor(Color.blue);
gui.fillRect(0, 0, 500, 500);
gui.setColor(Color.green);
gui.fillRect(0, 350, 500, 175);
gui.setColor(Color.yellow);
gui.fillOval(10,25,100,100);
//snow balls
gui.setColor(Color.white);
gui.fillOval(180, 250, 140,140);  
gui.setColor(Color.black);
gui.drawOval(180, 250, 140,140);
gui.setColor(Color.white);
gui.fillOval(200, 200, 105,105);  
gui.setColor(Color.black);
gui.drawOval(200,200, 105,105);  
gui.setColor(Color.white);
gui.fillOval(220, 150, 75, 75);  
gui.setColor(Color.black);
gui.drawOval(220, 150, 75,75);
//snowman buttons
gui.fillOval(240,175,10,10);
gui.fillOval(270,175,10,10);

 	int startX = 244;
		int startY = 240;
		
		for (int i = 0; i < 5; i++){ 
			gui.fillOval(startX+4, startY + i * 33, 10, 10);
		}

	gui.setColor(Color.white);
	gui.drawLine(225,250,175,200); 
	gui.drawLine(275,250,325,200); 

		
	int[] valuesX = {250,250,270};
	int[] valuesY = {190,200,195};
		
	gui.setColor(Color.orange);
	gui.fillPolygon(valuesX, valuesY, 3);
	gui.setColor(Color.black);
	gui.drawArc(237, 175, 40, 40, -20, -140);

	}
	public static void main(String[] args) {
		Main window = new Main();
	}
}
