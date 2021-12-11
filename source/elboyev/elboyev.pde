 /*Created by Baxtiyor Elboyev
   page: github.com/elboyev
   */

float angle;

void setup(){
  size(900,600);
}
void draw(){
  background(0);
  //fortext
  textAlign(RIGHT);
  line(width * 0.2, 0, width * 0.2, 35);
  line(width * 0.2, 95, width * 0.2, height);
  fill(225,30,30);
  textSize(36); 
  text("github.com/elboyev", width * 0.35, 70);
  
  //forangle
  translate(width/2,height/2);
  strokeWeight(3);
  for(int i=0;i<280;i+=10){
    pushMatrix();
    rotate(radians(i)*cos(radians(angle)));
    stroke(255-i,i,i);
    line(200*cos(radians(angle)),0,0,200);
    popMatrix();
  }
  angle++;

}
