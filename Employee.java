package com.mycompany.sprint2;


    import java.util.Date;

    public class Employee {

        private String nombre;
        private long id;
        private String email;
        private Profile profile;
        private Enum_RoleName role;
        private Enterprise enterprise;
        private Transaction[] transactions;
        private Date createdAt;
        private Date updatedAt;

        public Employee(String nombre,String email, Enum_RoleName role) {

            //this.id = id;
            this.email = email;
            // this.profile = profile;
            this.role = role;
            // this.enterprise = enterprise;
            // this.transactions = transactions;
            //this.createdAt = createdAt;
            this.nombre = nombre;
        }

        public String getNombre() { return nombre;}

        public void setNombre(String nombre) {this.nombre = nombre;}

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Profile getProfile() {
            return profile;
        }

        public void setProfile(Profile profile) {
            this.profile = profile;
        }

        public Enum_RoleName getRole() {
            return role;
        }

        public void setRole(Enum_RoleName role) {
            this.role = role;
        }

        public Enterprise getEnterprise() {
            return enterprise;
        }

      //  public void setEnterprise(String enterprise) {
          //  this.enterprise = enterprise;
        }

        public Transaction[] getTransactions() {
            return transactions;
        }

        public void setTransactions(Transaction[] transactions) {
            this.transactions = transactions;
        }

        public Date getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
        }

        public Date getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(Date updatedAt) {
            this.updatedAt = updatedAt;
        }


    }

