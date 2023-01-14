public class Fish extends Animal implements Pet {

    public Fish(int legs) {
        super(legs);
    }

    @Override
    public void play() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    public void walk() {
        super.walk();
    }

    public void eat() {
        super.eat();
    }
}
