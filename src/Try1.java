class Example1 {
   public static void main(String args[]) {
      int  num2;
      try {
        num2=100/0;
         System.out.println(num2);
         System.out.println("Hey I'm at the end of try block");
      }
      catch (ArithmeticException e) { 
       
         System.out.println(e);
      }
   
    
   }
}