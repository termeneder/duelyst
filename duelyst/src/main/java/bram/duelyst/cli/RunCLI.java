package bram.duelyst.cli;

import bram.duelyst.model.card.Card;
import bram.duelyst.model.card.Minion;
import bram.duelyst.model.card.Spell;
import bram.duelyst.model.card.set.CardSet;

public class RunCLI {

	public static void main(String[] args) {
		Card earthWalkerCard = CardSet.getInstance().getCard("Earth Walker");
		Minion earthWalker = (Minion) earthWalkerCard;
		System.out.println(earthWalker.getName());
		System.out.println(earthWalker.getCost());
		System.out.println(earthWalker.getAttack());
		System.out.println(earthWalker.getHealth());
		System.out.println(earthWalker.getCardClass());
		System.out.println(earthWalker.getRarity());
		System.out.println(earthWalker.getClassType());
		
		Card greaterFortitudeCard = CardSet.getInstance().getCard("Greater Fortitude");
		Spell greaterFortitude = (Spell) greaterFortitudeCard;
		System.out.println(greaterFortitude.getName());
		System.out.println(greaterFortitude.getCost());
		System.out.println(greaterFortitude.getCardClass());
		System.out.println(greaterFortitude.getRarity());
		System.out.println(greaterFortitude.getClassType());
	}
	
}

