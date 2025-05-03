package com.SpringPro.SpringPro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode



    @Entity
    @Data
    @Table(name =" commande")

public class commande {
    @Id
    @Column(name = "idc")
    private  int idc ;

    @Column(name = "date")
    private  String date ;
    @Column(name = "statut")
    private  String statut;

    @Column(name = "userName")
    private  String userName;








}

