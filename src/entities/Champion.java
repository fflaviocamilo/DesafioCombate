package entities;

public class Champion {
	
	private String name;
	private int life;
	private int damange;
	private int attack;
	private int armor;
	
	public void Champion (String name, int life,int damange, int attack, int armor) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
		
	}
	public Champion (String name, int life, int attack, int armor) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
		
	}
	
	public Champion () {
		// TODO Auto-generated constructor stub
		
		
	}
	

	public void takeDamange(String name, int life,int damange, int attack, int armor) {
		if (armor > attack ) {
			this.name = name;
			damange = life - 1;
			this.life = damange;
			this.attack = attack;
			this.armor = armor;
			
		}else {
			this.name = name;
			damange = life+armor-attack;
			this.life = damange;
			this.attack = attack;
			this.armor = armor;
			
		}
		
	}
	
	
	
	public String status (String name, int life) {
		if (life > 0) {
			return  getName() + " : " + getLife();
		}else
			return "Morreu";
		    
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getAttack() {
		return attack ;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getArmor() {
		return armor;
	}
	public void setAmor(int amor) {
		this.armor = amor;
	}
	@Override
	public String toString() {
		return "Champion name=" 
				+ name 
				+ ", life=" 
				+ life 
				+ ", attack=" 
				+ attack 
				+ ", amor=" 
				+ armor ;
	}
	
	

}

