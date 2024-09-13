package com.asaf.FitGram.following;

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
@Table(name = "following")
public class Following {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int followingId;
    @ManyToOne
    @JoinColumn(name = "following")
    private Influencer following;
}
