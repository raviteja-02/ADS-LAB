interface Shape {
    void draw();
}

interface Color {
    void fill();
}

class HybridInheritanceEx implements Shape, Color {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
    
    public void fill() {
        System.out.println("Filling the Circle with color");
    }

    public static void main(String[] args) {
        HybridInheritanceEx obj = new HybridInheritanceEx();
        obj.draw();
        obj.fill();
    }
}
