package tarea9;

public class Main {

    public static void main(String[] args) {

        Miscelanea misc = new Miscelanea();

        for(int i = 0; i < 1000; i++){
            System.out.println(Miscelanea.generaAleatorioEntre(7, 11));
        }

        System.out.println();

        System.out.println(misc.concatena("gato", "pardo"));


    }

}
