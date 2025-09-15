package jogo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class JogoTest {

    @Test
    public void testarJogo() {

        Dado dado1 = mock(Dado.class);
        Dado dado2 = mock(Dado.class);
        Jogador jogador = mock(Jogador.class);


        when(dado1.numero()).thenReturn(2);
        when(dado2.numero()).thenReturn(3);
        when(jogador.lancar(dado1, dado2)).thenReturn(5); 

       
        Jogo jogo = new Jogo(jogador, dado1, dado2);

       
        boolean resultado = jogo.jogo();

        
        assertEquals(true, resultado);
    }
}
