package lab6.AnimalRescue;

public class Persan extends Cat {
    @Override
    public void spiritLevel() {
        super.spiritLevel();
    }

    @Override
    public void name() {
        super.name();
        System.out.println("Oscar");
    }

    @Override
    public void speak() {
        super.speak();
    }

    @Override
    public void relaxActivity() {
        super.relaxActivity();
    }

    @Override
    public void hungryLevel() {
        super.hungryLevel();
    }

    @Override
    public void healthLevel() {
        super.healthLevel();
        System.out.println("Health level is 8 out of 10.");
    }

}
