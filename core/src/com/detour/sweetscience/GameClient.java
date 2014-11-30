package com.detour.sweetscience;

import appwarp.WarpController;

public class GameClient {
	
	GameLoop mLoop;
	Character mPlayer;
	Character mOpponent;
	WarpController mWarp;
	
	private boolean stanceSelected = false;
	private boolean abilitySelected = false;
	
	public GameClient() {
		mLoop = new GameLoop(this);
		mWarp = WarpController.getInstance();
		
	}
	
	public void tick(){
		mLoop.tick();
	}
	
	public void update(){
		
		
		stanceSelected = false;
		abilitySelected = false;
	}
	
	public void draw(long time){
		
	}
	
	public boolean isStanceSelected(){
		return stanceSelected;
	}
	
	public boolean isAbilitySelected(){
		return abilitySelected;
	}
	
}
