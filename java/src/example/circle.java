package example;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class circle extends Visual {
    
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


        

    }
}
