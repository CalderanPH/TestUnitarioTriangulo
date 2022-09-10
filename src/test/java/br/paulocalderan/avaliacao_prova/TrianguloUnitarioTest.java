package br.paulocalderan.avaliacao_prova;

import br.paulocalderan.avaliacao_prova.domain.Triangulo;
import br.paulocalderan.avaliacao_prova.exception.TrianguloException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrianguloUnitarioTest {
    @Test
    public void testeTrianguloEquilatero() throws TrianguloException {
        assertEquals("Triangulo Equilatero", Triangulo.calcular(3, 3, 3));
    }

    @Test
    public void testeTrianguloEscaleno() throws TrianguloException {
        assertEquals("Triangulo escaleno", Triangulo.calcular(3, 6, 9));
    }

    @Test
    public void testeTrianguloIsosceles() throws TrianguloException {
        assertEquals("Triangulo isosceles", Triangulo.calcular(3, 6, 6));
    }

    @Test
    public void testeTrianguloIsosceles0() throws TrianguloException {
        assertEquals("Não é triangulo", Triangulo.calcular(0, 0, 0));
    }

    @Test
    public void testeInstanciaTriangulo() {
        @SuppressWarnings("unused")
        Triangulo triangulo = new Triangulo();
    }

}