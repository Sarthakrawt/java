package sortingAlgo.OOPs;

import java.util.Arrays;
//generics
//arraylist form scratch
public class ArrayListConst<T> {
   private Object[] arr;
   private int DEFAULT_SIZE= 10;
   private int size = 0;
   public ArrayListConst(){
   arr =  new Object[DEFAULT_SIZE];
   }
   public void add(T num){
    if(isFull()){
        resize();
    }
    arr[size++] = num;
   }
 private void resize() {
   Object [] temp = new Object[size*2];
   for(int i = 0 ; i< arr.length;i++){
    temp[i] = arr[i];
    arr = temp;
   }

}
private T get(int idx){
return (T) arr[idx];
}
private boolean isFull() {
    return size == arr.length;
}
private void set(int idx , int num){
    arr[idx] = num;
}
public T remove(){
    T remove = (T)arr[--size];
return remove;
}

    @Override
    public String toString() {
        return  Arrays.toString(arr);
    }

public static void main(String[] args) {
    ArrayListConst<Integer> list = new ArrayListConst<>();
    list.add(12);
    list.add(12);
    list.add(12);
    list.get(3);
    list.remove();
    System.out.println(list);
 }
}
