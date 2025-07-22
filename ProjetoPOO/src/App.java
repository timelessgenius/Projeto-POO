
public class App {
    public static void main(String[] args) {
        System.out.println("--- Teste do Sistema de Gerenciamento de Escola ---");

        
        Escola minhaEscola = new Escola("Escola de Programação Orientada a Objetos");
        System.out.println("\n" + minhaEscola);

        
        Professor profGalba = new Professor(5, "Galba Falce de Almeida", "12345");
        Professor profAna = new Professor(3, "Ana Paula Silva", "67890");
        minhaEscola.adicionarProfessor(profGalba);
        minhaEscola.adicionarProfessor(profAna);
        System.out.println("\n" + minhaEscola);

        
        Aluno aluno1 = new Aluno("2023001", "João Silva");
        Aluno aluno2 = new Aluno("2023002", "Maria Souza");
        Aluno aluno3 = new Aluno("2023003", "Pedro Santos");
        minhaEscola.adicionarAluno(aluno1);
        minhaEscola.adicionarAluno(aluno2);
        minhaEscola.adicionarAluno(aluno3);
        System.out.println("\n" + minhaEscola);

        
        Sala sala101 = new Sala(101, 30); // Capacidade 30
        Sala sala102 = new Sala(102, 20); // Capacidade 20
        minhaEscola.adicionarSala(sala101);
        minhaEscola.adicionarSala(sala102);
        System.out.println("\n" + minhaEscola);

       
        Horario hSegManha = null;
        Horario hSegTarde = null;
        Horario hTerManha = null;
        Horario hQuaTarde = null;

        try {
            hSegManha = new Horario(8, 10, 2); // Segunda-feira, 8h-10h
            hSegManha.adicionarDiasDaSemana(2, "Segunda-feira");
            hSegTarde = new Horario(14, 16, 2); // Segunda-feira, 14h-16h
            hSegTarde.adicionarDiasDaSemana(2, "Segunda-feira");
            hTerManha = new Horario(9, 11, 3); // Terça-feira, 9h-11h
            hTerManha.adicionarDiasDaSemana(3, "Terça-feira");
            hQuaTarde = new Horario(13, 15, 4); // Quarta-feira, 13h-15h
            hQuaTarde.adicionarDiasDaSemana(4, "Quarta-feira");
            System.out.println("\nHorários criados com sucesso.");
        } catch (HorarioInvalidoException e) {
            System.err.println("Erro ao criar horário: " + e.getMessage());
        }

        
        Turma turmaPOO = new Turma(2025, "Programação Orientada a Objetos");
        Turma turmaBD = new Turma(2025, "Banco de Dados");
        Turma turmaWeb = new Turma(2025, "Desenvolvimento Web");

        
        if (hSegManha != null) turmaPOO.adicionarHorario(hSegManha);
        if (hTerManha != null) turmaPOO.adicionarHorario(hTerManha);
        if (hSegTarde != null) turmaBD.adicionarHorario(hSegTarde);
        if (hQuaTarde != null) turmaWeb.adicionarHorario(hQuaTarde);

       
        System.out.println("\n--- Testando Conflito de Horário na Turma ---");
        try {
            Horario hConflitoPOO = new Horario(9, 10, 2); // Conflita com hSegManha (8-10)
            hConflitoPOO.adicionarDiasDaSemana(2, "Segunda-feira");
            turmaPOO.adicionarHorario(hConflitoPOO); // Deve dar conflito
        } catch (HorarioInvalidoException e) {
            System.err.println("Erro ao criar horário de conflito: " + e.getMessage());
        }
        try {
            Horario hNaoConflitoPOO = new Horario(11, 13, 2); // Não conflita
            hNaoConflitoPOO.adicionarDiasDaSemana(2, "Segunda-feira");
            turmaPOO.adicionarHorario(hNaoConflitoPOO); // Deve adicionar
        } catch (HorarioInvalidoException e) {
            System.err.println("Erro ao criar horário sem conflito: " + e.getMessage());
        }
        System.out.println(turmaPOO);

        
        profGalba.adicionarTurma(turmaPOO);
        profGalba.adicionarTurma(turmaBD);
        profAna.adicionarTurma(turmaWeb);
        System.out.println("\n" + profGalba);
        System.out.println("\n" + profAna);

        
        System.out.println("\n--- Matrícula de Alunos ---");
        aluno1.MatricularTurma(turmaPOO);
        aluno2.MatricularTurma(turmaPOO);
        aluno3.MatricularTurma(turmaPOO); 
        aluno1.MatricularTurma(turmaBD);
        aluno2.MatricularTurma(turmaWeb);

        System.out.println("\n" + turmaPOO);
        System.out.println("\n" + turmaBD);
        System.out.println("\n" + turmaWeb);

        aluno1.ListarTurmas();
        aluno2.ListarTurmas();
        aluno3.ListarTurmas();

       
        System.out.println("\n--- Alocação de Turmas em Salas ---");
        
        sala101.adicionarTurma(turmaPOO);
        System.out.println(sala101);

        // Turma BD (1 aluno) na Sala 101 (capacidade 30) - OK, mas verificar conflito de horário
        // Turma POO: Seg 8-10, Ter 9-11, Seg 11-13
        // Turma BD: Seg 14-16
        // Não há conflito de horário entre POO e BD na mesma sala
        sala101.adicionarTurma(turmaBD);
        System.out.println(sala101);

        // Tentar adicionar Turma Web (1 aluno) na Sala 101
        // Turma Web: Qua 13-15
        // Não há conflito de horário
        sala101.adicionarTurma(turmaWeb);
        System.out.println(sala101);

        // Tentar adicionar uma turma com conflito de horário na Sala 101
        System.out.println("\n--- Testando Conflito de Horário na Sala ---");
        Turma turmaConflitoSala = new Turma(2025, "Turma Conflito");
        try {
            Horario hConflitoSala = new Horario(9, 10, 2); // Conflita com Turma POO (Seg 8-10)
            hConflitoSala.adicionarDiasDaSemana(2, "Segunda-feira");
            turmaConflitoSala.adicionarHorario(hConflitoSala);
        } catch (HorarioInvalidoException e) {
            System.err.println("Erro ao criar horário para turma de conflito: " + e.getMessage());
        }
        sala101.adicionarTurma(turmaConflitoSala); // Deve dar conflito
        System.out.println(sala101);

        // Tentar adicionar uma turma que excede a capacidade da sala
        System.out.println("\n--- Testando Capacidade da Sala ---");
        Turma turmaGrande = new Turma(2025, "Turma Grande");
        for (int i = 0; i < 25; i++) { // 25 alunos
            turmaGrande.adicionarAluno(new Aluno("999" + i, "Aluno Grande " + i));
        }
        System.out.println(turmaGrande);
        // Sala 102 tem capacidade 20. Turma Grande tem 25 alunos.
        sala102.adicionarTurma(turmaGrande); // Deve exceder capacidade
        System.out.println(sala102);

        // 10. Remover Alunos de Turmas
        System.out.println("\n--- Removendo Alunos de Turmas ---");
        aluno1.removerTurma(turmaBD);
        System.out.println("\n" + turmaBD);
        aluno1.ListarTurmas();

        turmaPOO.removerAluno(aluno2);
        System.out.println("\n" + turmaPOO);

        // 11. Remover Turmas de Salas
        System.out.println("\n--- Removendo Turmas de Salas ---");
        sala101.removerTurma(turmaWeb);
        System.out.println(sala101);

        // 12. Destruir Objetos (limpar referências)
        System.out.println("\n--- Destruindo Objetos ---");
        aluno3.destruirAluno();
        System.out.println(aluno3); // Deve mostrar atributos nulos/inválidos

        profAna.destruirProfessor();
        System.out.println(profAna);

        turmaWeb.destruirTurma();
        System.out.println(turmaWeb);

        sala102.destruirSala();
        System.out.println(sala102);

        minhaEscola.destruirEscola();
        System.out.println("\n" + minhaEscola); // Deve mostrar listas vazias
    }
}
