package com.detour.sweetscience;

public class StatusEffectFactory {
	
	//private static StatusEffectFactory factory = new StatusEffectFactory();
	
	private StatusEffectFactory() {
		
	}
	
	/*public static StatusEffectFactory getFactory(){
		return factory;
	}*/
	
	public static StatusEffect powerAugment(final Character target, Character source, int duration, final int deltaPower){
		return new StatusEffect(target, source, duration) {
			
			@Override
			protected void apply() {
				target.mStats.setDeltaPower(target.mStats.getDeltaPower() + deltaPower);
			}
		};
	}
	
	public static StatusEffect agilityAugment(final Character target, Character source, int duration, final int deltaAgility){
		return new StatusEffect(target, source, duration) {
			
			@Override
			protected void apply() {
				target.mStats.setDeltaAgility(target.mStats.getDeltaAgility() + deltaAgility);
			}
		};
	}
	
	public static StatusEffect defenseAugment(final Character target, Character source, int duration, final int deltaDefense){
		return new StatusEffect(target, source, duration) {
			
			@Override
			protected void apply() {
				target.mStats.setDeltaDefense(target.mStats.getDeltaDefense() + deltaDefense);
			}
		};
	}
	
}
