package com.jza.challengerocket.eygds;

public class Hero {

	protected String name;
	protected int health;
	protected int damage;
	protected boolean isAlive = true;

	public Hero(String name, int health, int damage) {
		this.name = name;
		this.health = health;
		this.damage = damage;
	}

	public String GetName() {
		return this.name;
	}

	public int GetHealth() {
		return this.health;
	}

	public int GetDamage() {
		return this.damage;
	}

	public boolean GetAliveStatus() {
		return this.isAlive;
	}

	public void ChangeHealth(int difference) {
		this.health += difference;
	}

	public boolean Attack(Hero target) {
		if (this.isAlive && target.GetAliveStatus()) {
			target.ChangeHealth(-this.damage);
			if (target.GetHealth() <= 0) {
				target.Die();
			}
			return true;
		}
		return false;
	}

	public void Die() {
		this.isAlive = false;
	}

}
