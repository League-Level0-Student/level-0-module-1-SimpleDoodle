void setup(){
size(1000, 1000);
}
void draw(){
 fill(#672810);
ellipse(300, 500, 500, 500);
fill(#D13A2C);
ellipse(300, 500, 480, 480);
fill(#FFF827);
ellipse(300, 500, 465, 465);
PImage roni = loadImage("pepperoni.png");
PImage pine = loadImage("pineapple.png");
roni.resize(500,500);
pine.resize(150,150);
image(pine, 250, 500);
image(roni, 100, 140);

}