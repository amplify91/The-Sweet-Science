package com.detour.sweetscience;

public class GameLoop {
	
	private boolean paused = true;
	private boolean hasBegun = false;
	
	private long turnStartTime = 0;
	private long currentTime = 0;
	private long deltaTime = 0;
	private long pauseTime = 0;
	
	private static final long STANCE_TIME = 1000;
	private static final long TURN_TIME = 3000;
	
	GameClient mClient;
	
	public GameLoop(GameClient client) {
		mClient = client;
	}
	
	public void tick(){
		if(hasBegun){
			currentTime = System.currentTimeMillis();
			if(!paused){
				deltaTime = currentTime - turnStartTime;
				
				if(mClient.isAbilitySelected()){
					if(mClient.isStanceSelected()){
						//1
						nextTurn();
					}else if(deltaTime>STANCE_TIME){
						//2
						//nextTurn();
					}
				}else if(deltaTime>TURN_TIME){
					if(mClient.isStanceSelected()){
						//3
						nextTurn();
					}else{
						//4
						//handle timeout
					}
				}
			}
			mClient.draw(currentTime);
			System.out.println(currentTime);
		}
	}
	
	private void nextTurn(){
		mClient.update();
		turnStartTime = System.currentTimeMillis();
		deltaTime = 0;
	}
	
	public void begin(){
		if(!hasBegun){
			deltaTime = 0;
			paused = false;
			hasBegun = true;
			turnStartTime = System.currentTimeMillis();
		}
	}
	
	public void pause(){
		paused = true;
		pauseTime = System.currentTimeMillis();
	}
	
	public void resume(){
		paused = false;
		turnStartTime += System.currentTimeMillis() - pauseTime;
	}
	
}
