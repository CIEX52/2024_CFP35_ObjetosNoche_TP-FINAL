package cfp35.objetosnoche.tpfinal.tickersec.entities;

import cfp35.objetosnoche.tpfinal.tickersec.enums.User_roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private User_roles role;

    @Override
    public String toString() {
        return "id: "+this.id+" | Nombre y Apellido: "+this.name+" "+this.surname+" | Email: "+this.email+" | Rol: "+this.role;
    }
}

