public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Word");
        saludar( "David");

        Gato misifu = new Gato("Misifu", "Gato Montes");
        Gato isidoro = new Gato( "Isidoro");
        Gato sonia = new Gato("Sonia");

        System.out.println("Mi gato se llama: " + sonia.getNombre());
        System.out.println("Mi gato se llama: " + misifu.getNombre()  + " y es de la raza " + misifu.getRaza());
        System.out.println("Mi gato se llama: " + isidoro.getNombre());
        //Le cambiamos el nombre al gato Misifu
        misifu.setNombre("Bolita");
        misifu.setRaza("");
        System.out.println("Mi gato ahora se llama: " + misifu.getNombre());

    }


    public static void saludar(String nombre){
        System.out.println("Hola " + nombre);
    }



}