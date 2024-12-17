class FunctionOverloading {
    void display(int a) {
        System.out.println("Integer: " + a);
    }
    void display(String a) {
        System.out.println("String: " + a);
    }
    public static void main(String[] args) {
        FunctionOverloading obj = new FunctionOverloading();
        obj.display(10);
        obj.display("Hello");
    }
}
