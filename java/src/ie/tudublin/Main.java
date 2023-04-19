package ie.tudublin;

import c21333116.YASC;
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
	}

	public void yasc()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new YASC());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		//main.startUI();	
		//main.heart();
		//main.yasc();
		//main.cube2();	
		//main.cube();
		main.rot();			
	}
}