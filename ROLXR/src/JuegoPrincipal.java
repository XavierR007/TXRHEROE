public class JuegoPrincipal {
    public static void main(String[] args) {
        // Crear fábricas de personajes y enemigos
        FabricaPersonajes fabricaGuerrero = new FabricaGuerrero();
        FabricaEnemigos fabricaEnemigoNormal = new FabricaEnemigoNormal();

        // Crear personaje y enemigo
        Personaje jugador = fabricaGuerrero.crearPersonaje();
        Enemigo enemigo = fabricaEnemigoNormal.crearEnemigo();

        // Interacciones
        jugador.atacar();
        enemigo.recibirDano();
    }
}
