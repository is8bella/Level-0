void setup() {
  size(500, 500);
}
void draw() {
  background(200, 200, 200);
  noStroke();
  fill(221,119,34);
  ellipse(150, 200, 150, 150);
  ellipse(212, 200, 150, 150);
  fill(17,136,34);
  rect(176, 103, 12, 32);
  fill(0,0,0);
  ellipse(140, 200, 35,35);
  ellipse(240, 200, 35,35);
  rect(150,250,90,9);
  
  if(mousePressed){
  fill(200,200,200);
  ellipse(80,200,50,50);
  }

}

