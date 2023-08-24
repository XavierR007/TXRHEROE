public class EnemigoNormal implements Enemigo{
    @Override
    public void atacar() {
        System.out.println("El enemigo normal ataca.");
    }

    @Override
    public void recibirDano() {
        System.out.println("El enemigo normal recibe daño.");
    }
}
