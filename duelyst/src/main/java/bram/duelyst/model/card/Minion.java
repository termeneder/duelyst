package bram.duelyst.model.card;

import javax.xml.bind.annotation.XmlElement;

public class Minion extends Card {

	@XmlElement
	private int attack;
	@XmlElement
	private int health;
	@XmlElement
	private Race race;
	
	public int getAttack() {
		return attack;
	}
	
	public int getHealth() {
		return health;
	}
	
	public Race getRace() {
		return race;
	}
	
	@Override
	public Class<?> getCardClass() {
		return Minion.class;
	}
	

}
