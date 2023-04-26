package example;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class RotatingAudioBands extends Visual {


    public void settings()
    {
        size(800, 800, P3D);
        println("CWD: " + System.getProperty("user.dir"));
        //fullScreen(P3D, SPAN);
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
           
        }
 
    }

    public void setup()
    {
        colorMode(HSB);
        noCursor();
       
        setFrameSize(256);

        startMinim();
        loadAudio("boysaliar.mp3");
        getAudioPlayer().play();
        //startListening();
       
    }

    float radius = 200;

    float smoothedBoxSize = 0;

    float rot = 0;

    float angle = 0;
    float heartSize = 200;

    public void draw()
    {
        calculateAverageAmplitude();
        try
        {
            calculateFFT();
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        calculateFrequencyBands();
   
        background(255);
        strokeWeight(2);
        fill(255, 192, 203);
   
        float amplitude = getSmoothedAmplitude();
        float heartScale = 0.5f + amplitude * 0.5f;
        heartSize = 30 * heartScale;
   
        translate(width/2, height/2);
        rotateY(angle);
   
        // Draw left half of heart
        beginShape();
        for (float a = 0; a < PI - angle; a += 0.01)
        {
            float x = 16 * pow(sin(a), 3);
            float y = -((13 * cos(a)) - (5 * cos(2*a)) - (2 * cos(3*a)) - cos(4*a));
            x *= heartSize;
            y *= heartSize;
            vertex(x, y);
        }
        endShape(CLOSE);
   
        // Draw right half of heart
        beginShape();
        for (float a = PI + angle; a < TWO_PI; a += 0.01)
        {
            float x = 16 * pow(sin(a), 3);
            float y = -((13 * cos(a)) - (5 * cos(2*a)) - (2 * cos(3*a)) - cos(4*a));
            x *= heartSize;
            y *= heartSize;
            vertex(x, y);
        }
        endShape(CLOSE);
   
        angle += 0.001; // Increase the angle to slowly rip the heart
   
        // Reset angle when heart is fully ripped
        if (angle >= PI/2) {
            angle = 0;
        }
    }
   

   
}