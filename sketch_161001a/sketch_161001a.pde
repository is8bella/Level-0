void setup (){
  size(500,500);
 for(int i = 10; i >= 0; i--){
 ellipse (width/2, height/2, i*width/10, i*height/10);
   if(i%2==0){
   fill(0,255,0);
   }
   else{
   fill(255,255,255);
   }
   if(i%4==0){
   fill(255,0,0);
   }
 }
}
