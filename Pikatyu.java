package test3;

public class Pikatyu implements ThunderPokemon{

	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
	@Override
	public void attack() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.getName()+"は電光石火を使った！");
	}

	@Override
	public void defence() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.getName()+"は防御した！");
	}

	@Override
	public void thunderAt() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.getName()+"の！");
	}

}
