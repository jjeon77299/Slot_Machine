package project;

public class Player {
	int coin;
	public Player(){
		this.coin = 10;
	}
	public int getCoin() {
		return coin;
	}
	public void setCoin(int coin) {
		this.coin+=coin;
	}
}
