package com.asaf.FitGram.meal;

import com.asaf.FitGram.day.Day;
import com.asaf.FitGram.influencer.Influencer;
import com.asaf.FitGram.macros.Macros;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Data
@NoArgsConstructor
@AllArgsConstructor

// Jakarta Persistence Annotations
@Entity
@Table(name = "meal")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mealId;
    @ManyToOne
    @JoinColumn(name = "day")
    private Day day;
    private String mealName;
    private int quantity;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Timing timing;
    private String unit;
    @OneToOne
    @JoinColumn(name="macros")
    private Macros macros;
    public enum Timing {
        BREAKFAST, LUNCH, DINNER
    }
}
