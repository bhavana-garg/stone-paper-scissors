package oops;
import java.util.*;


public class StonePaperScissors {

	public static void main(String[] args) {
		// stone breaks scissors | scissors cut paper | paper wraps stone
		// 0, 1 -1 wins || 0, 2 - 0 wins || 1,2  2 wins
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the game of STONE PAPER AND SCISSORS");
		System.out.println("Enter The number of rounds you want to play");
		int n =sc.nextInt();
		
		int countLoose=0;
		int countWin=0;
		int countDraw=0;
		
		System.out.println("your have to input : 0 for paper , 1 for scissors , 2 for stone");
		for(int i=1;i<=n;i++)
		{
			System.out.println("ROUND NO. "+i);
			String p="",q="",s="";
			int a= sc.nextInt();
			if(a>2)
			{
				System.out.println("invalid option");
			}
			else
			{
				  double randomDouble = Math.random();
			      randomDouble = randomDouble * 2 + 0;
			      int r = (int) randomDouble;
			      System.out.println(r);
				switch(a)
				{
					case 0:
					
						 p=(r==0) ? "Draw": ((r==1) ? "YOU LOOSE" : "YOU WIN"); //0 for paper , 1 for scissors , 2 for stone
						System.out.println(p);
						break;
					
					case 1:
					
						 q=(r==1) ? "Draw": ((r==2) ? "YOU LOOSE" : "YOU WIN");
						System.out.println(q);
						break;
					
					case 2:
					
						s=(r==2) ? "Draw": ((r==0) ? "YOU LOOSE" : "YOU WIN");
						System.out.println(s);
						break;
					
				}
				if(p=="YOU WIN" || q=="YOU WIN" || s=="YOU WIN")
				{
					countWin++;
					System.out.println("win="+countWin);
				}
				if(p=="YOU LOOSE" || q=="YOU LOOSE" || s=="YOU LOOSE")
				{
					countLoose++;
					System.out.println("loose=  "+countLoose);
				}
				if(p=="Draw" || q=="Draw" || s=="Draw")
				{
					countDraw++;
					System.out.println("draw = "+countDraw);
				}
				
					
				
			}
			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		   
		    
		}
		    System.out.println("GAME ANALYSIS:");
			System.out.println("NUMBER OF MATCHES YOU WON = "+countWin);
		    System.out.println("NUMBER OF MATCHES YOU LOST = "+countLoose);
//		    int draw = n-(countWin+countLoose);
		    System.out.println("NUMBER OF DRAW MATCHES = "+countDraw);
		System.out.println("THANK YOU FOR PLAYING THE GAME!");

	}

}
