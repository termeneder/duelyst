package bram.duelyst.model.card;

import javax.xml.bind.annotation.XmlElement;

import bram.duelyst.model.ClassType;

public abstract class Card {
	@XmlElement
	private int cost;
	@XmlElement
	private String name;
	@XmlElement
	private String cardText;
	@XmlElement
	private Rarity rarity;
	@XmlElement
	private ClassType classType;
	
	public int getCost() {
		return cost;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCardText() {
		return cardText;
	}
	
	public Rarity getRarity() {
		return rarity;
	}
	
	public ClassType getClassType() {
		return classType;
	}
	
	public String toString() {
		return getName();
	}
	
	public abstract Class<?> getCardClass();
}
