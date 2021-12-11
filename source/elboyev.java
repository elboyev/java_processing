/* 2021-12-11
* Created by Baxtiyor Elboyev
* page: github.com/elboyev
* */

import processing.core.PApplet;

public class elboyev extends PApplet {

float angle;

 public void setup(){
  /* size commented out by preprocessor */
 }
 public void draw(){
  background(0);
  //fortext
  textAlign(RIGHT);
  line(width * 0.2f, 0, width * 0.2f, 35);
  line(width * 0.2f, 95, width * 0.2f, height);
  fill(225,30,30);
  textSize(36); 
  text("github.com/elboyev", width * 0.35f, 70);
  
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
//
  public void settings() { size(900, 600); }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "elboyev" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
