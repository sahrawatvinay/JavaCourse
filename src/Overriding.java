class A1 {
    public void show() {
        System.out.println("in show A1");
    }
}
class B1 extends A1 {
    public void show(){
        System.out.println("in show B1");
    }
}
class C1 extends A1 {
    public void show(){
        System.out.println("in show C1");
    }
}
public class Overriding {
    public static void main(String[] args){
        A1 obj = new A1();
        obj.show();

        obj = new B1();
        obj.show();

        obj = new C1();
        obj.show();
        
    }
}
