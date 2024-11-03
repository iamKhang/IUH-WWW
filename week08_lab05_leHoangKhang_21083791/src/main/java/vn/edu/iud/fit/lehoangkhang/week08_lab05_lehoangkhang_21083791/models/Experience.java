package vn.edu.iud.fit.lehoangkhang.week08_lab05_lehoangkhang_21083791.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fromDate;
    private LocalDate toDate;
    private String companyName;
    private String role;
    private String workDescription;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}