
public class Priest implements Character {
	
	private String name;
	private String weaponName;
	
	// constructor 
	
	 Priest(String name, String weaponName){
		 this.name = name;
		 this.weaponName = weaponName;
	 }
	 
	//setter or getter 
	 
	public void setName(String name) {
		this.name = name; 
	}
	public String getName() {
		return name;
	}
	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}
	public String getWeaponName() {
		return weaponName; 
	}
	
	public void dialouge(String name) {
		System.out.println(name + " is a priest weildieng mighty healing properties");
		
	}
	public void Weapon(String Weapon) {
		
		System.out.println("The " + Weapon + " is a priest weapon dealing 10 dmg a hit as well as having healing abilitys");
		
	}

}
