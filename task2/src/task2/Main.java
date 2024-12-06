package task2;
public class Main {
    public static void main(String[] args) {
        CreateAnimalService animalService = new CreateAnimalService();

        // Создание 10 уникальных животных
        System.out.println("Создание 10 уникальных животных:");
        animalService.createDefaultAnimals();

        // Создание N животных
        int N = 5; // Вы можете изменить значение N
        System.out.println("\nСоздание " + N + " животных:");
        animalService.createNAnimals(N);

        // Создание животных с использованием do-while
        System.out.println("\nСоздание " + N + " животных с использованием do-while:");
        animalService.createAnimalsUsingDoWhile(N);
    }
}
