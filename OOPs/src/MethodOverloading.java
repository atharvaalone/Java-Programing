public class MethodOverloading {
    public int add(int a,int b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        MethodOverloading methodOverloading =new MethodOverloading();
        System.out.println(methodOverloading.add(10,20));
        System.out.println(methodOverloading.add(10,20,30));


    }
}
