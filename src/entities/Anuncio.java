package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Guilherme Lopes
 */
public class Anuncio {

    String nomeAnuncio;
    String cliente;
    String dataInicio;
    String dataTermino;
    double investimentoDia;    
    
    public static long quantoTempo(String dataInicio, String dataTermino) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInicioD = dateFormat.parse(dataInicio);
        Date dataTerminoD = dateFormat.parse(dataTermino);
        long diferencaEmMM = Math.abs(dataTerminoD.getTime() - dataInicioD.getTime());
        long diferencaDias = diferencaEmMM / (1000 * 60 * 60 * 24);//quantos dias
        return diferencaDias;
    }

    /*
     * Contrutores
     */
    public Anuncio() {
    }

    public Anuncio(String nomeAnuncio, String cliente, String dataInicio, String dataTermino, double investimentoDia) {
        this.nomeAnuncio = nomeAnuncio;
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.investimentoDia = investimentoDia;
    }

    /**
     * @return the nomeAnuncio
     */
    public String getNomeAnuncio() {
        return nomeAnuncio;
    }

    /**
     * @param nomeAnuncio the nomeAnuncio to set
     */
    public void setNomeAnuncio(String nomeAnuncio) {
        this.nomeAnuncio = nomeAnuncio;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the dataInicio
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataTermino
     */
    public String getDataTermino() {
        return dataTermino;
    }

    /**
     * @param dataTermino the dataTermino to set
     */
    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    /**
     * @return the investimentoDia
     */
    public double getInvestimentoDia() {
        return investimentoDia;
    }

    /**
     * @param investimentoDia the investimentoDia to set
     */
    public void setInvestimentoDia(double investimentoDia) {
        this.investimentoDia = investimentoDia;
    }    
}
