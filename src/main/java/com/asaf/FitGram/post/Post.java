package com.asaf.FitGram.post;

import com.asaf.FitGram.influencer.Influencer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor

// Jakarta Persistence Annotations
@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postId;
    @ManyToOne
    @JoinColumn(name = "author")
    private Influencer author;
    private String title;
    private String content;
    private Timestamp dateCreated;
    private int voteCount;
}
