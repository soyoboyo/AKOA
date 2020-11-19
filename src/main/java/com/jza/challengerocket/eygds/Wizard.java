package com.jza.challengerocket.eygds;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wizard extends Hero {

	List<String> spellBook = new ArrayList<>();

	public Wizard(String name, int health, int damage) {
		super(name, health, damage);
	}

	public String[] GetSpellBook() {
		return this.spellBook.toArray(new String[this.spellBook.size()]);
	}

	public void AddToSpellBook(String spell) {
		this.spellBook.add(spell);
	}

	public boolean HealingSpell(Hero target) {
		Optional<String> healingSpell = this.spellBook.stream()
				.filter(s -> s.equals("Healing spell"))
				.findFirst();
		if (this.isAlive && target.GetAliveStatus() && healingSpell.isPresent()) {
			target.ChangeHealth(50);
			return true;
		}
		return false;
	}
}
