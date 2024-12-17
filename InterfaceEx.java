interface Transport {
    void move();
}

interface Cars extends Transport {
    void honk();
}

class Sedan implements Cars {
    public void move() {
        System.out.println("Vehicle moves");
    }
    
    public void honk() {
        System.out.println("Car honks");
    }
}

class InterfaceEx {
    public static void main(String[] args) {
        Sedan obj = new Sedan();
        obj.move();
        obj.honk();
    }
}