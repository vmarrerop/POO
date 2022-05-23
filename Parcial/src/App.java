public class App {
    public static void main(String[] args) throws Exception {
        Ecuaciones modelo;
        Controlador controlador;
        Vista vista;

        modelo = new Ecuaciones();
        vista = new Vista();
        controlador = new Controlador (modelo, vista);

        controlador.iniciar();

    }
}
