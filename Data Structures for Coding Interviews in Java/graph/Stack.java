public class Stack<T> {
  public int maxSize;
  public int top;
  public T[] array;
  private int currentSize;

  public Stack(int maxSize){
    this.maxSize = maxSize;
    this.top = -1;
    array = (T[]) new Object[maxSize];
    this.currentSize = 0;
  }

  public int getCurrentSize(){
    return currentSize;
  }

  public int getMaxSize(){
    return maxSize;
  }

  public boolean isEmpty(){
    return top == -1;
  }

  public boolean isFull(){
    return top == maxSize -1;
  }

  public T top(T value){
    if(isEmpty()){
      return null;
    }
    return array[top];

  }

  public void push(T value){

    if(isFull()){
      System.err.println("Stack is Full");
      return;
    }
    array[++top] = value;
    currentSize++;
  }

  public T pop(){
    if(isEmpty()){
      return null;
    }
    currentSize--;
    return array[top--];
  }
}
