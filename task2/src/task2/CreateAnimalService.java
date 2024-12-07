package task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateAnimalService {
    private static final String[] breeds = {"Собака", "Кошка", "Лев", "Тигр", "Медведь"};
    private static final String[] names = {"Жучка", "Барсик", "Чарльз", "Шерхан", "Балу"};
    private static final String[] characters = {"Дружелюбный", "Агрессивный", "Игривый", "Спокойный", "Забавный"};
    private Random random = new Random();

    public List<AbstractAnimal> createDefaultAnimals() {
        List<AbstractAnimal> animals = new ArrayList<>();
        int count = 0;
        while (count < 10) {
            animals.add(createRandomAnimal());
            count++;
        }
        return animals;
    }

    public List<AbstractAnimal> createAnimals(int n) {
        List<AbstractAnimal> animals = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            animals.add(createRandomAnimal());
        }
        return animals;
    }

    public List<AbstractAnimal> createAnimalsWithDoWhile(int n) {
        List<AbstractAnimal> animals = new ArrayList<>();
        int count = 0;
        do {
            animals.add(createRandomAnimal());
            count++;
        } while (count < n);
        return animals;
    }

    private AbstractAnimal createRandomAnimal() {
        String breed = breeds[random.nextInt(breeds.length)];
        String name = names[random.nextInt(names.length)];
        double cost = random.nextDouble() * 100;
        String character = characters[random.nextInt(characters.length)];
        LocalDate birthDate = LocalDate.of(random.nextInt(20) + 2000, random.nextInt(12) + 1, random.nextInt(28) + 1);
        
        AbstractAnimal animal;
        if (random.nextBoolean()) {
            animal = new Predator(breed, name, cost, character, birthDate);
        } else {
            animal = new Pet(breed, name, cost, character, birthDate);
        }
        
        System.out.println("Создано новое животное: " + animal.getName());
        return animal;
    }
}
