import ddf.minim.*; //at the very top of your sketch
Minim minim; //as a member variable
AudioPlayer song; //as a member variable
PImage Record;
int speed=0;
int turn=0;
void setup(){
  size(520,560);
  Record=loadImage("record.jpeg");
  Record.resize(520,560);
  minim = new Minim(this); //in the setup method
song = minim.loadFile("awesomeTrack.mp3", 256);//in the setup method
}
void draw(){
  rotateImage(Record,turn);
  image(Record,0,0);
  if(mousePressed){
    speed=speed+1;
  turn=turn+speed;
  song.play();
  if(song.isPlaying()==true){
    song.play();
  }
  }else{
   speed=0; 
   song.pause();
  }
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}