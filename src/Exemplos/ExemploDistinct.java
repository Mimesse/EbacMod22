package Exemplos;

import java.util.List;
import java.util.stream.Stream;

public class ExemploDistinct {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Stream<Pessoa> stream = lista.stream().distinct();
    }
}
