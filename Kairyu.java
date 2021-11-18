package test3;

public class Kairyu implements ThunderFirePokemon{
	private String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void attack(){
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.getName()+"はひっかくを使った！");
	}

	@Override
	public void defence() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.getName()+"は硬化を使った！");
	}
	
	@Override
	public void fireAt() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.getName()+"はかえんほうしゃを使った！");
	}

	@Override
	public void thunderAt() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.getName()+"はらいげきを使った！");
	}

	@Override
	public void FireThunderAt() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.getName()+"は雷炎を使った！");
	}

}
