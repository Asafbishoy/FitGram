package com.asaf.FitGram.influencer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor

// Jakarta Persistence Annotations
@Entity
@Table(name = "influencer")
public class Influencer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "UUID")
    private UUID influencerId;
    private String firstName;
    private String lastName;
    private String bio;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserType userType;
    private String userName;
    private String password;
    private String email;


    public enum UserType {
        ADMIN, USER
    }
}


