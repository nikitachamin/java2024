package hometask3;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList  implements Iterable<String>{
    private final class IteratorImplementation implements Iterator<String> {
        private int index= 0;

        @Override
        public boolean hasNext(){
            return index < linkedList.size();
        }

        @Override
        public String next(){
            return linkedList.get(index++);
        }
    }




    private LinkedList<String> linkedList = new LinkedList<>();


    public void addFirst(String element){
        this.linkedList.addFirst(element);
    }

    public void removeFirst(){
        this.linkedList.removeFirst();
    }




public Iterator<String> iterator(){
   Iterator<String> it = new IteratorImplementation();
return it;
}}