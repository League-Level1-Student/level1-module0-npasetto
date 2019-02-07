int amount=0;
void setup(){
  size(600,600, P2D);
  background(0,0,0);
}
void draw(){
  makeMagical();
  for(int i = 0; i<amount; i++){
    fill(0,0,255);
    ellipse(getWormX(i),getWormY(i),0.5,0.5);
  }
  if(mousePressed){
    amount++;
  }
  text(amount+"",50,50);
}
float frequency = .001;
float noiseInterval = PI/40;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}