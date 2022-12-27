import java.util.Random;

/**
 * Not part of our code, just the initial Armour code given by the prof
 */
public class ArmourInfo {

	Random random = new Random();
	private int rarity;
	private String slot;
	private String mod1;
	private String mod2;
	private String mod3;
	
	public ArmourInfo() {
		
		int gearSlot = random.nextInt(4);
		if(gearSlot == 0) {
			slot = "Helm"; 
		}
		else if(gearSlot == 1) {
			slot = "Chest Piece";
		}
		else if(gearSlot == 2) {
			slot = "Gloves";
		}
		else if(gearSlot == 3) {
			slot = "Boots";
		}
		
		rarity = random.nextInt(4);
		if(rarity == 3) {
			mod1 = getRandomAttribute();
			mod2 = getRandomAttribute();
			mod3 = getRandomAttribute();
		}
		else if(rarity == 2) {
			mod1 = getRandomAttribute();
			mod2 = getRandomAttribute();
		}
		else if(rarity == 1) {
			mod1 = getRandomAttribute();
		}
	}
	
	private String getRandomAttribute() {
		int r = random.nextInt(3);
		if(r == 0) return "Bonuses.Strength + 5";
		if(r == 1) return "Bonuses.Intelligence + 5";
		return "Bonuses.Dexterity + 5";
	}
	
	private String getRarityDescription() {
		if(rarity == 0) return "Common";
		if(rarity == 1) return "Uncommon";
		if(rarity == 2) return "Rare";
		return "Epic";
	}
	
	public String getDescription() {
		String descript = getRarityDescription() + " " + slot + ":\n";
		if(rarity == 3) {
			descript = descript + mod1 + "\n";
			descript = descript + mod2 + "\n";
			descript = descript + mod3 + "\n";
		}
		if(rarity == 2) {
			descript = descript + mod1 + "\n";
			descript = descript + mod2 + "\n";
		}
		if(rarity == 1) {
			descript = descript + mod1 + "\n";
		}
		return descript;
	}
	
}
