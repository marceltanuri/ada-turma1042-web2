package br.com.mtanuri.ada.t1043.web2.projeto.users.model;

import br.com.mtanuri.ada.t1043.web2.projeto.attachments.model.Attachments;
import br.com.mtanuri.ada.t1043.web2.projeto.orders.model.Order;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    String name;
    String cpf;
    String email;
    @OneToOne
    Address address;
    @OneToMany
    List<Order> orders;
    @OneToMany
    LocalDateTime createdAt;
    @OneToOne
    Attachments profileImage;
}
