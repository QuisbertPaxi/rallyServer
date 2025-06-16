package v1._2_DTO;

public class UsuarioDTO {

    private Long id;
    private String userName;
    private String password;
    private String email;
    private String nombre;
    private String apellidos;
    private String role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public UsuarioDTO(Long id, String userName, String email, String nombre, String apellidos, String role) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.role = role;
    }

    public UsuarioDTO(){}
}
