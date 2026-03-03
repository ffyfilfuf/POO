package ads.poo;

public class Main{

    static void main(String[] args) {


        if (args.length == 0 ){
            IO.println("Não forneceu argumentos de linha de comando");
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println((i+1) + " argumento: " + args[i]);
        }
    }
}