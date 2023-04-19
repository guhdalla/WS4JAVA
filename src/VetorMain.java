public class VetorMain {

    public static void main(String[] args) {

        int[] vetor1 = new int[4];
        int[] vetor2 = {1, 2, 3, 4, 5};

        consultarUmValorDoVetor(vetor2, 4);
        consultarTodosValoresVetor(vetor2);
        adicionarValorNoVetor(vetor2, 2, 0);
        consultarUmValorDoVetor(vetor1, 2);
        consultarTodosValoresVetor(vetor2);
    }

    private static void adicionarValorNoVetor(int[] vetor1, int index, int value) {
        vetor1[index] = value;
    }

    private static void consultarTodosValoresVetor(int[] vetor2) {
        for (int i = 0; i < vetor2.length; i++){
            System.out.println(vetor2[i]);
        }
    }

    private static void consultarUmValorDoVetor(int[] vetor2, int index) {
        System.out.println(vetor2[index]);
    }
}