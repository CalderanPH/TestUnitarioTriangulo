package br.paulocalderan.avaliacao_prova;

import br.paulocalderan.avaliacao_prova.domain.Triangulo;
import br.paulocalderan.avaliacao_prova.exception.TrianguloException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TrianguloExceptionTest {

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void testValorNulo_Lado1() throws TrianguloException {
        expected.expect(TrianguloException.class);
        expected.expectMessage("Lado não preenchido");
        Triangulo.calcular(null, 3, 3);
    }

    @Test
    public void testValorNulo_Lado2() throws TrianguloException {
        expected.expect(TrianguloException.class);
        expected.expectMessage("Lado não preenchido");

        Triangulo.calcular(3, null, 3);
    }

    @Test
    public void testValorNulo_Lado3() throws TrianguloException {
        expected.expect(TrianguloException.class);
        expected.expectMessage("Lado não preenchido");

        Triangulo.calcular(3, 3, null);
    }

}