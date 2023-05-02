package c21333116;

import java.util.ArrayList;

import processing.core.PApplet;

import processing.core.PVector;

public class YASC extends PApplet
{
	Ship ship;
	Ship ship1;
	Ship ship2;
	Ship ship3;
	Ship ship4;
	Ship ship5;
	/*Ship ship6;
	Ship ship7;
	Ship ship8;
	Ship ship9;
	Ship ship10;
*/
	
	OurVisual v;


	public YASC(OurVisual v)
	{
			this.v = v;
			
	}


	public boolean[] keys = new boolean[1024]; 

	public void keyPressed()
	{
		keys[keyCode] = true;
	}

	public void keyReleased()
	{
		keys[keyCode] = false;
	}

	// Generic
	public ArrayList<Bullet> bullets = new ArrayList<Bullet>();


	public void settings()
	{
		size(500, 500);

		PVector a = new PVector(10, 10);
        PVector b = new PVector(20, 20);

        b = a;
        
        b.x = 30;
        b.y = 30;

        println(a);
		
	}

	String s3 = "Hello";

	public void setup() {
		ship = new Ship(width / 2, height / 2, 80, 6, this);
		ship1 = new Ship(100, 100, 80, 6, this);
		ship2 = new Ship(200, 200, 80, 6, this); // Initialize ship2
        ship3 = new Ship(300, 300, 80, 6, this); // Initialize ship3
		ship4 = new Ship(400, 400, 80, 6, this); // Initialize ship4
        ship5 = new Ship(500, 500, 80, 6, this); // Initialize ship5
		//ship6 = new Ship(200, 200, 60, 8, this); // Initialize ship6
        //ship7 = new Ship(300, 300, 70, 10, this); // Initialize ship7
		//ship8 = new Ship(200, 200, 60, 8, this); // Initialize ship8
        //ship9 = new Ship(300, 300, 70, 10, this); // Initialize ship9
		//ship10 = new Ship(300, 300, 70, 10, this); // Initialize ship10


			colorMode(HSB);

		String s = "I love Star Trek";

		s += " & 200AD";

		String s1 = s.substring(2, 6);

		println(s.substring(7, 11));

		println(s.indexOf("Trek"));

		println(s.startsWith("Ilove"));

		String ss3 = "Hell";
		String temp = "o";
		String s2 = "Hello";
		
		String s4 = ss3 + temp;

		println(s4 == s2);
		println(s4.equals(s2));
		


		println();

		/*startsWith
		endsWidth
		substring
		indexOf
		s1.chatAt
		s1.lastIndexOf
		s1.toUpperCase()
		s1.compareTo(s)
		s1.equals
		s1.

		println(s1);
		*/
	}

	public void draw()
	{	background(0);
		ship.render();
		ship.move();

		ship1.render();
		ship1.move();
		ship2.render(); // Render ship2
        ship2.move(); // Move ship2

        ship3.render(); // Render ship3
        ship3.move(); // Move ship3
 
		ship4.render(); // Render ship4
        ship4.move(); // Move ship4

		ship5.render(); // Render ship5
        ship5.move(); // Move ship5

		/*ship6.render(); // Render ship6
        ship6.move(); // Move ship6

		ship7.render(); // Render ship7
        ship7.move(); // Move ship7

		ship8.render(); // Render ship8
        ship8.move(); // Move ship8

		ship9.render(); // Render ship9
        ship9.move(); // Move ship9

*/

		for(int i = bullets.size() - 1 ; i >= 0 ; i --)
		{
			Bullet b = bullets.get(i);
			b.render();
			b.move();
		}
		

		fill(255);
		text("Bullets: " + bullets.size(), 50, 50);

	}
}
