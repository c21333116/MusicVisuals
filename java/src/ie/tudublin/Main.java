package ie.tudublin;

import javax.swing.JFrame;

import c21333116.YASC;
import example.CubeVisual;
import example.Heart;
import example.MyVisual;
import example.RotatingAudioBands;

public class Main
{	

	public void cube()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new CubeVisual());		
	}
	public void rot()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new RotatingAudioBands());		
	}
	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new MyVisual());		
	}

	public void heart()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Heart());		
	}
	public static void yasc()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new YASC());
    }

	

	
	 
	public static void main(String[] args) throws InterruptedException
	{
		Main main = new Main();
		//main.startUI();	
		//main.heart();
		//main.startUI();	
		//main.cube();
		//main.rot();			
		//main.yasc();


		JFrame frame = new JFrame("Confetti");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Confetti confetti = new Confetti(800, 600);
		frame.getContentPane().add(confetti);
		frame.pack();
		frame.setVisible(true);
		confetti.run();
		
		
	}
}