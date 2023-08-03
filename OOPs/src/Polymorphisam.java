public class Polymorphisam {
    String name="Athar";


}
class Child extends Polymorphisam{
    public void display(){
        System.out.println(super.name);
        System.out.println("This is A Child");


    }

    public static void main(String[] args) {
   Child c1= new Child();
   c1.display();

    }
}



