public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[3][3];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                arr[i][j] = " ";
            }
        }

        arr[2][2] = "o";
        System.out.println("-------");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print("|");
                System.out.print(arr[i][j]);
            }
            System.out.print("|");
            System.out.println();
            System.out.println("-------");
        }
    }
}
