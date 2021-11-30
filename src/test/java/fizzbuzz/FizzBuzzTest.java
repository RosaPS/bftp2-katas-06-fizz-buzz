package fizzbuzz;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest {

    // instanciando (creando un objeto que representa el juego)
    JuegoFizzBuzz juego = new JuegoFizzBuzz();

    @Test
    public void laPrimeraRespuestaEs1() {

        String respuesta = juego.responder(1);
        assertThat(respuesta, equalTo("1"));
    }

    @Test
    void laRespuestaA2Es2() {
        String respuesta = juego.responder(2);
        assertThat(respuesta, equalTo("2"));
    }

    @Test
    void laRespuestaA3EsFizz(){
        String respuesta = juego.responder(3);
        assertThat(respuesta, equalTo("Fizz"));
    }
    @Test
    void laRespuestaA4Es4(){
        String respuesta = juego.responder(4);
        assertThat(respuesta, equalTo("4"));
    }

    @Test
    void laRepuestaA5EsBuzz(){
        String respuesta = juego.responder(5);
        assertThat(respuesta, equalTo("Buzz"));
    }

    @Test
    void laREspuestaA5yA3esFizzBuzz(){
        String respuesta = juego.responder(15);
        assertThat(respuesta, equalTo("FizzBuzz"));
    }
    @Test
    void laRespuestaA66EsFizz(){
        String respuesta = juego.responder(66);
        assertThat(respuesta, equalTo("Fizz"));
    }

    @Test
    void laRespuestaEstaEntre1y100(){
        String respuesta = juego.responder(101);
        assertThat(respuesta, equalTo("El número es mayor del permitido"));
    }
}
