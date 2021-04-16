import java.util.Scanner;

public class Main {
    enum Ships {
        BOAT(0, 2),
        CARRIER(1, 3),
        SUBMARINE(2, 4),
        CRUISER(3, 5),
        DESTROYER(4, 7);

        public final int id;
        public final int size;

        Ships(int id, int size) {
            this.id = id;
            this.size = size;
        }

    }
    public static void main(String[] args) {
        String[][] arr = new String[10][10];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                arr[i][j] = " ";
            }
        }

        Ships[] shipArray = new Ships[5];
        shipArray[0] = Ships.BOAT;
        shipArray[1] = Ships.CARRIER;
        shipArray[2] = Ships.SUBMARINE;
        shipArray[3] = Ships.CRUISER;
        shipArray[4] = Ships.DESTROYER;

        Scanner scanner = new Scanner(System.in);
        while(areShipsStillAvailable(shipArray)) {
            // input here
            System.out.println("Your remaining ships are:");
            for(Ships ship : shipArray)
                if(ship != null)
                    System.out.print(ship.id + ": " + ship + "(" + ship.size + ")" + "  ");
            System.out.println();

            System.out.print("Choose a ship: ");
            int shipId = scanner.nextInt();
            if (shipId > 4 || shipId < 0 || shipArray[shipId] == null) {
                System.out.println("Invalid ship number.");
                continue;
            }

            System.out.print("Choose a starting position: (e.g. A4): ");
            String position = scanner.next();
            String row = position.substring(0, 1);
            int rowIndex = mapLetterToInt(row);
            if(rowIndex == -1) {
                System.out.println("Row index is not valid");
                continue;
            }

            int columnIndex = Integer.parseInt(position.substring(1));
            if(columnIndex < 1 || columnIndex > 10) {
                System.out.println("Column index is not valid");
                continue;
            }


            System.out.print("Choose a direction (0 = horizontal, 1 = vertical): ");
            int direction = scanner.nextInt();
            if (direction != 0 && direction != 1) {
                System.out.println("Direction is not valid");
                continue;
            }

            int fieldSize = shipArray[shipId].size;
            boolean x = isShipInBounds(arr, rowIndex, columnIndex, direction, fieldSize);
            if(!x){
                System.out.println("Ship cannot be placed here");
                continue;
            }
            setShip(arr, rowIndex, columnIndex, direction, fieldSize);
            generateField(arr);
            shipArray[shipId] = null;
        }

    }

    public static boolean isShipInBounds(String[][] arr, int rowIndex, int columnIndex, int direction, int fieldSize) {
        if(direction == 1) {
            // return rowIndex + fieldSize <= arr.length;
            if(rowIndex + fieldSize <= arr.length)
                return true;
            else
                return false;
        } else { // direction == 0
            // return columnIndex - 1 + fieldSize <= arr[0].length;
            if(columnIndex - 1 + fieldSize <= arr[0].length)
                return true;
            else
                return false;
        }

       // return (direction == 1 && rowIndex + fieldSize <= arr.length) || (direction == 0 && columnIndex - 1 + fieldSize <= arr[0].length);
    }

    // any function
    public static boolean areShipsStillAvailable(Ships[] ships) {
        for(int i = 0; i < ships.length; i++) {
            if(ships[i] != null) {
                return true;
            }
        }
        return false;
    }

    // arr is passed by "call by reference"
    public static void setShip(String[][] arr, int rowIndex, int columnIndex, int direction, int fieldSize) {
        for(int i = 0; i < fieldSize; i++) {
            if(direction == 1) {
                arr[rowIndex + i][columnIndex-1] = "o";
            } else {
                arr[rowIndex][columnIndex-1+i] = "o";
            }
        }

//        if(direction == 1) {
//            for(int i = 0; i < fieldSize; i++) {
//                arr[rowIndex + i][columnIndex-1] = "o";
//            }
//        } else {
//            for(int i = 0; i < fieldSize; i++) {
//                arr[rowIndex][columnIndex-1+i] = "o";
//            }
//        }
    }

    public static int mapLetterToInt(String letter) {
        switch (letter) {
            case "A": return 0;
            case "B": return 1;
            case "C": return 2;
            case "D": return 3;
            case "E": return 4;
            case "F": return 5;
            case "G": return 6;
            case "H": return 7;
            case "I": return 8;
            case "J": return 9;
            default: return -1;
        }
    }

    public static void printNumbers(String[][] arr) {
        for(int k = -2; k < arr.length + 1; k++) {
            if(k > 0 && k < 10) {
                System.out.print(k + " ");
            } else if (k > 9) {
                System.out.print(k);
            } else  { // uppermost row
                System.out.print(" ");
            }
        }
        System.out.println();
        drawHorizontalLines(arr.length);
    }
    public static void generateField(String[][] arr) {
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        // prints first row with numbers
        printNumbers(arr);

        for(int i = 0; i < arr.length; i++) {
            for(int j = -1; j < arr.length; j++) {
                if(j == -1) { // if true, create letters in first column
                    System.out.print(letters[i] + " ");
                } else { // create cells of the field
                    System.out.print("|");
                    System.out.print(arr[i][j]);
                }
            }
            System.out.print("|"); // last column
            System.out.println();
            drawHorizontalLines(arr.length);
        }

    }

    /***
     * Draws minus signs for each row
     * @param length
     */
    public static void drawHorizontalLines(int length) {
        for(int i = -2; i < (length * 2) + 1; i++) {
            if (i < 0) {
                System.out.print(" ");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
    }
}
