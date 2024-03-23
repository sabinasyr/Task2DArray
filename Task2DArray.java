public class Task2DArray {
    public static void main(String[] args) {
        char[][] papancatur = {
                {'B', 'N', 'G', 'R', 'Q', 'G', 'N', 'B'},
                {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                {'B', 'N', 'G', 'R', 'Q', 'G', 'N', 'B'}
        };
        for (int i = 0; i < papancatur.length; i++) {
            for (int j = 0; j < papancatur[i].length; j++) {
                System.out.print(papancatur[i][j] + " ");
            }
            System.out.println();
        }
    }
}

