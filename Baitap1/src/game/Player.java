package game;

public class Player {
	private String name;
	private int score;
	private String failChant;
	private boolean AIstatus;
	private Dice currentDice;
	
	public Player(String name, int score, String failChant, boolean aIstatus) {
		super();
		this.name = name;
		this.score = score;
		this.failChant = failChant;
		AIstatus = aIstatus;
	}
	
	
	public Player(String name, int score, String failChant) {
		super();
		this.name = name;
		this.score = score;
		this.failChant = failChant;
	}


	public Player(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	

	public Player(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getFailChant() {
		return failChant;
	}
	public void setFailChant(String failChant) {
		this.failChant = failChant;
	}
	public boolean isAIstatus() {
		return AIstatus;
	}
	public void setAIstatus(boolean aIstatus) {
		AIstatus = aIstatus;
	}
	
	
	public Dice getCurrentDice() {
		return currentDice;
	}


	public void setCurrentDice(Dice currentDice) {
		this.currentDice = currentDice;
	}


	public int rollDice() {
		return this.currentDice.getRandomFace();
	}
	
	public void increaseScore(int score) {
		this.score += score; 
	}
	
	
}
