class Player
{
	private String name;
	private int runs;
	private int balls;
	
	public Player(){
		
	}
	
	public Player(String name,int runs,int balls){
		this.name=name;
		this.runs=runs;
		this.balls=balls;
	}
	
	public void display(){
		System.out.printf("%30s %3d %3d",name,runs,balls);
	}
	
	
}