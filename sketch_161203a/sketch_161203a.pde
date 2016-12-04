
void setup(){import processing.sound.*;            //at the top of your sketch
SoundFile sound;  
  size(1000, 1000);
  sound = new SoundFile(this, "pop.wav");  
}
void draw(){

  PImage pepperoni = loadImage("/Users/league/Desktop/9TRgEEE8c.png");  
    image(pepperoni, 50, 50);
    if(mousePressed)
    {
    sound.play(); 
    }
}

 










