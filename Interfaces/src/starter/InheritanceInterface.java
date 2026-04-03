package starter;

/**
Create an interface and inherit it from the other interface.
 */

//interface
interface Jala_7 {
    void methodOne();
}

//inherited interface
interface Jala_07 extends Jala_7 {
    void methodTwo();
}

class InheritanceInterface implements Jala_07 {
    //override method of interface Jala_7
    @Override
    public void methodOne() {
        System.out.println("This is first method");
    }
    //override method of inherited interface Jala_07
    @Override
    public void methodTwo() {
        System.out.println("This is second method");
    }

    public static void main(String[] args) {
        //creating obj of InheritedInterface
        InheritanceInterface if7 = new InheritanceInterface();
        //Calling the methods implemented
        if7.methodOne();
        if7.methodTwo();
    }
}
