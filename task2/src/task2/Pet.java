package task2;

import java.time.LocalDate;

public class Pet extends AbstractAnimal {
    public Pet(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Pet)) return false;
        Pet other = (Pet) obj;
        return breed.equals(other.breed) && name.equals(other.name) &&
               cost == other.cost && character.equals(other.character) &&
               birthDate.equals(other.birthDate);
    }
}