class Tasio{
	int num1;
	int num2;
	String op;
	public Tasio() {
		
	}
	public Tasio(int i) {
		num1=i;
	}
	public Tasio(int i,int j) {
		num1=i;
		num2=j;
	}
	public Tasio(int i,int j,String operation) {
		num1=i;
		num2=j;
		op=operation;
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tasio obj=new Tasio(3,6,"add");
	}

}
