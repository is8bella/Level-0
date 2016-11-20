void setup (){
size(1000,1000);
}
void draw (){
//Feathers
fill(204,136,68);
ellipse(500,400,100,750);
ellipse(400,400,100,700);
ellipse(300,400,100,600);
ellipse(600,400,100,700);
ellipse(700,400,100,600);

//Body and Head
fill(170,102,51);
ellipse(500,600,490,490);
ellipse(500,400,300,300);

//Beak
fill(238,187,51);
triangle(450,450,550,450,500,620);

//Eyes
fill(250,250,250);
ellipse(430,400,50,50);
ellipse(560,400,50,50);
fill(0,0,0);
ellipse(430,405,20,20);
ellipse(560,405,20,20);
}
