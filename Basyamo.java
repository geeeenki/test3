package test3;

public class Basyamo implements FirePokemon{
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
		System.out.println(this.getName()+"は体当たりを使った！");
	}

	@Override
	public void defence() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.getName()+"は守るを使った！");
	}

	@Override
	public void fireAt() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.getName()+"はひのこを使った！");
	}

	

}
