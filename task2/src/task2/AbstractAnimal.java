package task2;

import java.time.LocalDate;

public abstract class AbstractAnimal implements Animal {
    protected String breed; // порода
    protected String name; // имя
    protected double cost; // цена в магазине
    protected String character; // характер
    protected LocalDate birthDate; // день рождения

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

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof AbstractAnimal)) return false;
        AbstractAnimal other = (AbstractAnimal) obj;
        return breed.equals(other.breed) && name.equals(other.name) &&
               Double.compare(cost, other.cost) == 0 && character.equals(other.character) &&
               birthDate.equals(other.birthDate);
    }
}
