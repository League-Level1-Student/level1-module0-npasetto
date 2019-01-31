int ypos = 0;
int xpos = 0;
int score=0;
int hiScore=0;
float size = 50;
void setup(){
  size(500,500);
  xpos=(int) random(50,450);
}
void draw(){
  background(0,0,255);
  fill(0,0,0);
  stroke(0,255,0);
  ellipse(xpos,ypos,size,40);
  ypos=ypos+10;
  if(ypos>500){
   ypos=0;
   xpos=(int) random(50,450);
   if(score>0){
   score--;
   size=size*11/10;
   }
  }
  rect(mouseX,450,size,50);
  if(ypos>400 && xpos>mouseX && xpos<mouseX+size){
    score++;
    ypos=0;
    xpos=(int) random(50,450);
    size=size*10/11;
  }
  fill(0,0,0);
  textSize(16);
  text("Score: "+score, 20, 20);
  if(score>hiScore){
   hiScore=score; 
  }
  text("High Score: "+hiScore, 20, 50);
}