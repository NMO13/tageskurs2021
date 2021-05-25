import java.util.ArrayList;
import java.util.Random;

public class CardGenerator {
    private ArrayList<ArrayList<Integer>> allColumns = new ArrayList<>();
    public ArrayList<Integer> createColumn(ArrayList<Integer> column, int min, int max) {
        Random random = new Random();
        for(int i = 0; i < 5; i++) {
            int x = random.nextInt(max - min) + min;
            while(column.contains(x)) {
                x = random.nextInt(max - min) + min;
            }
            column.add(x);
        }
        return column;
    }

    public ArrayList<ArrayList<Integer>> createColumns() {
        ArrayList<Integer> column1 = new ArrayList<>();
        ArrayList<Integer> column2 = new ArrayList<>();
        ArrayList<Integer> column3 = new ArrayList<>();
        ArrayList<Integer> column4 = new ArrayList<>();
        ArrayList<Integer> column5 = new ArrayList<>();

        column1 = createColumn(column1, 1, 15);
        column2 = createColumn(column2, 16, 30);
        column3 = createColumn(column3, 31, 45);
        column4 = createColumn(column4, 46, 60);
        column5 = createColumn(column5, 61, 75);

        allColumns.add(column1);
        allColumns.add(column2);
        allColumns.add(column3);
        allColumns.add(column4);
        allColumns.add(column5);
        return allColumns;
    }

    @Override
    public String toString() {
        String board = "";
        board = "B I N G O";
        board += "\n=========";

        for(int i = 0; i < allColumns.size(); i++) {
            board += "\n";
            for(int j = 0; j < 5; j++) {
                if (i == 2 && j == 2)
                    board += "  ";
                else
                    board += allColumns.get(j).get(i) + " ";
            }
        }
        return board;
    }
}
