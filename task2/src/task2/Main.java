package task2;

import java.util.List; 


public class Main {
    public static void main(String[] args) {
        CreateAnimalService animalService = new CreateAnimalService();

        // Создание 10 уникальных животных
        System.out.println("Создание 10 уникальных животных:");
        List<Animal> animalList = animalService.createDefaultAnimals();

        // Создание 5 животных
        int N = 5; 
        System.out.println("\nСоздание " + N + " животных:");
        animalList = animalService.createNAnimals(N);

        // Создание животных с использованием do-while
        System.out.println("\nСоздание " + N + " животных с использованием do-while:");
        animalList = animalService.createAnimalsUsingDoWhile(N);

        SearchService searchService = new SearchServiceImpl();

        String[] leapYearNames = searchService.findLeapYearNames(animalList.toArray(new Animal[0])); 
        System.out.println("\nЖивотные, родившиеся в високосный год:");
        for (String name : leapYearNames) {
            System.out.println(name);
        }

        int age = 5; 
        Animal[] olderAnimals = searchService.findOlderAnimal(animalList.toArray(new Animal[0]), age); 
        System.out.println("\nЖивотные старше " + age + " лет:");
        for (Animal animal : olderAnimals) {
            System.out.println(animal.getName());
        }

        System.out.println("\nДубликаты животных:");
        searchService.findDuplicate(animalList.toArray(new Animal[0])); 
    }
}
