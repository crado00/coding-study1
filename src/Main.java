/* 2번째 확인
class Car {
    String brand;
    Engine engine;
    public Car(String brand){
        this.brand = brand;
        Engine engine = new Engine();
        this.engine = engine;
    }

    class Engine {
        public void start(){
            System.out.println("the engine of " + brand + "is starting.");
        }
    }

    public void startEngine() {
        engine.start();
    }
}

 */

/*4번째 확인
class Outer {
    private class HiddenInner {
        void secret(){
            System.out.println("private!");
        }

    }
    public void reveal() {
        HiddenInner h1 = new HiddenInner();
        h1.secret();;
    }
}
 */
public class Main {
    /* 1번째 확인
    private String message = "Hello from the outer class.";
    public class Inner {
        void displayMessage() {
            System.out.println("Inner says: " + message);
        }
    }

    public void callInner(){
        Inner inner = new Inner();
        inner.displayMessage();
    }

     */
/*3번째 확인
    String outerMessage = "Hello from Outer";

    class Inner {
        void showMessage() {
            System.out.println(outerMessage);
        }
    }
 */
    /*5번째 확인
    interface OnClickListener {
        void onClick();
    }

    private OnClickListener listener;

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        if(listener != null) {
            listener.onClick();
        }
    }

    private class ClickHandler implements OnClickListener {
        @Override
        public void onClick() {
            System.out.println("Button was clicked!");
        }
    }

    public void simulate() {
        setOnClickListener(new ClickHandler());
        click();
    }

     */

    private String data = "Outer data";

    class  Inner {
        void printData() {
            System.out.println(data);
        }
    }

    public Inner createInner() {
        return new Inner();
    }
    public static void main(String[] args) {
        //Outer outer = new Outer(); 1번째 확인
        //outer.callInner(); 1번째 확인

        //Car car = new Car("자동차"); 2번째 확인
        //car.startEngine(); 2번째 확인

        //Main main = new Main();3번째 확인
        //Main.Inner inner = main.new Inner();3번째 확인

        //inner.showMessage();3번째 확인
        //Outer outer = new Outer();4번째 확인

        //Main btn = new Main();5번째 확인
        //btn.simulate();5번째 확인

        Main outer = new Main();
        Main.Inner inner = outer.createInner();
        inner.printData();

        outer = null;
        inner.printData();
        inner = null;
        inner.printData();
    }
}