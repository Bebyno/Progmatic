package TamásPélda.Animals;

public class Cat {
    public String name;
    public String color;
    public int age;
    public int livesLeft;

    public Cat(String name, String color, int age, int livesLeft) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.livesLeft = livesLeft;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public void setLivesLeft(int livesLeft) {
        this.livesLeft = livesLeft;
    }
}
