package ponggame;


abstract class Player {
	public abstract int getPlayerX();
	public abstract int getPlayerY();
	public abstract int getPlayerWidth();
	public abstract int getPlayerHeight();
	public abstract int getPlayerScore();
	public abstract void updatePlayerX(int paddleSpeed);
	public abstract void updatePlayerY(int paddleSpeed);
	public abstract void updatePlayerScore(int point);

}


class PlayerOne extends Player{
	private int playerOneX ;
    private int playerOneY ;
    private int playerOneWidth ;
    private int playerOneHeight ;
    private int playerOneScore;
    
    PlayerOne() {
		// TODO Auto-generated constructor stub
    	 playerOneX = 25;
         playerOneY = 250;
         playerOneWidth = 10;
         playerOneHeight = 50;
         playerOneScore=0;
	}
    
    public int getPlayerX(){
    	return playerOneX;
    }
    
    public int getPlayerY(){
    	return playerOneY;
    }
    
    public int getPlayerWidth(){
    	return playerOneWidth;
    }
    
    public int getPlayerHeight(){
    	return playerOneHeight;
    }
    
    public int getPlayerScore(){
    	return playerOneScore;
    }
    
    public void updatePlayerX(int paddleSpeed){
    	playerOneX+=paddleSpeed;
    }
    
	public void updatePlayerY(int paddleSpeed){
		playerOneY+=paddleSpeed;
	}
	
	public void updatePlayerScore(int point){
		playerOneScore+=point;
	}
}
class PlayerTwo extends Player{
	private int playerTwoX ;
    private int playerTwoY ;
    private int playerTwoWidth ;
    private int playerTwoHeight ;
    private int playerTwoScore ;
    
    PlayerTwo() {
		// TODO Auto-generated constructor stub
    	 playerTwoX = 465;
         playerTwoY = 250;
         playerTwoWidth = 10;
         playerTwoHeight = 50;
         playerTwoScore=0;
	}
    
    public int getPlayerX(){
    	return playerTwoX;
    }
    
    public int getPlayerY(){
    	return playerTwoY;
    }
    
    public int getPlayerWidth(){
    	return playerTwoWidth;
    }
    
    public int getPlayerHeight(){
    	return playerTwoHeight;
    }
    
    public int getPlayerScore(){
    	return playerTwoScore;
    }
    
    public void updatePlayerX(int paddleSpeed){
    	playerTwoX+=paddleSpeed;
    }
    
	public void updatePlayerY(int paddleSpeed){
		playerTwoY+=paddleSpeed;
	}
	
	public void updatePlayerScore(int point){
		playerTwoScore+=point;
	}
}