import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8d);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso POO");
        curso2.setDescricao("Descricao curso POO");
        curso2.setCargaHoraria(4d);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Curso Java");
        mentoria1.setDescricao("Descricao curso Java");
        mentoria1.setData(LocalDate.now());

        // System.out.println(curso1.getTitulo());
        // System.out.println(curso2.getTitulo());
        // System.out.println(mentoria1.getTitulo());

        Bootcamp meuBootcamp = new Bootcamp();
        meuBootcamp.setNome("Bootcamp Java Dev");
        meuBootcamp.setDescricao("Descricao do Bootcamp Java Dev");
        meuBootcamp.getConteudos().add(curso1);
        meuBootcamp.getConteudos().add(curso2);
        meuBootcamp.getConteudos().add(mentoria1);

        // System.out.println(meuBootcamp);

        Dev devJoana = new Dev();
        devJoana.setNome("Joana");
        devJoana.inscreverNoBootcamp(meuBootcamp);
        System.out.println("Joana - inscritos: " + devJoana.getConteudosInscritos());
        System.out.println("Joana - concluidos: " + devJoana.getConteudosConcluidos());
        devJoana.progredir();
        System.out.println("Joana - inscritos: " + devJoana.getConteudosInscritos());
        System.out.println("Joana - concluidos: " + devJoana.getConteudosConcluidos());
        devJoana.progredir();
        devJoana.progredir();
        System.out.println("Joana - inscritos: " + devJoana.getConteudosInscritos());
        System.out.println("Joana - concluidos: " + devJoana.getConteudosConcluidos());
    }
}
