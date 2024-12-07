package task2;

import java.time.LocalDate;

public class Predator extends AbstractAnimal {
    public Predator(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Predator)) return false;
        Predator other = (Predator) obj;
        return breed.equals(other.breed) && name.equals(other.name) &&
               cost == other.cost && character.equals(other.character) &&
               birthDate.equals(other.birthDate);
    }
}
