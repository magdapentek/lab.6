package lab5.Animalrescue;

public class Animal {
    private String name;
    private Byte age;
    private int healthLevel;
    private int hungryLevel;
    private int spiritLevel;
    private String favoriteMeal;
    private String relaxActivity;
    private String speak;

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungryLevel() {
        return hungryLevel;
    }

    public void setHungryLevel(int hungryLevel) {
        this.hungryLevel = hungryLevel;
    }

    public int getSpiritLevel() {
        return spiritLevel;
    }

    public void setSpiritLevel(int spiritLevel) {
        this.spiritLevel = spiritLevel;
    }

    public String getFavoriteMeal() {
        return favoriteMeal;
    }

    public void setFavoriteMeal(String favoriteMeal) {
        this.favoriteMeal = favoriteMeal;
    }

    public String getRelaxActivity() {
        return relaxActivity;
    }

    public void setRelaxActivity(String relaxActivity) {
        this.relaxActivity = relaxActivity;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


}
