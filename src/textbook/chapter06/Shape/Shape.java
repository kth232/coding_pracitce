package textbook.chapter06.Shape;

class Shape {
    public void draw() {
        System.out.println("shape");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("circle");
    }
}
class Triangle extends Shape {
    public void draw() {
        System.out.println("triangle");
    }
}
