package com.detour.sweetscience;

import java.util.Iterator;

import com.badlogic.gdx.utils.Array;

public class Character {
	
	protected int ID;
	
	AbilityState mAbility = AbilityState.ABILITY_BASIC;
	StanceState mStance = StanceState.STANCE_VULNERABLE;
	CharacterStats mStats;
	private Array<StatusEffect> mStatusEffects = new Array<StatusEffect>(false,16);
	private Iterator<StatusEffect> i;
	private StatusEffect tempse;
	
	public Character() {
		
	}
	
	public void update(){
		mStats.resetDeltas();
		i = mStatusEffects.iterator();
		while(i.hasNext()){
			tempse = i.next();
			if(tempse.needsRemoved()){
				i.remove();
			}else if(!tempse.isApplied()){
				tempse.update();
				tempse.reset();
			}
		}
		//execute stance or ability
		//begin animations
	}
	
	public int getCharacterID(){
		return ID;
	}
	
	public void addStatusEffect(StatusEffect effect){
		mStatusEffects.add(effect);
	}

}
