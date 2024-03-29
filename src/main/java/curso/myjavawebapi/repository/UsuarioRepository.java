package curso.myjavawebapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import curso.myjavawebapi.model.Usuario;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if (usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        
        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o Ide: para excluir um usuário"));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson","password"));
        usuarios.add(new Usuario("frank", "masterpass"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - RECEBENDO O ID."));
        return new Usuario("gleyson", "password");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo..."));
        return new Usuario("gleyson","password");
    }


}
