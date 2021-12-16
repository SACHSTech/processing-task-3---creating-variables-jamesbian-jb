import processing.core.PApplet;


public class Sketch extends PApplet {
	public float randheight = random(1,400);
  public float randwidth = random(1, 400);
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

      stroke(122);
      fill(255,105,105);
      ellipse(randwidth, randheight, 30, 60); 
      ellipse(randwidth - 40, randheight, 30, 60);
      fill(245,245,245);
      stroke(122);
      ellipse(randwidth - 24, randheight - 85, 70, 150);
      
      //Antenna
      line(randwidth - 25, randheight - 160, randwidth - 25, randheight - 180);
  
      //Window
      fill(197,224,255);
      ellipse(randwidth- 25, randheight - 115, 40, 40); 
  }
    }

    
  
