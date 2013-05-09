
public class DNA {

	
	public static void main(String[] args) {
		
		char ans[][] = {{'A', 'C', 'G', 'T', 'C', 'G', 'T', 'A', 'A', 'C'},
						   {'G', 'A', 'G', 'T', 'A', 'T', 'G', 'T', 'A', 'G'},
						   {'C', 'C', 'G', 'A', 'C', 'T', 'T', 'A', 'G', 'A'},
						   {'A', 'G', 'G', 'C', 'C', 'G', 'A', 'G', 'A', 'C'},
						   {'T', 'C', 'G', 'T', 'C', 'G', 'T', 'T', 'A', 'C'}};	
		
		int percent = 0;
		

			for(int i=0; i<5; i++){
				for(int j=0; j<10; j++){
					if(args[j].charAt(0)==ans[i][j])
						percent+=10;
					
				}
				
				System.out.println((i+1)+"번째는 " +percent+"%가 일치합니다.");
				percent = 0;
			}
		
		
		
		
		}
	}


