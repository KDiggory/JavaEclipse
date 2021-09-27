public class MyStatic {
 
   static int x = 6;
 
   MyStatic() { // it has the same name as the class --> so it is a constructor. Normally it would have public or private. 
      x ++ ;
   }
   void method(){
      System.out.print("-x" + x);
   }
   public static void main(String[] args){
      MyStatic mc1,mc2,mc3,mc4; // doesn't seem to do anything
      MyStatic mc5 = new MyStatic(); // make a new MyStatic which calls the constructor which increments the value of x by 1 x now = 7
      MyStatic mc6 = new MyStatic(); // make a new MyStatic which calls the constructor which increments the value of x by 1 x now = 8
      MyStatic mc7 = new MyStatic(); // make a new MyStatic which calls the constructor which increments the value of x by 1. x now = 9
      mc7.method();
   }
}


