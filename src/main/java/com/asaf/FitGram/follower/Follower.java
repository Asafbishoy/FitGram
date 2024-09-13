package com.asaf.FitGram.follower;

import com.asaf.FitGram.influencer.Influencer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

// Jakarta Persistence Annotations
@Entity
@Table(name = "follower")
public class Follower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int followerId;
    @ManyToOne
    @JoinColumn(name = "follower")
    private Influencer follower;
}
