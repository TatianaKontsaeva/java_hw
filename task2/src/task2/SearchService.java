package task2;
import java.util.List;
public interface SearchService {
    List<String> findLeapYearNames(List<AbstractAnimal> animals);
    List<AbstractAnimal> findOlderAnimal(List<AbstractAnimal> animals, int n);
    void findDuplicate(List<AbstractAnimal> animals);
}
