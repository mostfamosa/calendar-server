package calendar.entities.DTO;

import calendar.entities.*;
import calendar.entities.enums.*;

public class RoleDTO {

    private Long id;

    private UserDTO user;

    private StatusType statusType;

    private RoleType roleType;

    private boolean isShownInMyCalendar;

    public RoleDTO() {
    }

    public RoleDTO(Role role) {
        this.id = role.getId();
        this.user = new UserDTO(role.getUser());
        this.statusType = role.getStatusType();
        this.roleType = role.getRoleType();
        this.isShownInMyCalendar = role.isShownInMyCalendar();
    }

    public Long getId() {
        return id;
    }


    public UserDTO getUser() {
        return user;
    }

    public StatusType getStatusType() {
        return statusType;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public boolean isShownInMyCalendar() {
        return isShownInMyCalendar;
    }

    @Override
    public String toString() {
        return "RoleDTO{" +
                "id=" + id +
                ", user=" + user +
                ", statusType=" + statusType +
                ", roleType=" + roleType +
                '}';
    }
}
