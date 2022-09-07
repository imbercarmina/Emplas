package com.pentagono.pentagono.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class TransactionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long idTransactionDetail;

    @ManyToOne
    @JoinColumn(name = "id_transaction", nullable = false, foreignKey = @ForeignKey(name="fk_details_transaction"))
    private Transaction transaction;

    @ManyToOne
    @JoinColumn(name = "transaction_user", nullable = false, referencedColumnName = "idUser")
    private User user;

    @ManyToOne
    @JoinColumn(name = "transaction_enterprise", referencedColumnName = "idEnterprise")
    private Enterprise enterprise;

    @Column(name="concept",length=150,nullable = false)
    private String concept;

    @Column(name="amount",columnDefinition = "decimal(5,2)",length=30,nullable = false)
    private float amount;

    public Long getId() {
        return idTransactionDetail;
    }

    public void setId(Long id) {
        this.idTransactionDetail = id;
    }
}
