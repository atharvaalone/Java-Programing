public class MethodOverriding {
    public void display() {
        System.out.println("this is display");
    }
}
class child extends MethodOverriding {
    public void display() {
      // super.display();
        System.out.println("this is child");

    }

    public static void main(String[] args) {
        child obj = new child();
        obj.display();
        MethodOverriding m=new MethodOverriding();
        m.display();




    }
}

