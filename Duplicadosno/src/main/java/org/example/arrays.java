package org.example;

import java.util.ArrayList;
import java.util.List;

public class arrays {
    private List<Integer> meuArrayInfinito;
    private List<Integer> meuArrayInfinito1;
    //contrutor

    public arrays(List<Integer> meuArrayInfinito, List<Integer> meuArrayInfinito1) {
        this.meuArrayInfinito = meuArrayInfinito;
        this.meuArrayInfinito1 = meuArrayInfinito1;
    }

    //metodos
    public List<Integer> verificarDuplicados() {

        List<Integer> duplicados = new ArrayList<>();
        for (Integer i : this.meuArrayInfinito) {
            if (this.meuArrayInfinito1.contains(i)) {
                duplicados.add((i));
            }
        }
        return duplicados;
    }
}


