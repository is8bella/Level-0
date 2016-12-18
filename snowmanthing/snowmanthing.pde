PImage carrot;
PImage scarf;
PImage hat;
PImage photo;
PImage right;
PImage left;

void setup(){
  size(1000,1000);
  carrot = loadImage("carrot.png");
  carrot.resize(70,60);
  scarf = loadImage("scarf.png");
  hat = loadImage("hat.png");
  hat.resize(200,200);
  photo = loadImage("photo.gif");
  right = loadImage("right.png");
  right.resize(90,90);
  left = loadImage("left.png");
  left.resize(90,90);
}
void draw(){
  //torso
  fill(250,250,250);
  ellipse(500,700,300,300);
  ellipse(500,550,250,250);
  //head
  ellipse(500,400,200,200);
  //eyes
  fill(0,0,0);
  ellipse(470,390,20,20);
  ellipse(530,390,20,20);
  //nose
  image(carrot,440,400);
  //mouth
  ellipse(470,465,10,10);
  ellipse(485,468,10,10);
  ellipse(500,471,10,10);
  ellipse(515,468,10,10);
  ellipse(530,465,10,10);
  //scarf
  image(scarf,215,455);
  //hat
  image(hat,390,165);
  //decor
  image(photo,320,10);
  image(photo,320,900);
  image(right,100,100);
  image(left,300,300);
}



































