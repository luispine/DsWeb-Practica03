
package org.uv.dsweb.practica03;

/**
 *
 * @author 15-dy2xxLapDeLuis
 */

import DAO.UserDAO;
import org.uv.dsweb.practica03.Models.User;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "userBean")
@SessionScoped
public class UserBean implements Serializable {
    
    private UserDAO userDAO = new UserDAO();
    private User user = new User();
    private List<User> users;

    public List<User> getUsers() {
        if (users == null) {
            users = userDAO.listarUsuarios();
        }
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void crearUsuario() {
        userDAO.crearUsuario(user);
        users = null;
    }

    public void eliminar(User user) {
        userDAO.eliminarUsuario(user.getId());
        users = null;
    }

    public void editar(User user) {
        this.user = user;
        userDAO.actualizarUsuario(user);
    }

    /*public void actualizarUsuario() {
        userDAO.actualizarUsuario(user);
        users = null;
    }*/
}