package Maven_example.Maven_example;

public class Course {
	
	  private String name; // 球場名稱
	  private int[] par; //每一洞的標準桿數
	  
	  /*
	  * 設定球場名稱
	  */
	  public void setName(String name) {
	    this.name = name;
	  }
	  
	  /*
	  * 設定球場的標準桿數
	  */
	  public void setPar(int[] par) {
	    this.par = par;
	  }

	  /*
	  *取得球場的洞數
	  */
	  public int getNumberOfHoles() {
	    return par.length;
	  }
	 
	  /*
	  *傳回特定洞的標準桿數
	  */
	  public int parForHole(int hole) {
	    return par[hole-1];
	  }  
	  
	  /*
	  *傳回第一洞到特定洞的累積標準桿數
	  */
	  public int parUpToHole(int hole) {
	    int sum = 0;
	    for (int i = 0; i < hole; i++) { 
	      sum += par[i];
	    }
	    return sum;
	  }  
}