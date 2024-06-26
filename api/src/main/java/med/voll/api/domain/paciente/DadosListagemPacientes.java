package med.voll.api.domain.paciente;

public record DadosListagemPacientes(
        Long id,
        String nome,
        String cpf,
        String email){

    public DadosListagemPacientes(Paciente paciente){
       this(paciente.getId(), paciente.getNome(),paciente.getCpf(), paciente.getEmail());
    }
}
