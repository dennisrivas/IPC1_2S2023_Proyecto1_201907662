package datos;

public class ctrlUsuarios {

    static int size = 50;
    private static Usuario[] usuarios_t = new Usuario[size]; // null
    static int contador = 0;
    static int id = 1;

    public static Usuario[] getAllUsers() {
        return usuarios_t;
    }

    public static int getSizeArray() {
        return contador;
    }

    public static boolean verificarID(String Nombre) {
        for (int i = 0; i < usuarios_t.length; i++) {

            Usuario d = usuarios_t[i];

            if (d == null) {
                continue;
            }
            if (d.getNombre()== Nombre) {
                return true;
            }
        }
        return false;
    }

    public static boolean agregarUsuario(String nombre, String apellido, String correo, String contrasena, String genero) {
        if (verificarID(nombre)) {
            System.out.println("La id ingresada ya esta siendo usada");
            return false;
        }
        Usuario nuevoUsuario = new Usuario(nombre,apellido,correo,contrasena,genero);
        usuarios_t[contador] = nuevoUsuario;
        contador++;
        id++;
        return true;
    }

    

    public static Usuario buscarUsuario(String Nombre) {
        Usuario usuarioBuscado = null;
        for (Usuario usuario : usuarios_t) {
            if (usuario.getNombre()== Nombre) {
                usuarioBuscado = usuario;
            }
        }
        return usuarioBuscado;
    }

    public static boolean eliminarUsuario(String Nombre) {
        //Usuario usuarioBuscado = null;
        for (int i = 0; i < usuarios_t.length; i++) {
            if (usuarios_t[i].getNombre()== Nombre && usuarios_t[i] != null) {
                usuarios_t[i] = usuarios_t[i + 1];
                for (int j = i + 1; j < usuarios_t.length-1; j++) {
                    usuarios_t[j] = usuarios_t[j + 1];
                }
                return true;
            }
        }
        return false;
    }

    public static boolean actualizarUsuario(String nombre, String apellido, String correo, String contrasena, String genero) {
        Usuario usuario_actualizar = new Usuario(nombre,apellido,correo,contrasena,genero);
        for (int i = 0; i < usuarios_t.length; i++) {
            if (usuarios_t[i].getNombre()== nombre) {
                usuarios_t[i] = usuario_actualizar;
                return true;
            }
        }
        return false;
    }

    public static void imprimirUsuarios() {
        for (Usuario usuario : usuarios_t) {
            if (usuario == null) {
                continue;
            }
            System.out.print(usuario.getNombre() + " " + usuario.getApellido()+ " " + usuario.getCorreo()+ " " + usuario.getGenero());
            System.out.println(" ");
        }
    }

    
}
