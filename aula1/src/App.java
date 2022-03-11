public class App {

    int cardsPlayer1 = 0;
    static int maxCards = 54;

    static int[] cardsPlayer2 = {0,3,4,5,6};

    static int [] cards = new int[maxCards];

    static int [][] cartasCorNumeroMatrix = new int [25][54];
    int [][] cartasCorNumeroMatrix2 = {
        {40,73,49,5,96},
        {10,3,4,5,6},
        {0,32,44,55,66},
        {6,8,0,15,61}

    };
    
 
    public static void main(String[] args) throws Exception {
        
        for(int i=0; i< 25; i++){
            for(int j=0; j< 54; j++){
                System.out.println(cartasCorNumeroMatrix[i][j]);
            }
        }






    }
}