package com.detour.sweetscience;

import com.badlogic.gdx.Screen;

public class ScreenGame implements Screen{
	
	GameClient client;
	
	public ScreenGame() {
		client = new GameClient();
		//find server/opponent
	}

	@Override
	public void render(float delta) {
		client.tick();
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
