public class App {

    int cartaJogador1 = 0;
    static int[] cartasJogador1 = {0,3,4,5,6};

    static int [] cartas = new int[54];

    int [][] cartasCorNumeroMatrix = new int [25][54];
    int [][] cartasCorNumeroMatrix2 = {
        {40,73,49,5,96},
        {10,3,4,5,6},
        {0,32,44,55,66},
        {6,8,0,15,61}

    };
    
 
    public static void main(String[] args) throws Exception {
        
        for(int i=0; i<= cartasJogador1.length; i++){
            System.out.println(cartasJogador1[i]);
        }

    }
}