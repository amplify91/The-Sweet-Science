package com.detour.sweetscience;

import com.badlogic.gdx.Game;

public class SSGame extends Game {
	
	public static ScreenSplash mScreenSplash;
	public static ScreenTitle mScreenTitle;
	public static ScreenOptions mScreenOptions;
	public static ScreenShop mScreenShop;
	public static ScreenCharacterSelect mScreenCharacterSelect;
	public static ScreenGame mScreenGame;
	public static ScreenResults mScreenResults;
	
	private static SSGame mGame = new SSGame();
	
	private SSGame(){
		//Never access me from within the server class!
	}
	
	public static SSGame getGame(){
		return mGame;
	}
	
	@Override
	public void create () {
		
		mScreenSplash = new ScreenSplash();
		mScreenTitle = new ScreenTitle();
		mScreenOptions = new ScreenOptions();
		mScreenShop = new ScreenShop();
		mScreenCharacterSelect = new ScreenCharacterSelect();
		mScreenGame = new ScreenGame();
		mScreenResults = new ScreenResults();
		
		setScreen(mScreenSplash);
		
	}

	@Override
	public void render () {
		
	}
	
}
