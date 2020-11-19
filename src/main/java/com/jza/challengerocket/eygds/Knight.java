package com.jza.challengerocket.eygds;

public class Knight extends Hero {

	int staminaPoints;

	public Knight(String name, int health, int damage) {
		super(name, health, damage);
	}

	public int GetStaminaPoints() {
		return this.staminaPoints;
	}

	public void ChangeStaminaPoints(int difference) {
		this.staminaPoints += difference;
	}

	public boolean SpecialAttack(Hero target) {
		if (this.isAlive && target.GetAliveStatus() && staminaPoints >= 100) {
			target.ChangeHealth(-100);
			this.staminaPoints -= 100;
			if (target.GetHealth() <= 0) {
				target.Die();
			}
			return true;
		}
		return false;
	}

}
