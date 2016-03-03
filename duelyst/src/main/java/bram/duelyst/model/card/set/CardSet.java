package bram.duelyst.model.card.set;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import bram.duelyst.exception.DuelystException;
import bram.duelyst.model.card.Artifact;
import bram.duelyst.model.card.Card;
import bram.duelyst.model.card.Minion;
import bram.duelyst.model.card.Spell;

public class CardSet {

	private final static CardSet instance = new CardSet();
	private final File cardFile = new File("src/main/resources/data/cards.xml");
	
	
	public static CardSet getInstance() {
		return instance;
	}
	
	private final Map<String, Card> cardMap;
	
	private CardSet() {
		cardMap = createCardMap();
	}

	private Map<String, Card> createCardMap() {
		Map<String, Card> newCardMap = new HashMap<String, Card>();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Cards.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Cards cards = (Cards) jaxbUnmarshaller.unmarshal(cardFile);
			for (Minion minion : cards.getMinionList()) {
				if (!newCardMap.containsKey(minion.getName())) {
					newCardMap.put(minion.getName(), minion);
				} else {
					throw new DuelystException("Multiple cards with name '"+minion.getName()+"'");
				}
			}
			for (Spell spell : cards.getSpellList()) {
				if (!newCardMap.containsKey(spell.getName())) {
					newCardMap.put(spell.getName(), spell);
				} else {
					throw new DuelystException("Multiple cards with name '"+spell.getName()+"'");
				}
			}
			for (Artifact artifact : cards.getArtifactList()) {
				if (!newCardMap.containsKey(artifact.getName())) {
					newCardMap.put(artifact.getName(), artifact);
				} else {
					throw new DuelystException("Multiple cards with name '"+artifact.getName()+"'");
				}
			}
			return newCardMap;			
		} catch (JAXBException e) {
			throw new DuelystException("Couldn't read card XML.", e);
		}
	}
	
	public Card getCard(String cardName) {
		return cardMap.get(cardName);
	}
	
}
