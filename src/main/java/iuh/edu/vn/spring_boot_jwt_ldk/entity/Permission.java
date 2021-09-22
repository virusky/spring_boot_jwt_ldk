package iuh.edu.vn.spring_boot_jwt_ldk.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_permission")
@Getter
@Setter
public class Permission extends iuh.edu.vn.spring_boot_jwt_ldk.entity.BaseEntity {

    private String permissionName;

    private String permissionKey;

}