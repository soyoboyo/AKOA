package com.jza.other.examplesForTests;

public class MagicPower {

	void castSpell(String spell) {
	}

	public static void main(String[] args) {
		// A
//		MagicPower.castSpell("expelliarmus");

		// B
//		MagicPower magicPower = new MagicPower();
//		magicPower.castSpell();

		// C
//		new MagicPower.castSpell();


		// D
		new MagicPower().castSpell("expecto patronum");
	}


}
