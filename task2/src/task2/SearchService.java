package task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface SearchService {
    String[] findLeapYearNames(Animal[] animals);
    Animal[] findOlderAnimal(Animal[] animals, int age);
    void findDuplicate(Animal[] animals);
}

class SearchServiceImpl implements SearchService {

    @Override
    public String[] findLeapYearNames(Animal[] animals) {
        List<String> leapYearNames = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getBirthDate().getYear() % 4 == 0 && 
                (animal.getBirthDate().getYear() % 100 != 0 || animal.getBirthDate().getYear() % 400 == 0)) {
                leapYearNames.add(animal.getName());
            }
        }
        return leapYearNames.toArray(new String[0]);
    }

    @Override
    public Animal[] findOlderAnimal(Animal[] animals, int age) {
        List<Animal> olderAnimals = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();
        for (Animal animal : animals) {
            if (currentDate.getYear() - animal.getBirthDate().getYear() > age) {
                olderAnimals.add(animal);
            }
        }
        return olderAnimals.toArray(new Animal[0]);
    }

    @Override
    public void findDuplicate(Animal[] animals) {
        Set<Animal> seen = new HashSet<>();
        Set<Animal> duplicates = new HashSet<>();
        for (Animal animal : animals) {
            if (!seen.add(animal)) {
                duplicates.add(animal);
            }
        }
        for (Animal duplicate : duplicates) {
            System.out.println("Duplicate animal: " + duplicate.getName());
        }
    }
}
