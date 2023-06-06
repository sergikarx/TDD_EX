public class TMoto {
    private int cilindrada;
    private int numeroRuedas;
    private int marcha;
    private int velocidadActual;

    public TMoto(int cilindrada, int numeroRuedas, int marcha, int velocidadActual) {
        setCilindrada(cilindrada);
        setNumeroRuedas(numeroRuedas);
        setMarcha(marcha);
        setVelocidadActual(velocidadActual);
    }

    public void subeMarcha() {
        if (marcha < 6) {
            marcha++;
        }
    }

    public void bajaMarcha() {
        if (marcha > 0) {
            marcha--;
        }
    }

    public void acelera(int kmh) {
        velocidadActual += kmh;
        if (velocidadActual > 230) {
            velocidadActual = 230;
        }
    }

    public void decelera(int kmh) {
        velocidadActual -= kmh;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        if (cilindrada < 49 || cilindrada > 1200) {
            throw new IllegalArgumentException("La cilindrada debe estar entre 49cc y 1200cc");
        }
        this.cilindrada = cilindrada;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        if (numeroRuedas < 2 || numeroRuedas > 4) {
            throw new IllegalArgumentException("El número de ruedas debe estar entre 2 y 4");
        }
        this.numeroRuedas = numeroRuedas;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        if (marcha < 0 || marcha > 6) {
            throw new IllegalArgumentException("La marcha debe estar entre 0 y 6");
        }
        this.marcha = marcha;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        if (velocidadActual < 0 || velocidadActual > 230) {
            throw new IllegalArgumentException("La velocidad actual debe estar entre 0 y 230 Km/h");
        }
        this.velocidadActual = velocidadActual;
    }
}

