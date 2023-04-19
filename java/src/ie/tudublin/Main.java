package ie.tudublin;

import javax.swing.JFrame;

import c21333116.YASC;
import c21333116.EndText;
import example.CubeVisual;
import example.Heart;
import example.MyVisual;
import example.RotatingAudioBands;
import example.CubeVisual1;

public class Main
{	

	public void cube()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new CubeVisual());		
	}

	public void cube2()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new CubeVisual1());		
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> f9accc956a1d8e67f016b49965d5cef55db249e3
	}

	public void yasc()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new YASC());		
	}

<<<<<<< HEAD
=======
	

	
	 
	public static void main(String[] args) throws InterruptedException
=======
	}*/
>>>>>>> f9accc956a1d8e67f016b49965d5cef55db249e3
	public static void main(String[] args)
>>>>>>> d71dc04adc3906dac918b60466ed971d35f00436
	{
		Main main = new Main();
		//main.startUI();	
		//main.heart();
<<<<<<< HEAD
		//main.yasc();
		//main.cube2();	
		//main.cube();
		main.rot();			
=======
		//main.startUI();	

		main.cube();
		//main.rot();			

		//main.cube();
		//main.rot();			
<<<<<<< HEAD
		//main.yasc();


		JFrame frame = new JFrame("Confetti");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Confetti confetti = new Confetti(800, 600);
		frame.getContentPane().add(confetti);
		frame.pack();
		frame.setVisible(true);
		confetti.run();
		
		
=======
		//yasc();
		main.endtext();
>>>>>>> d71dc04adc3906dac918b60466ed971d35f00436
>>>>>>> f9accc956a1d8e67f016b49965d5cef55db249e3
	}
}