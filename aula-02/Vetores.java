void main() {

    // um vetor em Java é um objeto
    int[] vetor = new int[5];

    vetor[0] = 10;
    vetor[4] = 90;

    int[] outra = { 3, 4, 5, 8 };

    int[][] matriz = new int[3][2];

    matriz[2][1] = 50;

    // vetor de 100 posicoes e eu quero que iniciem ele com impares, começando em 3

    /*
     * int [] vetor2 = new int[100];
     * int n = 3;
     * for(int i = 0; i < vetor2.length; i++){
     * vetor2[i] = n;
     * n = n + 2;
     * IO.println(vetor2[i]);
     * }
     */

    // printar matriz 3x3 1 2 3
    // 4 5 6
    // 7 8 9
    /*
    int[][] matriz2 = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
    };

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            IO.print(matriz2[i][j]);
        }
        IO.println();
    }
    */

    /*
    int[] vetor3 = {4, 7, 20, 400};

    for (int i = 0; i < vetor3.length; i++) {
        IO.println(vetor[1]);
    }

    for (int i : vetor3) {
        IO.println(vetor[1]);
    }
    */
}