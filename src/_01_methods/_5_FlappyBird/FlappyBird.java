package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
	
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int birdX = 250;
    int birdY = 300;
    int birdYVelocity = -10;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        
    }
    PImage back;
    PImage pipeBottom;
    PImage pipeTop;
    PImage bird;
    @Override
    public void setup() {
        size(width,height);
        back = loadImage("flappyBackground.jpg");
        pipeBottom = loadImage("bottomPipe.png");
        pipeTop = loadImage("topPipe.png");
        bird = loadImage("bird.png");
        bird.resize(50,50);
    }

    @Override
    public void draw() {
    	background(back);
        image (pipeBottom,250,375);
        image (pipeTop,250,-130);
        image (bird, birdX, birdY);
        birdY += 1;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
