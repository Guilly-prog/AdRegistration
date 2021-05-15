package entities;

import java.util.ArrayList;

/**
 *
 * @author Guilherme Lopes
 */
public class Dados {

    ArrayList<Anuncio> anuncios = new ArrayList();
    
    /*
     * Método para cadastrar um anúncio 
     */
    public void cadastraAnuncio(Anuncio anuncio) {
        anuncios.add(anuncio);
    }

    /*
     * Método para verificar quantos anúncios há na lista
     */
    public String numeroDeAnuncios() {
        return Integer.toString(anuncios.size());
    }    
}
