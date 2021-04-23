import java.time.LocalDate;
import java.time.LocalDateTime;

public class BancoBradesco implements LeituraRetorno {
    @Override
    public Boleto processarLinhaArquivo(String[] vetorLinhaArquivo) {
        Boleto boleto = new Boleto();
        boleto.setId(Integer.parseInt(vetorLinhaArquivo[0]));
        boleto.setCodigoBanco(vetorLinhaArquivo[1]);
        boleto.setAgencia(vetorLinhaArquivo[2]);
        boleto.setContaBancaria(vetorLinhaArquivo[3]);
        boleto.setDataVencimento(LocalDate.parse(vetorLinhaArquivo[4]));
        boleto.setDataPagamento(LocalDateTime.parse(vetorLinhaArquivo[5]));
        boleto.setCpfCliente(vetorLinhaArquivo[6]);
        boleto.setValor(Double.parseDouble(vetorLinhaArquivo[7]));
        boleto.setMulta(Double.parseDouble(vetorLinhaArquivo[8]));
        boleto.setJuros(Double.parseDouble(vetorLinhaArquivo[9]));
        return boleto;
    }
}