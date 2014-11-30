package com.detour.sweetscience;


public abstract class StatusEffect {
	
	int mDuration;
	Character mTarget;
	Character mSource;
	protected boolean isFriendly = false;
	protected boolean isApplied = false;
	protected boolean needsRemoved = false;
	
	public StatusEffect(Character target, Character source, int duration) {
		
		mTarget = target;
		mSource = source;
		mDuration = duration;
		if(mTarget==mSource) isFriendly = true;
		mTarget.addStatusEffect(this);
		
	}
	
	public void update(){
		if(mDuration==0){
			needsRemoved = true;
		}else{
			apply();
			if(mDuration!=-1){
				//-1 duration means a permanent effect.
				mDuration--;
			}
		}
		isApplied = true;
	}
	
	protected abstract void apply();
	
	public boolean isApplied(){
		//returns true if this effect has been applied already this turn;
		return isApplied;
	}
	
	public boolean isFriendly(){
		return isFriendly;
	}
	
	public boolean needsRemoved(){
		return needsRemoved;
	}
	
	public void reset(){
		isApplied = false;
	}
	
}
