public class Main {

  public static void main(String[] args) {
    MyInterfaceImplementation m1 = new MyInterfaceImplementation();
    m1.printIt("Hello World!");

    // anonymous interface implementation
    MyInterface my2 = new MyInterface() {
      @Override
      public void printIt(String text) {
        System.out.println(text);
      }
    };
    my2.printIt("Anonymous demo");

    // Lambda expression
    // statement lambda (Contains braces)
    MyInterface m2 = (String text) -> {
      System.out.println(text);
    };
    m2.printIt("Lambda Demo");

    // Lambda expression
    // Expression Lambda (no braces)
    MyInterface m3 = (String text) ->
      System.out.println(text)
    ;
    m3.printIt("Expression lambda way");

    // Lambda expression
    // expression lambda (Data type parameter omitted)
    MyInterface m4 = (text) ->
      System.out.println(text);
    m4.printIt("Expression Lambda no data type");
  }

}
 // interface
interface MyInterface {
  public void printIt(String text);
}
// class that implements interface
class MyInterfaceImplementation implements MyInterface {
//method to make it work
  @Override
  public void printIt(String text) {
    System.out.println(text);
  }
}