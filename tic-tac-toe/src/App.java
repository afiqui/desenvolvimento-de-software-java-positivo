import java.util.Scanner;

public class App {

    static int [][] ticTacToeTable = new int [3][3];
    static int turn = 0;
 
    public static void main(String[] args) throws Exception {

        // vamos limpar o tabuleiro colocando um "-1"
        initTable();
        Scanner scanner = new Scanner(System.in);
        int player = getPlayerTurn(turn);
        boolean gameIsTied = false;
        while (!isGameOver() && !gameIsTied){
            if (turn >= 9){
                gameIsTied = true;
                break;
            } 
            player = getPlayerTurn(turn);
            System.out.println(String.format("Player´s %d (%s) turn - Type the number of the position", player, player == 1 ? 'x' : 'o'));
            printTable(0);
            System.out.print("Digite sua jogada: ");
            int playerMove = scanner.nextInt();
            while(!isValidPosition(playerMove)){
                System.out.println("Invalid Position!");
                System.out.print("Type a valid position: ");
                playerMove = scanner.nextInt();
            }
            addPosition(player, playerMove);
            printTable(1);
            turn++;              
            
        }   
        
        System.out.println("Game Over!");

        if (gameIsTied){
            System.out.println("No Winner - Draw");
        }else{
            player = getPlayerTurn(turn-1);
            System.out.println(String.format("Victory of Player %d - GGWP", player));
        }
        
        scanner.close();

    }

    public static void initTable(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                ticTacToeTable[i][j] = -1;
            }
        }
    }

    public static int getPlayerTurn(int turn){
        //retorna quem ira¡ jogar

        //jogador 1 ou jogador 2
        if (turn %2 == 0){
            return 1;
        }else{
            return 2;
        }

    }

    public static boolean isGameOver(){
        for(int i=0;i<3;i++){ /// linha            
            if (ticTacToeTable[i][0] != -1 && ticTacToeTable[i][0] == ticTacToeTable[i][1] && ticTacToeTable[i][0] == ticTacToeTable[i][2]) return true;            
        }

        for(int i=0;i<3;i++){ /// linha            
            if (ticTacToeTable[0][i] != -1 && ticTacToeTable[0][i] == ticTacToeTable[1][i] && ticTacToeTable[1][i] == ticTacToeTable[2][i]) return true;            
        }

        if (ticTacToeTable[0][0] != -1 && ticTacToeTable[0][0] == ticTacToeTable[1][1] && ticTacToeTable[1][1] == ticTacToeTable[2][2]) return true;  
        if (ticTacToeTable[2][0] != -1 &&ticTacToeTable[2][0] == ticTacToeTable[1][1] && ticTacToeTable[1][1] == ticTacToeTable[0][2]) return true; 
        return false;
    }

    public static void printTable(int mode){
        
        if (mode == 0){
            for(int i=0;i<3;i++){
                String value1 = getTableValue(i,0);
                String value2 = getTableValue(i,1);
                String value3 = getTableValue(i,2);
                String line = String.format("%s %s %s", value1, value2, value3);
                System.out.println(line);
            }
        }else{
            for(int i=0;i<3;i++){
                String value1 = getTableValueAfterEachPlay(i,0);
                String value2 = getTableValueAfterEachPlay(i,1);
                String value3 = getTableValueAfterEachPlay(i,2);
                String line = String.format("%s %s %s", value1, value2, value3);
                System.out.println(line);
            }
        }
        
        
    }

    public static String getTableValue(int posX, int posY){
        int positionValue = ticTacToeTable[posX][posY];
        if (positionValue == -1){
            return ""+(posX*3+posY);
        }else{
            return "-";
        }
    }

    public static String getTableValueAfterEachPlay(int posX, int posY){
        int positionValue = ticTacToeTable[posX][posY];
        if (positionValue == -1){
            return "-";
        }else if (positionValue == 1){
            return "x";
        }
        return "o";
    }

    public static boolean isValidPosition(int position){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (i*3 + j == position){
                    int positionValue = ticTacToeTable[i][j];
                    return positionValue == -1;
                }
            }
        }
        return false;
    }

    public static boolean addPosition(int player, int position){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (i*3 + j == position){
                    ticTacToeTable[i][j] = player;
                }
            }
        }
        return false;
    }
}
