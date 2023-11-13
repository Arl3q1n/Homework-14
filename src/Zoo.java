import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Zoo {

    Elephant elephant = new Elephant();
    Jaguar jaguar = new Jaguar();
    Lion lion = new Lion();
    Wolf wolf = new Wolf();
    Zebra zebra = new Zebra();

    List<String> animalsName = Arrays.asList(
        elephant.name, jaguar.name, lion.name, wolf.name, zebra.name
    );

    List<String> animalsFavFood = Arrays.asList(
            elephant.food, jaguar.food, lion.food, wolf.food, zebra.food
    );

    List<Integer> animalsAge = Arrays.asList(
            elephant.age, jaguar.age, lion.age, wolf.age, zebra.age
    );

    public void displayName(List<String> list_) {
        System.out.print("[~] Animals Name: ");
        for (String name: list_) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    public void displayFood(List<String> list_) {
        System.out.print("[~] Animals favourite food: ");
        for (String food: list_) {
            System.out.print(food + " ");
        }
        System.out.println();
    }

    public void displayAge(List<Integer> list_) {
        System.out.print("[~] Animals age: ");
        for (Integer age: list_) {
            System.out.print(age + " ");
        }
        System.out.println();
    }

}
