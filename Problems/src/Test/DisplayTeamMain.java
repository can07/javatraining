package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DisplayTeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);

System.out.println("Enter the number of inputs");
int n =scan.nextInt();

Map<String, List<Player>> map=new HashMap<>(); 
System.out.println("Enter player name");
for(int i=0; i<n;i++) {
	Scanner obj = new Scanner(System.in);

String player = obj.nextLine();
String[] array =player.split("|");
Team team = new Team(array[0]);
if(map.containsKey(array[0])) {
List<Player>list = new ArrayList<>();
list=map.get(array[0]);
list.add(new Player(array[1]));
//map.get(array[0]).add(new Player(array[1]));
map.put(array[0],list );
} else {
	List<Player>list = new ArrayList<>();
	list.add(new Player(array[1]));
	//map.get(array[0]).add(new Player(array[1]));
	map.put(array[0],list );
}
}
for (Map.Entry<String,List<Player>> entry : map.entrySet()) {
   System.out.println("Key = " + entry.getKey());
    for(Player p:entry.getValue()){
    	System.out.println(p.getName());
    }
}
	}

}
