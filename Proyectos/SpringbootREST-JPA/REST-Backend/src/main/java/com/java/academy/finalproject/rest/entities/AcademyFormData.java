package com.java.academy.finalproject.rest.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "AcademyFormData")
@Table(name = "academyMember")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AcademyFormData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_academyMember")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private Long phone;

    @Column(name = "state_city")
    private String stateCity;

    @Column(name = "github_url")
    private String githubUrl;

    @Column(name = "career")
    private String career;

    @Column(name = "role")
    private String role;

    @Column(name = "role_other")
    private String roleOther;

    @Column(name = "skills")
    private String skills;

    @Column(name = "english_level")
    private Integer englishLevel;

    @Column(name = "other_languages")
    private String otherLanguages;

}
