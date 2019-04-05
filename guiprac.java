import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class guiprac extends Canvas{

	public guiprac(){
	}

	public void paint(Graphics g) {  
        g.drawLine(500, 50, 500, 500);
        g.drawLine(700, 50, 700, 500);
        g.drawLine(300, 200, 900, 200);
        g.drawLine(300, 350, 900, 350);
    }  
    public static void main(String[] args) {  
        guiprac m=new guiprac();  
        JFrame f=new JFrame();
        m.addbuttons(f);  
        f.add(m);  
        f.setSize(1778,1000);  
        //f.setLayout(null);  
        f.setVisible(true);  
    }

    public void addbuttons(JFrame f){
    	JButton[] jbArray = new JButton[9];
    	int xCoord = 375;
    	int yCoord = 100;
    	int width = 50;
    	int height = 50;
    	int tempx;
    	int tempy;
    	//JButton jb = new JButton("click me!");
    	//jb.setBounds(375, 100, 50, 50);
    	//f.add(jb);
    	for(int i = 0; i < jbArray.length; i++){
    		jbArray[i] = new JButton("" + i + "");
    		jbArray[i].setBounds(xCoord, yCoord, width, height);
    		if(i == 2 || i == 5 || i == 8){
    			xCoord = 375;
    			yCoord += 150;
    		}
    		else{
    			xCoord += 200;
    		}
    		f.add(jbArray[i]);
    	}
    } 
}