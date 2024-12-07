package task2;
import java.time.LocalDate;
import java.util.*;

public class SearchServiceImpl implements SearchService {

    @Override
    public List<String> findLeapYearNames(List<AbstractAnimal> animals) {
        List<String> leapYearNames = new ArrayList<>();
        for (AbstractAnimal animal : animals) {
            if (animal.getBirthDate().getYear() % 4 == 0 && 
                (animal.getBirthDate().getYear() % 100 != 0 || animal.getBirthDate().getYear() % 400 == 0)) {
                leapYearNames.add(animal.getName());
            }
        }
        return leapYearNames;
    }

    @Override
    public List<AbstractAnimal> findOlderAnimal(List<AbstractAnimal> animals, int n) {
        List<AbstractAnimal> olderAnimals = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();
        for (AbstractAnimal animal : animals) {
            if (animal.getBirthDate().isBefore(currentDate.minusYears(n))) {
                olderAnimals.add(animal);
            }
        }
        return olderAnimals;
    }

    @Override
    public void findDuplicate(List<AbstractAnimal> animals) {
        Set<AbstractAnimal> uniqueAnimals = new HashSet<>();
        Set<AbstractAnimal> duplicates = new HashSet<>();
        for (AbstractAnimal animal : animals) {
            if (!uniqueAnimals.add(animal)) {
                duplicates.add(animal);
            }
        }
        System.out.println("Дубликаты животных:");
        for (AbstractAnimal duplicate : duplicates) {
            System.out.println(duplicate.getName());
        }
    }
}
