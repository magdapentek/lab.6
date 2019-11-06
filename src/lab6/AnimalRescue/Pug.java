package lab6.AnimalRescue;

public class Pug extends Dog {
    @Override
    public void healthLevel() {
        System.out.println("Health level: 7.");

    }

    @Override
    public void age() {
        super.age();
        System.out.println("Pug has 6 years.");
    }

    @Override
    public void favoriteMeal() {
        super.favoriteMeal();
    }

    @Override
    public void spiritLevel() {
        super.spiritLevel();
    }

    @Override
    public void name() {
        super.name();
        System.out.println("Lucky");
    }

    @Override
    public void speak() {
        super.speak();
    }

    @Override
    public void relaxActivity() {
        super.relaxActivity();
        System.out.println("Relax activity: playing with humans.");
    }

    @Override
    public void hungryLevel() {
        super.hungryLevel();
    }

}
