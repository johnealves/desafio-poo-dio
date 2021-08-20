import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJohn = new Dev();
        devJohn.setNome("john");
        devJohn.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos do John: " + devJohn.getConteudosInscritos());
        devJohn.progredir();
        System.out.println("Conteudos inscritos do John: " + devJohn.getConteudosInscritos());
        System.out.println("Conteudos concluidos do John: " + devJohn.getConteudosConcluidos());
        System.out.println("XP: " + devJohn.calcularXp());
        System.out.println("");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos da Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos inscritos da Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos da Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularXp());
        System.out.println("");


    }
}
