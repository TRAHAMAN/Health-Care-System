package com.sprint.healthcaresystem.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@Entity
@Table(name = "userrecord")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Size(min = 2, max = 20)
    @NotNull(message = "Please Enter User Name!")
    private String username;
    @Size(min = 2, max = 20)

    @NotNull(message = "Please Enter Password!")
    private String password;

    @NotNull(message = "Please Enter the role")
    private String role;

}
