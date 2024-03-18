package seminar4.task1;

public // Обобщенный класс Gen
class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println("Тип T - это " + ob.getClass().getName());
    }
} 
    

