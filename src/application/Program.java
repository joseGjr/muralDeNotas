package application;

import java.util.Locale;
import java.util.Scanner;
import etities.Aluno;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale SetDefault = (Locale.US);
        Aluno aluno = new Aluno();

        System.out.println("NOME DO ALUNO");
        aluno.aluno = sc.next();

        System.out.println("PRIMEIRA NOTA:  ");
        aluno.notaOne = sc.nextDouble();

        System.out.println("SEGUNDA NOTA: ");
        aluno.notaTwo = sc.nextDouble();

        System.out.println("TERCEIRA NOTA:  ");
        aluno.notaTree = sc.nextDouble();
        System.out.println(aluno.mediaFinal());

        if (aluno.mediaFinal() >= 76){
            System.out.println("ALUNO APROVADO "+ "MEDIA  " +aluno.mediaFinal());
        }else {
            System.out.println("ALUNO REPROVADO"+" MEDIA  "+aluno.mediaFinal()+"  pontos para recuperar:  "+ aluno.pontosRecover());
        }



        sc.close();
    }
}
