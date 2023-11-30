package com.bilgedam.personnel.management.sys.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "tb_personnel")
@Getter
@Setter
public class Personnel {

    @Id // to set primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    @CreatedDate
    private LocalDate joinDate;

    @OneToMany(mappedBy = "personnel" , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Rank> rankList;


}
