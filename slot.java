package project;

import java.util.Random;

public class slot {
	
	void slot_machine_play(Player p1) throws InterruptedException {
		for(int i=0;i<9;i++) System.out.println();
		for(int i=0;i<20;i++) {
			enter(i, p1);			
		}
	}
	void enter(int count, Player p1) throws InterruptedException {
		
		String[] slot = {"🍟","🌭","🍖","🍓","🍉","🍌","⚠","7"};
		Random r = new Random();
		int a = r.nextInt(8);
		int b = r.nextInt(8);
		int c = r.nextInt(8);
		System.out.print("                LUCKY SLOT\n");
		System.out.print("──────────────────────────────────────────\n");
		System.out.print("            "+slot[a]+"      "+slot[b]+"      " +slot[c]+"\n");
		System.out.print("──────────────────────────────────────────\n");
		if(count == 19) for(int i=0;i<14;i++) System.out.println();
		else for(int i=0;i<17;i++) System.out.println();
		Thread.sleep(100);
		if(count==19) {
			quest(slot, a, b, c, p1);
		}
	}
	void quest(String[] slot, int a,int b,int c, Player p1) throws InterruptedException { 
		int f = 0;
		if(slot[a]==slot[b]) f++;
		if(slot[c]==slot[a]) f++;
		if(slot[b]==slot[c]) f++;
		switch(f) {
			case 0:
				System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "░░░░░█▀▀░█▀█░█▀▀░█░█░░░░░░\r\n"
						+ "░░░░░█▀▀░█▀█░▀▀█░▀█▀░░░░░░\r\n"
						+ "░░░░░▀▀▀░▀░▀░▀▀▀░░▀░░░░░░░\r\n"
						+ "░░░░░░░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "⎛⎝(•‿•)⎠⎞⎛⎝(•‿•)⎠⎞⎛⎝(•‿•)⎠⎞⎛⎝(•‿•)⎠⎞");
				break;
			case 1:
				if(slot[a]=="7"&&slot[b]=="7"||slot[c]=="7"&&slot[a]=="7"||slot[b]=="7"&&slot[c]=="7") {
					System.out.println("7두개 ㅊㅊ +10코인");
					p1.setCoin(10);
					break;
				}
				else {
					System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░\r\n"
							+ "\r\n"
							+ "░░░░░░▄▄█▄▄░░░░▄▄█▄▄░░░░░░\r\n"
							+ "\r\n"
							+ "░░░░░░▄▀░▀▄░░░░▄▀░▀▄░░░░░░\r\n"
							+ "\r\n"
							+ "░░░░░░▀░░░▀░░░░▀░░░▀░░░░░░\r\n"
							+ "\r\n"
							+ "░░░░░░░░░░░░░░░░░░░░░░░░░░\r\n"
							+ "\r\n"
							+ "⎛⎝(•‿•)⎠⎞⎛⎝(•‿•)⎠⎞⎛⎝(•‿•)⎠⎞⎛⎝(•‿•)⎠⎞");
					p1.setCoin(4);
					break;					
				}
			case 3:
				if(slot[a]=="7"&&slot[b]=="7"||slot[c]=="7"&&slot[a]=="7"||slot[b]=="7"&&slot[c]=="7") {
					System.out.println("                                                                           ##    \r\n"
							+ "     ##                     ##                                    ##       ##    \r\n"
							+ "           ####     ####    ##                #####     ####    ######     ##    \r\n"
							+ "     ##       ##   ##       ## ##             ##  ##   ##  ##     ##       ##    \r\n"
							+ "     ##    #####   ##       ####              ##  ##   ##  ##     ##             \r\n"
							+ "     ##   ##  ##   ##       ## ##             #####    ##  ##     ##             \r\n"
							+ "     ##    #####    ####    ##  ##            ##        ####       ###     ##    \r\n"
							+ "  ####                                        ##                                 \r\n"
							+ "");
					p1.setCoin(1000000000);
					break;
				}
				else {
					System.out.println(
							  "  ####     ####     ####    ####    \r\n"
							+ " ##  ##   ##  ##   ##  ##   ## ##   \r\n"
							+ " ##       ##  ##   ##  ##   ##  ##  \r\n"
							+ " ## ###   ##  ##   ##  ##   ##  ##  \r\n"
							+ " ##  ##   ##  ##   ##  ##   ##  ##  \r\n"
							+ " ##  ##   ##  ##   ##  ##   ## ##   \r\n"
							+ "  ####     ####     ####    ####    \r\n"
							+ "                                    \r\n"
							+ "");
					p1.setCoin(100);
					break;					
				}
		}
	}
}