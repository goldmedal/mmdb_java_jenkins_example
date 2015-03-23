package unitTest_example;

public class Course {
	  private String name; // �y���W��
	  private int[] par; //�C�@�}���зǱ��
	  
	  /*
	  * �]�w�y���W��
	  */
	  public void setName(String name) {
	    this.name = name;
	  }
	  
	  /*
	  * �]�w�y�����зǱ��
	  */
	  public void setPar(int[] par) {
	    this.par = par;
	  }

	  /*
	  *���o�y�����}��
	  */
	  public int getNumberOfHoles() {
	    return par.length;
	  }
	 
	  /*
	  *�Ǧ^�S�w�}���зǱ��
	  */
	  public int parForHole(int hole) {
	    return par[hole-1];
	  }  
	  
	  /*
	  *�Ǧ^�Ĥ@�}��S�w�}���ֿn�зǱ��
	  */
	  public int parUpToHole(int hole) {
	    int sum = 0;
	    for (int i = 0; i < hole; i++) { 
	      sum += par[i];
	    }
	    return sum;
	  }  
	}