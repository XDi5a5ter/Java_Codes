
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class PessoaFisica extends Pessoa {
    private String cpf;
    private LocalDate dataNascimento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public String getDocumento() {
        return this.getCpf();
    }

    @Override
    public String getDataFormatado() {
        return this.dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
    }
    
    
}
