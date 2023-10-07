import service.ReaderService;

public class Main {
    public static void main(String[] args) {
        int[] array = ReaderService.readArray();
        System.out.println(ArrayChallenge.arrayChallenge(array));
    }

}
