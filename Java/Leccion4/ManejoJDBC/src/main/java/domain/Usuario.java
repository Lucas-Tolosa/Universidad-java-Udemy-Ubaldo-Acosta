package domain;

public class Usuario {
    private int idUsuario;
    private String usuario;
    private String password;
    
    public Usuario(){
    }
    
    public Usuario(int id){
        this.idUsuario=id;
    }
    public Usuario(String usuario, String password){
        this.usuario=usuario;
        this.password=password;
    }
    public Usuario(int idUsuario, String usuario,String password){
        this.idUsuario=idUsuario;
        this.usuario=usuario;
        this.password=password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "idUsuario=" + idUsuario + ", usuario=" + usuario + ", password=" + password + '}';
    }
    
}
