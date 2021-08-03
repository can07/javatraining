package Test;

import java.util.ArrayList;
import java.util.List;

public class Team {

	private String name;
	
	//List<Player> player = ArrayList<Player>();
	
	List<Player> list = new ArrayList<>();
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Player> getList() {
		return list;
	}

	public void setList(List<Player> list) {
		this.list = list;
	}

	public Team(String name) {
		
		this.name = name;
		
	}
	
	public void addPlayer(String Playername) {
		
		
	}
	
	public void getPlayerList() {
		
	}
	
	
}
