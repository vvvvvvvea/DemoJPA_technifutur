package be.technifutur.poupier.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "shippers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Shipper {

    @Id
    @Column(name = "shipper_id")
    private long id;

    @Column(name = "company_name")
    private String companyName;

    private String phone;

    @OneToMany(mappedBy = "shipVia")
    private Set<Order> orders;

}
