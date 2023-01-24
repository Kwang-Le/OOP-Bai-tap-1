package game;

import java.util.ArrayList;
import java.util.Iterator;

public class GameMaster {
	private ArrayList<Player> players = new ArrayList<Player>();
	private Player currentPlayer;
	private Player winner;
	
	public void setFirstPlayer() {
		this.setCurrentPlayer(this.players.get(0));
	}
	
	public void setCurrentPlayer(Player player) {
		this.currentPlayer = player;
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}

	public void nextPlayer() {
		int currentPlayerIndex = players.indexOf(getCurrentPlayer());
		if(currentPlayerIndex + 1 <=3) {
			this.setCurrentPlayer(players.get(currentPlayerIndex + 1));			
		}else {
			this.setCurrentPlayer(players.get(0));
		}
	}
	
	public int calculateScore(Player player) {
		return player.getScore();
	}
	
	public void checkScoreEveryPlayerEachTurn() {
		for(Iterator<Player> i = this.players.iterator(); i.hasNext();) {
			Player playerToCheck = i.next();
			int score = this.calculateScore(playerToCheck);
			if(score < 21) {
				continue;
			}else if (score == 21) {
				this.winner = playerToCheck;
			}else {
				playerToCheck.setScore(0);
			}
		}
	}
	
	public boolean checkIfWinner() {
		if(this.winner != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void declareWinner() {
		//check if there is a winner
		if(this.winner != null) {
			System.out.println("we have a winner, it is " + this.winner.getName());
		}
		for(Iterator<Player> i = this.players.iterator(); i.hasNext();) {
			Player player = i.next();
			if(player != this.winner) {
				System.out.println(player.getName() +": " + player.getFailChant());
			}
		}
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}
	
	
}
