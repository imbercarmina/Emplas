package com.pentagono.pentagono2.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnterpriseDTO {
    @Min(1)
    @Max(999)
    @NotNull
    @NotEmpty
    private Long idEnterprise;

    /*private Transaction transaction;*/

    @NotNull
    @NotEmpty
    @Size(min =3, max=50)
    private String name;


    @NotNull
    @NotEmpty
    private String nit;

    @Size(min=30)
    private String phone;

    @NotEmpty
    @Size(min=50)
    private String address;

    /*@Size(min =3, max=50)
    private Transaction transactions;*/

    @NotEmpty
    private Date createdAt;

    @NotEmpty
    private Date updatedAt;

    @NotNull
    private boolean enabled;

}
