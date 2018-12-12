import java.util.Stack;

public class DriverGeneric {
	public static void main(String a[]) throws Exception{
    
        StringBuffer s= new StringBuffer("Vadla.NiranjanVaraPrasad");
        MyGenericsStack.reverse(s);
        System.out.println("Reversed string is " + s);
        Stack<Integer> t = new Stack<Integer>();
        t.push(30);
        t.push(-5);
        t.push(18);
        t.push(14);
        t.push(-3);
        System.out.println("#####################################################");
        System.out.println("Stack elements before sorting: ");
        MyGenericsStack.printStack(t);
      
        MyGenericsStack.sortStack(t);
      
        System.out.println(" \n\nStack elements after sorting:");
        MyGenericsStack.printStack(t);
        System.out.println("");
        System.out.println("######################################################");
        Stack<Integer> st =new Stack<Integer>();
   
      // push elements into the stack
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
      st.push(5);
      st.push(6);
      st.push(7);
      System.out.println("Before Deletion of the middle Node");
      MyGenericsStack.printStack(st);
      
   
      MyGenericsStack.deleteMid(st, st.size(), 0);
      System.out.println("\n\nAfter Deletion of the middle Node");
      // Printing stack after deletion
      // of middle.
      MyGenericsStack.printStack(st);
      System.out.println("");
  	System.out.println("####################################################");
  	Stack<Integer> stack = new Stack<Integer>();
    MyGenericsStack<Integer> Stack = new MyGenericsStack<Integer>(2);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    System.out.print("The original Stack: ");
    System.out.println(stack);
    System.out.print("The Copied Stack is: ");
    System.out.println(Stack.copyStack(stack));
	}
	
 }

