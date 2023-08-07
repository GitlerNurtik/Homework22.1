import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        try {
            Places places = Places.valueOf(word.toUpperCase());
            switch (places) {
                case LONDON:
                    System.out.println(places);
                    break;
                case PARIS:
                    System.out.println(places);
                    break;
                default:
                    System.out.println("Myndai jok");
//                case AUTUMN -> System.out.println("Kuz");
//                case SUMMER -> System.out.println();
//                default -> System.out.println();
            }
        }catch (IllegalArgumentException e){
            System.out.println("Myndai enum jok");
        }
    }
}