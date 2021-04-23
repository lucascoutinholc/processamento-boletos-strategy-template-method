import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BancoBrasil implements LeituraRetorno {
    @Override
    public Boleto processarLinhaArquivo(String[] vetorLinhaArquivo) {
        Boleto boleto = new Boleto();
        boleto.setId(Integer.parseInt(vetorLinhaArquivo[0]));
        boleto.setCodigoBanco(vetorLinhaArquivo[1]);
        boleto.setDataVencimento(LocalDate.parse(vetorLinhaArquivo[2]));
        boleto.setDataPagamento(LocalDateTime.parse(vetorLinhaArquivo[3]));
        boleto.setValor(Double.parseDouble(vetorLinhaArquivo[4]));
        boleto.setMulta(Double.parseDouble(vetorLinhaArquivo[5]));
        boleto.setJuros(Double.parseDouble(vetorLinhaArquivo[6]));
        return boleto;
    }
}