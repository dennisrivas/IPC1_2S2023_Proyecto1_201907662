package datos;

public class Usuario {
    
    private String apellido;
    private String nombre;
    private String correo;
    private String contrasena;
    private String genero;

    public Usuario(String nombre, String apellido, String correo, String contrasena, String genero) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.genero = genero;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    

}
