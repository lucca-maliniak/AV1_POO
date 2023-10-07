package br.consulta;

public class Main {
    public static void main(String[] args) {
        var p1 = new Paciente(1, "Lucca", "20136321","Rua castelo da beira", "983135895", "26/02/2003", "Programador");
        var p1_exame = p1.adicionarExame(1, "Tomografia", "07/10/2023", 25.80);
        System.out.println(p1_exame);
    }
}
