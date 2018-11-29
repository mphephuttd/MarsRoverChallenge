
package roverchallenge;

import java.util.*;

    public class RoverChallenge {
        
        //Declaration of all instances.
    	public static final Integer N = 1;
    	public static final Integer E = 2;
    	public static final Integer S = 3;
    	public static final Integer W = 4;
    	int x = 0;
    	int y = 0;
    	int pointing = N;
    
    	
    	//method to set the position of the rover.
        public void defaultPos(Integer x, Integer y, Integer pointing) {
    		this.x = x;
    		this.y = y;
    		this.pointing = pointing;
    	}
        
        //method to set the direction of rover using repetition structures
    	public void printPosition() {
    		char dir = 'N';
    		switch (pointing) {
                    case 1:
                        dir = 'N';
                        break;
                    case 2:
                        dir = 'E';
                        break;
                    case 3:
                        dir = 'S';
                        break;
                    case 4:
                        dir = 'W';
                        break;
                    default:
                        break;
                }
                //Method to print rover direction.
    		System.out.println("The Rover is positioned at :"+x+" " +y+ " "+ dir);
    	}
        //for loop used to determine the direction of the rover.
    	public void process(String commands) 
        
        {
    		for (int x= 0; x < commands.length();x++  ) 
             
                {
    			controller(commands.charAt(x));
    		}
    	}
        
        //repetition structure used to move the rover left, right or forward.
    	public void controller(Character command) {
                switch (command) {
                    case 'L':
                        turnLeft();
                        break;
                    case 'R':
                        turnRight();
                        break;
                    case 'M':
                        moves();
                        break;
                    default:
                        break;
                }
    	}
        
        //method is used to calculate the move the rover makes over the plain/plateau.
    	public void moves() {
    		if (Objects.equals(pointing, N)) {
    			this.y++;
    		} else if (Objects.equals(pointing, E)) {
    			this.x++;
    		} else if (Objects.equals(pointing, S)) {
    			this.y--;
    		} else if (Objects.equals(pointing, W)) {
    			this.x--;
    		}
    	}
        //method to turn rover using operators as a decision structure in boolean. 
    	public void turnLeft() {
    		pointing = (pointing - 1) < N ? W : pointing - 1;
    	}
    	public void turnRight() {
    		pointing = (pointing + 1) > W ? N : pointing + 1;
    	}
    	public static void main(String args[]) {
    		RoverChallenge rover = new RoverChallenge ();
    		rover.defaultPos(0, 0, N); //values parsed to set default position of rover.
    		rover.process("LLLMMMLMLM");
    		rover.printPosition();// Call to print position of rover.

    		rover.defaultPos(0, 0, S);
    		rover.process("MRMRMMMRRR");
    		rover.printPosition();// Call to print position of rover.

    	}
    }