package com.pentagono.pentagono.dto;/*jessica 1 sept*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EnterpriseDTO {

    private Long idEnterprise;

    private String name;

    private String nit;

    private String phone;

    private String address;

    private Date createdAt;

    private Date updatedAt;

    private boolean enabled;

}
