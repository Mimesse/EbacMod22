package Exemplos;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExemplosOptional {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Optional<Pessoa> opcinal = lista.stream()
                .max(Comparator.comparing(Pessoa::getIdade));

        if (opcinal.isPresent()) {
            System.out.println(opcinal.get());
        }

        opcinal.ifPresent(System.out::println);
    }
}
