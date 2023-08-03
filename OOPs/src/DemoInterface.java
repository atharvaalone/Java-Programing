public interface DemoInterface {
    void demo();

    class Rectangle implements DemoInterface {
        public void demo() {
            System.out.println("It is a rectangle");

        }
    }

    class Circle implements DemoInterface {
        public void demo() {
            System.out.println("It is a circle");
        }
    }

class main{
    public static void main(String[] args) {
DemoInterface demoInterface=new Circle();
demoInterface.demo();
DemoInterface demoInterface1=new Rectangle();
demoInterface1.demo();


    }
}

}
