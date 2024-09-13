package com.asaf.FitGram.workout;

import com.asaf.FitGram.day.Day;
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
@Table(name = "workout")
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int workoutId;
    @ManyToOne
    @JoinColumn(name = "day")
    private Day day;
    private String workoutName;
    private String description;
    private int set;
    private int reps;
}
