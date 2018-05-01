class Player
{
	private String name;
	private int runs;
	private int balls;
    private	static int totalScore;
	
	public Player(){
		totalScore+=0;
	}
	
	public Player(String name,int runs,int balls){
		this.name=name;
		this.runs=runs;
		this.balls=balls;
		this.totalScore+=runs;
	}
	
	public void display(){
		System.out.printf("%20s %3d %3d",name,runs,balls);
		System.out.println();
	
	}
	
	public static void showTotal(){
		System.out.println("Total::"+totalScore);
	}
	
	
}