package task2;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class SearchServiceImpl implements SearchService {

    @Override
    public List<String> findLeapYearNames(List<AbstractAnimal> animals) {
        return animals.stream()
                .filter(animal -> animal.getBirthDate().getYear() % 4 == 0 &&
                        (animal.getBirthDate().getYear() % 100 != 0 || animal.getBirthDate().getYear() % 400 == 0))
                .map(AbstractAnimal::getName)
                .collect(Collectors.toList());
    }

    @Override
    public List<AbstractAnimal> findOlderAnimal(List<AbstractAnimal> animals, int n) {
        LocalDate thresholdDate = LocalDate.now().minusYears(n);
        return animals.stream()
                .filter(animal -> animal.getBirthDate().isBefore(thresholdDate))
                .collect(Collectors.toList());
    }

    @Override
    public void findDuplicate(List<AbstractAnimal> animals) {
        Map<String, Long> duplicates = animals.stream()
                .collect(Collectors.groupingBy(AbstractAnimal::getName, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Дубликаты животных:");
        duplicates.forEach((name, count) -> System.out.println(name + ": " + count + " раз(а)"));
    }
}

