import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CardGenerator cardGenerator = new CardGenerator();
        ArrayList<ArrayList<Integer>> x = cardGenerator.createColumns();
        System.out.println(x);

        System.out.println(cardGenerator);
    }
}
