package domain;

/**
 *
 * @author Grupo 2
 */
public class Usuarios {

    private int id;
    private String usuario;
    private String contraseña;
    private String puesto;
    private String codigo_autorización;

    public Usuarios(int id, String usuario, String contraseña, String puesto) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.puesto = puesto;
    }
    
    public Usuarios(String codigo_autorización) {
        this.codigo_autorización = codigo_autorización;
    }
     public Usuarios() {
    }
     
     //--------------getters y setters-----------//

    public String getCodigo_autorización() {
        return codigo_autorización;
    }

    public void setCodigo_autorización(String codigo_autorización) {
        this.codigo_autorización = codigo_autorización;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
