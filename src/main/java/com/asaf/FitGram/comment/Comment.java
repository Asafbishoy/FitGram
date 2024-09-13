package com.asaf.FitGram.comment;

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
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentId;
    private String title;
    private String content;
    @ManyToOne
    @JoinColumn(name = "commenter_id")
    private Influencer commenter;
}
