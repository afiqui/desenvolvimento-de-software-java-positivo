import java.util.Scanner;

public class App {

    static int [][] ticTacToeTable = new int [3][3];
    static int turn = 0;
 
    public static void main(String[] args) throws Exception {

        // vamos limpar o tabuleiro colocando um "-1"
        initTable();
        Scanner scanner = new Scanner(System.in);

        while (!isGameOver()){
            int player = getPlayerTurn(turn);
            System.out.println(String.format("Jogador %d - Digite o número da casa", player));
            printTable();
            System.out.print("Digite sua jogada: ");
            int playerMove = scanner.nextInt();
            System.out.println(isValidPosition(playerMove));
            turn++; 
            break;   
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
        //retorna quem irá jogar
        //jogador 1 ou jogador 2
        if (turn %2 == 0){
            return 1;
        }else{
            return 2;
        }

    }

    public static boolean isGameOver(){
        return false;
    }

    public static void printTable(){

        for(int i=0;i<3;i++){
            String value1 = getTableValue(i,0);
            String value2 = getTableValue(i,1);
            String value3 = getTableValue(i,2);
            String line = String.format("%s %s %s", value1, value2, value3);
            System.out.println(line);
        }
        
    }

    public static String getTableValue(int posX, int posY){
        int positionValue = ticTacToeTable[posX][posY];
        if (positionValue == -1){
            return ""+(posX*3+posY);
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
}