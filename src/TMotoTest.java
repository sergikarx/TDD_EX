import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TMotoTest {
    @Test
    public void testInicializacionValoresValidos() {
        TMoto moto = new TMoto(100, 2, 0, 0);
        Assertions.assertEquals(100, moto.getCilindrada());
        Assertions.assertEquals(2, moto.getNumeroRuedas());
        Assertions.assertEquals(0, moto.getMarcha());
        Assertions.assertEquals(0, moto.getVelocidadActual());
    }

    @Test
    public void testSubeMarcha() {
        TMoto moto = new TMoto(100, 2, 3, 0);
        moto.subeMarcha();
        Assertions.assertEquals(4, moto.getMarcha());
    }

    @Test
    public void testBajaMarcha() {
        TMoto moto = new TMoto(100, 2, 3, 0);
        moto.bajaMarcha();
        Assertions.assertEquals(2, moto.getMarcha());
    }

    @Test
    public void testAcelera() {
        TMoto moto = new TMoto(100, 2, 3, 50);
        moto.acelera(30);
        Assertions.assertEquals(80, moto.getVelocidadActual());
    }

    @Test
    public void testDecelera() {
        TMoto moto = new TMoto(100, 2, 3, 50);
        moto.decelera(20);
        Assertions.assertEquals(30, moto.getVelocidadActual());
    }

    @Test
    public void testCilindradaInvalida() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new TMoto(10, 2, 0, 0));
    }

    @Test
    public void testNumeroRuedasInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new TMoto(100, 5, 0, 0));
    }

    @Test
    public void testMarchaInvalida() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new TMoto(100, 2, 7, 0));
    }

    @Test
    public void testVelocidadActualInvalida() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new TMoto(100, 2, 0, 250));
    }
}