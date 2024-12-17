abstract class Instrument {
    abstract void play();
}

class Guitar extends Instrument {
    void play() {
        System.out.println("Guitar is being played");
    }
}

class AbstractEx {
    public static void main(String[] args) {
        Guitar obj = new Guitar();
        obj.play();
    }
}