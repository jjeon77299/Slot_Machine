package project;
import java.io.IOException;
import java.util.*;

public class slot_machine {

	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<17;i++) System.out.println();
		Scanner sc = new Scanner(System.in);
		slot s = new slot();
		Player p1 = new Player();
		while(true){
			System.out.println("슬롯 돌리기(enter) 남은 코인(2) 끝내기(3)");
			String menu = sc.nextLine();
			if(menu.equals("")) {
				p1.setCoin(-1);
				if(p1.getCoin()<=0) {
					System.exit(0);
					System.out.println("파산");
				}
				s.slot_machine_play(p1);
			}
			else if(menu.equals("2")) System.out.println("남은 코인: "+p1.getCoin());
			else if(menu.equals("3")) System.exit(0);
			else System.out.println("enter,2,3만 입력하세요");
		}
		
		
	}
}