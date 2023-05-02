package c21333116;
import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class OurVisual extends Visual{

  YASC yasc;
  Loops loop;
  CubeVisual1 cube;
  Heart h;


  public void settings(){

    //size(1024, 500);
    fullScreen();

  }

  public void setup(){

    startMinim();

    // Call loadAudio to load an audio file to process 
    loadAudio("boysaliar.mp3"); 

    
    loop = new Loops(this);
    cube = new CubeVisual1(this);
    h = new Heart(this);
    yasc = new YASC(this);
  }
  

  public void keyPressed()
    {
        if (key == ' ') //bind to spacebar
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();

            cube.draw();
        }

        if (key == '1'){
          yasc.draw();

          fill(255,0, 0);
          circle(400, 400, 200);

        }

        if (key == '2'){
          loop.draw();
        }

        if (key == '3'){
          
        }

        if (key == '4'){
          h.draw();
        }
    }

    public void draw(){
      background(0);

    }
  




}