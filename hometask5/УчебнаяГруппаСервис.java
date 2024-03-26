package hometask5;

import java.util.List;

public class УчебнаяГруппаСервис {
    public УчебнаяГруппа создатьУчебнуюГруппу(Преподаватель преподаватель, List<Студент> студенты) {
        return new УчебнаяГруппа(преподаватель, студенты);
    }
}
