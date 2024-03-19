package hometask3;

public class Employee implements Comparable<Employee>{
    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getSalary(){
        return salary;
    }

@Override
public String toString(){
    return String.format("Name: %s, Age: %s, Salary: %s", getName(),getAge(),getSalary());
}


@Override
public int compareTo(Employee o) {
    if (this.salary > o.salary)
        return 1;
    else if (this.salary < o.salary)
        return -1;
    else
        return 0;
}
}
