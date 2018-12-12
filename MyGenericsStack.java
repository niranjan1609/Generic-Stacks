import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;
import java.util.*;

public class MyGenericsStack<T extends Object> {
 
    private int stackSize;
    private  T[] stackArr;
    private int top;
     //Constructor with Size of the Array as an Argument
    public MyGenericsStack(int size) {
        this.stackSize = size;
        this.stackArr = (T[]) new Object[stackSize];
        this.top = -1;
    }
    //Default Constructor
    public MyGenericsStack() {
        this.stackSize = 0;
        this.stackArr = (T[]) new Object[stackSize];
        this.top = -1;
    }
 //Method to push an element into the Stack
    public void push(T entry){
        if(this.isStackFull()){
            System.out.println(("Stack is full. Increasing the capacity."));
            this.increaseStackCapacity();
        }
        System.out.println("Adding: "+entry);
        this.stackArr[++top] = entry;
    }
 //Method to  pop an element from the stack
    public T pop() throws Exception {
        if(this.isStackEmpty()){
            throw new Exception("Stack is empty. Can not remove element.");
        }
        T entry = this.stackArr[top--];
        System.out.println(entry);
        return entry;
    }
     //Method to peek an element of the stack
    public T peek() {
        return stackArr[top];
    }
 //Method to increase the Stack Capacity
    private void increaseStackCapacity(){
        T[] newStack = (T[]) new Object[this.stackSize*2];
        for(int i=0;i<stackSize;i++){
            newStack[i] = this.stackArr[i];
        }
        this.stackArr = newStack;
        this.stackSize = this.stackSize*2;
    }
    //Method to Check whether the stack is Empty or Not
    public boolean isStackEmpty() {
        return (top == -1);
    }
//Method to Check whether the stack is full or not
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
     
    public static void reverse(StringBuffer str) throws Exception
    {
       
        int n = str.length();
        MyGenericsStack<Character> obj = new MyGenericsStack<Character>(n);
         
       
       
        int i;
        for (i = 0; i < n; i++)
        obj.push(str.charAt(i));
     
   
        for (i = 0; i < n; i++)
        { 
            char ch = obj.pop();
            str.setCharAt(i,ch);
        }
    }
    
    //Method to Sort a stack
    static void sortedInsert(Stack<Integer> s, int x) throws Exception
    {
        // Base case: Either stack is empty or newly inserted
        // item is greater than top (more than all existing)
        if (s.isEmpty() || x > s.peek())
        {
            s.push(x);
            return;
        }
      
        // If top is greater, remove the top item and recur
        int temp = s.pop();
        sortedInsert(s, x);
      
        // Put back the top item removed earlier
        s.push(temp);
    }
      
    // Method to sort stack
    static void sortStack(Stack<Integer> s) throws Exception
    {
        // If stack is not empty
        if (!s.isEmpty())
        {
            // Remove the top item
            int x = s.pop();
      
            // Sort remaining stack
            sortStack(s);
      
            // Push the top item back in sorted stack
            sortedInsert(s, x);
        }
    }
     
    // Utility Method to print contents of stack
    static void printStack(Stack<Integer> s)
    {
       ListIterator<Integer> lt = s.listIterator();
        
       // forwarding
       while(lt.hasNext())
           lt.next();
        
       // printing from top to bottom
       while(lt.hasPrevious())
           System.out.print(lt.previous()+" ");
    }
 // Deletes middle of stack of size
    // n. Curr is current item number
    static void deleteMid(Stack<Integer> st, int n, int curr)  {
         
        // If stack is empty or all items
        // are traversed
        if (st.empty() || curr == n)
            return;
         
        // Remove current item
        int x = st.pop();
         
        // Remove other items
        deleteMid(st, n, curr+1);
         
        // Put all items back except middle
        if (curr!= n/2)
            st.push(x);
    }
    public Stack<Integer> copyStack(Stack<Integer> orig)  {
    	   Queue<Integer> q = new LinkedList<Integer>();
    	   q.addAll(orig);
    	   Stack<Integer> intStackCopy = new Stack<Integer>();
    	   intStackCopy.addAll(q);
    	   return  intStackCopy;
    	}

   
}