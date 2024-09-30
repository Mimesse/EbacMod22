package TarefaMod22;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SeparandoFeM {

    public static void main(String[] args) {
        List<Pessoas> lista = new Pessoas().HomensxMulheres();

        lista.stream().forEach(pessoas -> System.out.println());


        System.out.println("---------");
        System.out.println("---------");

        System.out.println("As Mulheres da Lista são: ");

        lista.stream()
                .filter(pessoas -> pessoas.getSexo().equals("F"))
                .forEach(p -> System.out.println(p.getNome()));


    }
}


