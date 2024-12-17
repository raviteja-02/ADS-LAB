class ConstructorOverloading {
    ConstructorOverloading() {
        System.out.println("No-argument constructor");
    }
    ConstructorOverloading(int a) {
        System.out.println("Constructor with one argument: " + a);
    }
    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(5);
    }
}
