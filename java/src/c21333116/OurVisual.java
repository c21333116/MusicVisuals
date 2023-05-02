package c21333116;
import ie.tudublin.Visual;

public class OurVisual extends Visual{

  YASC yasc;
  Loops loop;
  CubeVisual1 cube;
  Heart h;


  public void settings(){

    size(1024, 500);


  }

  public void setup(){

    startMinim();

    // Call loadAudio to load an audio file to process 
    loadAudio("boysaliar.mp3"); 

    
    loop = new Loops(this);
    cube = new CubeVisual1(this);
    h = new Heart(this);
  }

  public void draw(){
    background(0);
    loop.draw();
  }

  public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }

        if (key == '1'){
          yasc.draw();

        }

        if (key == '2'){
          
        }

        if (key == '3'){
          cube.draw();
        }

        if (key == '4'){
          h.draw();
        }
    }
  




}