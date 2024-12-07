package task2;

import java.time.LocalDate;

public abstract class AbstractAnimal implements Animal {
    protected String breed;
    protected String name;
    protected double cost;
    protected String character;
    protected LocalDate birthDate;

    public AbstractAnimal(String breed, String name, double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
