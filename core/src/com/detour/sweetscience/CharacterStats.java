package com.detour.sweetscience;

public class CharacterStats {
	
	private int health;
	private int energy;
	private int stun;
	private int basePower;
	private int deltaPower;
	private int baseAgility;
	private int deltaAgility;
	private int baseDefense;
	private int deltaDefense;
	private boolean stunned = false;
	
	public CharacterStats() {
		reset();
	}
	
	public void reset(){
		health = 100;
		energy = 100;
		stun = 0;
		stunned = false;
		resetDeltas();
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = range0_100(health);
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = range0_100(energy);
	}

	public int getStun() {
		return stun;
	}

	public void setStun(int stun) {
		this.stun = range0_100(stun);
	}

	public int getBasePower() {
		return basePower;
	}

	public void setBasePower(int basePower) {
		this.basePower = range1_99(basePower);
	}

	public int getDeltaPower() {
		return deltaPower;
	}

	public void setDeltaPower(int deltaPower) {
		this.deltaPower = deltaPower;
	}
	
	public int getTruePower(){
		return range1_99(getBasePower()+getDeltaPower());
	}

	public int getBaseAgility() {
		return baseAgility;
	}

	public void setBaseAgility(int baseAgility) {
		this.baseAgility = range1_99(baseAgility);
	}

	public int getDeltaAgility() {
		return deltaAgility;
	}

	public void setDeltaAgility(int deltaAgility) {
		this.deltaAgility = deltaAgility;
	}
	
	public int getTrueAgility(){
		return range1_99(getBaseAgility()+getDeltaAgility());
	}

	public int getBaseDefense() {
		return baseDefense;
	}

	public void setBaseDefense(int baseDefense) {
		this.baseDefense = range1_99(baseDefense);
	}

	public int getDeltaDefense() {
		return deltaDefense;
	}

	public void setDeltaDefense(int deltaDefense) {
		this.deltaDefense = deltaDefense;
	}
	
	public int getTrueDefense(){
		return range1_99(getBaseDefense()+getDeltaDefense());
	}

	public boolean isStunned() {
		return stunned;
	}

	public void setStunned(boolean stunned) {
		this.stunned = stunned;
	}
	
	public void resetDeltas(){
		deltaPower = 0;
		deltaAgility = 0;
		deltaDefense = 0;
	}
	
	private int range0_100(int stat){
		if(stat<0){
			stat = 0;
		}else if(stat>100){
			stat = 100;
		}
		return stat;
	}
	
	private int range1_99(int stat){
		if(stat<1){
			stat = 1;
		}else if(stat>99){
			stat = 99;
		}
		return stat;
	}

}
