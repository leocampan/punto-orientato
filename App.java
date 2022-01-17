public class App {
    public static void main(String[] args) throws Exception {
        PuntoOrientato po1 = new PuntoOrientato(3.5, 4.0, 'A');
        PuntoOrientato po2 = new PuntoOrientato(8.2, 3.5, 'B');

        System.out.println(po1.equals(po2));
        System.out.println(po1.distanza(po2));

        System.out.println(po1);
        System.out.println(po2);

    }
}
