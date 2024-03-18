package seminar4.task4;

public class Main {
    static void test(Gen<? extends A> obj) {
        // ...
    }

    public static void main(String[] args) {
        
    A a = new A();
    B b = new B();
    C c = new C();
    D d = new D();

    Gen<A> genA = new Gen<>(a);
    Gen<B> genB = new Gen<>(b);
    Gen<C> genC = new Gen<>(c);
    Gen<D> genD = new Gen<>(d);

    // Допустимые вызовы метода test
    test(genA);
    test(genB);
    test(genC);

    // Недопустимый вызов метода test (genD не соответствует ограничению)
    // test(genD); // Ошибка компиляции
    }
}