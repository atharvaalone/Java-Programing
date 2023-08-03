
interface A {
	void show(int i,int j);

}

class MaxMin {
	public static void main(String[] args) {

		A obj = (i,j) -> System.out.println("In show method"+" "+(i+j));
		obj.show(10, 20);
		

	}
}
