package task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateAnimalService {
    private static final String[] breeds = {"Лев", "Тигр", "Кошка", "Собака"};
    private static final String[] names = {"Мурка", "Барсик", "Рекс", "Шарик"};
    private static final double[] costs = {1000, 1500, 500, 300};
    private static final String[] characters = {"Дружелюбный", "Агрессивный", "Спокойный", "Игривый"};

    public List<Animal> createDefaultAnimals() {
        List<Animal> animals = new ArrayList<>();
        int count = 0;
        while (count < 10) {
            animals.add(createRandomAnimal());
            count++;
        }
        return animals;
    }

    public List<Animal> createNAnimals(int N) {
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            animals.add(createRandomAnimal());
        }
        return animals;
    }

    public List<Animal> createAnimalsUsingDoWhile(int N) {
        List<Animal> animals = new ArrayList<>();
        int count = 0;
        do {
            animals.add(createRandomAnimal());
            count++;
        } while (count < N);
        return animals;
    }

    private Animal createRandomAnimal() {
        Random random = new Random();
        String breed = breeds[random.nextInt(breeds.length)];
        String name = names[random.nextInt(names.length)];
        double cost = costs[random.nextInt(costs.length)];
        String character = characters[random.nextInt(characters.length)];
        
        // создаем рандомно дату раждения
        LocalDate birthDate = LocalDate.of(random.nextInt(2000) + 1920, random.nextInt(12) + 1, random.nextInt(28) + 1);

        // Случайно выбираем, будет ли это хищник или домашнее животное
        if (random.nextBoolean()) {
            Animal animal = new Predator(breed, name, cost, character, birthDate);
            System.out.println("Создан хищник: " + animal.getName());
            return animal;
        } else {
            Animal animal = new Pet(breed, name, cost, character, birthDate);
            System.out.println("Создан питомец: " + animal.getName());
            return animal;
        }
    }
}
