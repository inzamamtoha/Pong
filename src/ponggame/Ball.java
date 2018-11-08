package ponggame;

import java.util.Random;

class Ball {
	  private int ballX ;
	  private int ballY;
	  private int diameter;
	  private int ballDeltaX;
	  private int ballDeltaY;
	  Random rand = new Random();
	  public Ball() {
		// TODO Auto-generated constructor stub
		  ballX = 250;
		  ballY = 250;
		  diameter = 20;
		  ballDeltaX = -1;
		  ballDeltaY = 3;
	  }
	  public int getBallX()
	  {
		  return ballX;
	  }
	  public int getBallY()
	  {
		  return ballY;
	  }
	  public int getDiameter()
	  {
		  return diameter;
	  }
	  public int getBallDeltaX(){
		  return ballDeltaX;
	  }
	  
	  public int getBallDeltaY(){
		  return ballDeltaY;
	  }
	  
	  public void updateBallDeltaX(int x){
		  ballDeltaX *=x;
	  }
	  
	  public void updateBallDeltaY(int y){
		  ballDeltaY *=y;
	  }
	  
	  public void updateBallX(int x){
		  ballX+=x;
	  }
	  public void setBallDeltaX(){
		  ballDeltaX=-1;
	  }
	  public void setBallDeltaY(){
		  ballDeltaY=3;
	  }
	  public void updateBallY(int y){
		  ballY+=y;
	  }
	  public void setBallX(int x){
		  ballX = x ;
	  }
	  public void setBallY(int y){
		  ballY = y;
	  }
}
