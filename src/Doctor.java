public class Doctor {
    // Atributos
    // static nos va a permitir el auto increment si no fuera siempre seria 0 por defecto
    static int id = 0; // AutoIncrement
    String name;
    String speciality;

    //constructor

    Doctor() {
        System.out.println("Construyendoe Doctor");
        id++;
    }
    Doctor(String name){
        System.out.println("Soy el doctor " + name);
    }

    //Comportamientos

    public void showName(){
        System.out.println(name);
    }
    public  void  showId(){
        System.out.println("ID Doctor " + id);
    }

}
