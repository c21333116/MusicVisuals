package example;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class twerking extends Visual{
    
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
  
  
        ellipse(300,100,40,40);
        fill(0);
        stroke(2);
        
        rect(295,100,10,40);
        fill(0);
        stroke(2);
        
        float ass1Size = 20 + getSmoothedAmplitude() * 150;
        float ass1Offset = 147 + getSmoothedAmplitude() * 50;
        ellipse(290, ass1Offset, ass1Size, ass1Size);

        float ass2Size = 20 + getSmoothedAmplitude() * 150;
        float ass2Offset = 147 + getSmoothedAmplitude() * 50;
        ellipse(310, ass2Offset, ass2Size, ass2Size);
            
        
        line(290,160,290,180);
        strokeWeight(3);
        fill(0);
        
        line(295,160,295,180);
        strokeWeight(3);
        fill(0);
        
        line(310,160,310,180);
        strokeWeight(3);
        fill(0);
        
        line(315,160,315,180);
        strokeWeight(3);
        fill(0);
        
    }

}
