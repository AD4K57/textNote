package com.mao.textNote.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "text")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TextEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 6903046535298443744L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userName", nullable = false)
    private String userName;

    @Column(name = "text", nullable = false)
    private String text;

}
