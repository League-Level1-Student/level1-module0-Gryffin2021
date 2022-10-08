package _01_methods._1_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

public class Houses {
	
	Robot rob = new Robot();
	
	public void run() {
		
			
		// Check the recipe to find out what code to put here
		//1. Have a robot start on the left side of the window near the bottom. 
		
		rob.setX(10);
		rob.setY(500);
		rob.setPenWidth(10);		
		//2. Draw a flat-topped house of height 100 with grass after it (see picture). 
		
		//3. Extract the piece of code that draws the house into a method. Draw 10 houses. 
		drawPointyHouse("small", "red");
		drawFlatHouse("large", "blue");
		drawPointyHouse("medium", "green");
		drawFlatHouse("large", "blue");
		drawPointyHouse("small","red");
		drawPointyHouse("medium","blue");
		drawPointyHouse("small","green");
		drawFlatHouse("large","red");
		drawFlatHouse("large", "green");
		drawPointyHouse("medium","blue");
		//4. Change the method to take (int height) as a parameter. Draw 9 houses of different heights 

		//5. Make the method take a String instead of an int. 

		        //“small”                 60 

		        //“medium”             120 

		        //“large”                 250 

		//6. Make the method take a color as well as a height. The houses are drawn in that color. 
		
		//[optional] Set the scene to night by setting the background to black 
		
		//7. Give the houses peaked roofs 

		//8. Extract that roof code into a method “drawPointyRoof” and create a new method: “drawFlatRoof”. 

		//9. Make large houses have flat roofs 
	}
	
	
	public void drawFlatHouse(String height, String col) {
		if(height.equals("small")){
			rob.penDown();
			rob.setSpeed(10);
			if(col.equals("red")) {
				rob.setPenColor(255,0,0);
			}else if(col.equals("green")) {
				rob.setPenColor(0,225,0);
			}else if(col.equals("blue")) {
				rob.setPenColor(0,0,255);
			}
			rob.setAngle(0);
			rob.move(60);
			rob.setAngle(90);
			rob.move(40);				
			rob.setAngle(180);
			rob.move(60);
			rob.setAngle(90);
			rob.setPenColor(0,255,0);
			rob.move(50);
		}else if(height.equals("medium")) {
			rob.penDown();
			rob.setSpeed(10);
			if(col.equals("red")) {
				rob.setPenColor(255,0,0);
			}else if(col.equals("green")) {
				rob.setPenColor(0,225,0);
			}else if(col.equals("blue")) {
				rob.setPenColor(0,0,255);
			}
			rob.setAngle(0);
			rob.move(120);
			rob.setAngle(90);
			rob.move(40);
			rob.setAngle(180);
			rob.move(120);
			rob.setAngle(90);
			rob.setPenColor(0, 255, 0);
			rob.move(50);
		}else if(height.equals("large")) {
			rob.penDown();
			rob.setSpeed(10);
			if(col.equals("red")) {
				rob.setPenColor(255,0,0);
			}else if(col.equals("green")) {
				rob.setPenColor(0,225,0);
			}else if(col.equals("blue")) {
				rob.setPenColor(0,0,255);
			}
			rob.setAngle(0);
			rob.move(250);
			rob.setAngle(90);
			rob.move(40);
			rob.setAngle(180);
			rob.move(250);
			rob.setAngle(90);
			rob.setPenColor(0, 255, 0);
			rob.move(50);
		}
	}
	public void drawPointyHouse(String height, String col) {
		if(height.equals("small")){
			rob.penDown();
			rob.setSpeed(10);
			if(col.equals("red")) {
				rob.setPenColor(255,0,0);
			}else if(col.equals("green")) {
				rob.setPenColor(0,225,0);
			}else if(col.equals("blue")) {
				rob.setPenColor(0,0,255);
			}
			rob.setAngle(0);
			rob.move(60);
			rob.turn(45);
			rob.move(20);
			rob.turn(90);
			rob.move(20);
			rob.setAngle(180);
			rob.move(60);
			rob.setAngle(90);
			rob.setPenColor(0,255,0);
			rob.move(50);
		}else if(height.equals("medium")) {
			rob.penDown();
			rob.setSpeed(10);
			if(col.equals("red")) {
				rob.setPenColor(255,0,0);
			}else if(col.equals("green")) {
				rob.setPenColor(0,225,0);
			}else if(col.equals("blue")) {
				rob.setPenColor(0,0,255);
			}
			rob.setAngle(0);
			rob.move(120);
			rob.turn(45);
			rob.move(20);
			rob.turn(90);
			rob.move(20);
			rob.setAngle(180);
			rob.move(120);
			rob.setAngle(90);
			rob.setPenColor(0, 255, 0);
			rob.move(50);
		}else if(height.equals("large")) {
			rob.penDown();
			rob.setSpeed(10);
			if(col.equals("red")) {
				rob.setPenColor(255,0,0);
			}else if(col.equals("green")) {
				rob.setPenColor(0,225,0);
			}else if(col.equals("blue")) {
				rob.setPenColor(0,0,255);
			}
			rob.setAngle(0);
			rob.move(250);
			rob.turn(45);
			rob.move(20);
			rob.turn(90);
			rob.move(20);
			rob.setAngle(180);
			rob.move(250);
			rob.setAngle(90);
			rob.setPenColor(0, 255, 0);
			rob.move(50);
		}
	}
	
}
