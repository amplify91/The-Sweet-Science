package com.detour.sweetscience;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class ScreenTitle implements Screen{
	
	Stage mStage;
	NavigationButton mPlayButton = new NavigationButton();
	NavigationButton mShopButton = new NavigationButton();
	NavigationButton mOptionsButton = new NavigationButton();

	public ScreenTitle() {
		mStage = new Stage(new ScreenViewport());
		mStage.addActor(mPlayButton);
		mStage.addActor(mShopButton);
		mStage.addActor(mOptionsButton);
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize(int width, int height) {
		mStage.getViewport().update(width, height, true);
	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(mStage);
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
