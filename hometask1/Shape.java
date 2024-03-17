package hometask1;

abstract class Shape {
    abstract double calculateArea();
    abstract  double calculatePerimeter();
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    @Override 
    double calculateArea(){
        return length*width;
    }
    @Override 
    double calculatePerimeter(){
        return 2*(length+width);
    }
}
    class Square extends Rectangle {
        private double side;
    
        public Square(double side) {
            super(side, side);
            this.side = side;
        }
    
        @Override
        double calculateArea() {
            return side * side;
        }
    
        @Override
        double calculatePerimeter() {
            return 4 * side;
        }
    }

