package etities;

public class Aluno {
     public String aluno;
     public double notaOne;
     public double notaTwo;
     public double notaTree;

     public double mediaFinal (){
          return notaOne+notaTwo+notaTree /3;
     }

     public double pontosRecover(){
          return  mediaFinal()-75;
     }

}

