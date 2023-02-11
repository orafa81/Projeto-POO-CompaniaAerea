
package testepja;

public class Usuario {
    protected String login;
    protected String senha;
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void verificaLogin(String login, String senha){
       if (login.equals(senha)) {
           throw new RuntimeException("Login e senha iguais, por favor digite nomes distintos para login e senha");
        } else if (senha.length() < 6) {
            throw new RuntimeException("Digite uma senha com no mínimo 6 caracteres");
        } else {
            setLogin(login);
            setSenha(senha);
        }
    }
}
