public class Queue<T> {
  private int maxSize;
  private T[] array;
  private int front;
  private int back;
  private int currentSize;


  public Queue(int maxSize){
    this.maxSize = maxSize;
    array = (T[]) new Object[maxSize];
    front = 0;
    back = -1;
    currentSize = 0;
  }

  public int getMaxSize(){
    return maxSize;
  }

  public int getCurrentSize(){
    return currentSize;
  }

  public boolean isEmpty(){
    return currentSize == 0;
  }

  public boolean isFull(){
    return currentSize == maxSize;
  }

  public void enqueue(T value){
    if(isFull()){
      return;
    }

    back = (back + 1) % maxSize;
    array[back] = value;
    currentSize++;
  }

  public  T dequeue(){
    if(isEmpty()){
      return null;
    }

    T temp = array[front];
    front = (front + 1) % maxSize;
    currentSize--;
    return temp;
  }

}
