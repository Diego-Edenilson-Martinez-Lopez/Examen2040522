public class Masajista  extends Persona  {

    private String titulacion;
    private Integer aniosExperiencia;

    public Masajista() {
        super();
    }

    public Masajista(Integer id, String nombre, String apellidos, Integer edad, String titulacion, Integer aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    // Metodos Adstractos
    @Override
    public void concentrarse() {
        System.out.println("El masajista " + getNombre() + " Se esta Concentrando.");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista " + getNombre() + " Esta Viiajando.");
    }

    @Override
    public void realizarTarea() {
        System.out.println("El masajista " + getNombre() + " Realiza masaje.");
    }


     public void darMasaje() {
        System.out.println("El masajista " + getNombre() + "  Dando un masaje.");
    }
}