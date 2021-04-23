import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ProcessaBoleto {
    private final LeituraRetorno leituraRetorno;

    public ProcessaBoleto(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public final List<Boleto> processar(String nomeArquivo) {
        try {
            BufferedReader bufferDeLeitura = new BufferedReader(new FileReader(nomeArquivo));
            String linhaLida;

            List<Boleto> listaDeBoletos = new ArrayList<>();
            while ((linhaLida = bufferDeLeitura.readLine()) != null) {
                String[] informacoesDaLinha = linhaLida.split(";");

                Boleto boleto = leituraRetorno.processarLinhaArquivo(informacoesDaLinha);
                listaDeBoletos.add(boleto);
                System.out.println(boleto);
            }
            return listaDeBoletos;

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return null;
    }
}