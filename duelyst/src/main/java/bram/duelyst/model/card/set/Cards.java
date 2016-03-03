package bram.duelyst.model.card.set;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import bram.duelyst.model.card.Artifact;
import bram.duelyst.model.card.Minion;
import bram.duelyst.model.card.Spell;

@XmlRootElement
public class Cards {

	@XmlElement(name = "minion")
	private List<Minion> minionList;
	
	public List<Minion> getMinionList() {
		return minionList;
	}
	
	@XmlElement(name = "spell")
	private List<Spell> spellList;
	
	public List<Spell> getSpellList() {
		return spellList;
	}
	
	@XmlElement(name = "artifact")
	private List<Artifact> artifactList;
	
	public List<Artifact> getArtifactList() {
		return artifactList;
	}
}
