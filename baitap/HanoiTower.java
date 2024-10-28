package Exercise1.src.baitap;

public class HanoiTower {
	public static String gameHaNoiTower(int n, String beginColumnName, String middleColumnName,String endColumnName){
			 if (n == 1){
			 return " move from "+ beginColumnName +" to " +endColumnName;
			 }else{
			 return
			 gameHaNoiTower(n-1, beginColumnName, endColumnName, middleColumnName)+"\n" + /*RECURSIVE END SWAP MID */
					  
			 ( " move from "+ beginColumnName+ " to " + endColumnName )+"\n" + /*PRINT BEG AND END*/
			  
			 gameHaNoiTower(n-1, middleColumnName, beginColumnName, endColumnName) ;/*RECURSIVE MID SWAP BEGIN*/
			 }
	}
	public static void main(String[] args) {
		int n = 3;
		String begin = "A";
		String mid = "B";
		String end = "C";
		System.out.println(gameHaNoiTower(n, begin, mid, end));
	}
}
