package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
	
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int birdX = 50;
    int birdYVelocity = 300;
    int gravity = 1;
    int birdY = 300;
    int pipeX = 799;
    int upperPipeHeight = (int) random(100, 400);
    int pipeGap = 135;
    int lowerY = upperPipeHeight + pipeGap;
    int pipeWidth = 120;
    int score = 0;
    boolean endGame = false;
    String s = "SCORE: " + score ;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
     
        
    }
    public void pipes() {
    	for(int i = 0; i <= 1; i ++) {
    		pipeX -= 4;
    		if(pipeX <= -100) {
    			pipeX = 799;
    			upperPipeHeight = (int) random(100, 400);
    			lowerY = upperPipeHeight + pipeGap;
    			score += 1;
            	s = "SCORE: " + score ;
    		}
    	}
    }
    PImage back;
    PImage pipeBottom;
    PImage pipeTop;
    PImage bird;
    @Override
    public void setup() {
        size(width,height);
        back = loadImage("flappyBackground.jpg");
        back.resize(WIDTH, HEIGHT);
        pipeBottom = loadImage("bottomPipe.png");
        pipeTop = loadImage("topPipe.png");
        bird = loadImage("bird.png");
        bird.resize(50,50);
        pipeTop.resize(50, upperPipeHeight);
        pipeBottom.resize(50, lowerY);
        pipeBottom.resize(50, lowerY);
    }

    @Override
    public void draw() {
    	background(back);
        image (pipeBottom,pipeX,375);
        image (pipeTop,pipeX,-130);
        image (bird, birdX, birdY + gravity);
        text(s, 25, 25);
        pipeTop.resize(50, upperPipeHeight);
        pipes();
        if(mousePressed) {
        	gravity -= 3;
        }else {
        	gravity += 2;
        }
        endGame = intersectsPipes();
        if(endGame == true) {
        	System.exit(0);
        }else {
        	endGame = false;
        	
        }
 
    }
    boolean intersectsPipes() { 
        if (birdY < upperPipeHeight && birdX > pipeX && birdX < (pipeX+pipeWidth)){
           return true; }
       else if (birdY > lowerY && birdX > pipeX && birdX < (pipeX+pipeWidth)) {
           return true; }
       else { 

    	   return false; }
}
    

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
