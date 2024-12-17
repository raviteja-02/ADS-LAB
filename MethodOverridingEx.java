class Computer {
    void start() {
        System.out.println("Computer is starting");
    }
}

class Laptop extends Computer {
    @Override
    void start() {
        System.out.println("Laptop is starting");
    }
}

class MethodOverridingEx {
    public static void main(String[] args) {
        Computer c = new Laptop();
        c.start();
    }
}
