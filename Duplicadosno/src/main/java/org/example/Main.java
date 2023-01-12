package org.example;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int numero;
        int quantidade = 3;
        int i = 0;

        ArrayList<Integer> Lista = new ArrayList<Integer>();
        ArrayList<Integer> Lista2 = new ArrayList<Integer>();

        for(i = 0; i < quantidade; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + " Número da lista 1"));
            Lista.add(numero);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + " Número da lista 2"));
            Lista2.add(numero);

        }
        JOptionPane.showMessageDialog(null, "Exibindo o ArrayList 1\n" + Lista);
        JOptionPane.showMessageDialog(null, "Exibindo o ArrayList 2\n" + Lista2);

        arrays objeto = new arrays(Lista,Lista2);
        System.out.println(objeto.verificarDuplicados());

    }

}

