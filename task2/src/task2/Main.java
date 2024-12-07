package task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreateAnimalService createAnimalService = new CreateAnimalService();

        List<AbstractAnimal> defaultAnimals = createAnimalService.createDefaultAnimals();
        List<AbstractAnimal> customAnimals = createAnimalService.createAnimals(5);
        List<AbstractAnimal> doWhileAnimals = createAnimalService.createAnimalsWithDoWhile(5);

        System.out.println("Созданы стандартные животные: " + defaultAnimals.size());
        System.out.println("Созданы кастомные животные: " + customAnimals.size());
        System.out.println("Созданы животные с использованием do-while: " + doWhileAnimals.size());

        List<AbstractAnimal> animals = createAnimalService.createDefaultAnimals();

        SearchService searchService = new SearchServiceImpl();
        
        List<String> leapYearNames = searchService.findLeapYearNames(animals);
        System.out.println("Животные, родившиеся в високосный год: " + leapYearNames);

        List<AbstractAnimal> olderAnimals = searchService.findOlderAnimal(animals, 5);
        System.out.println("Животные старше 5 лет: " + olderAnimals.size());

        searchService.findDuplicate(animals);
    }
}
