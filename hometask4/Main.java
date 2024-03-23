package hometask4;

public class Main{
  

    public static void main(String[] args){
        Pair<Integer, String> pair = new Pair<>(10,"Hello");

        System.out.println("First element: " + pair.getFirst());
        System.out.println("Second element: " + pair.getSecond());

        pair.setFirst(20);
        pair.setSecond("Hello World");

        System.out.println("Updated First element: " + pair.getFirst());
        System.out.println("Updated Second element: " + pair.getSecond());

    }
    
}
