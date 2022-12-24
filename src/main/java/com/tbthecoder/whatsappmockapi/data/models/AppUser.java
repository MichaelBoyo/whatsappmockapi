package com.tbthecoder.whatsappmockapi.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String profilePictureUrl;
    private String about;
    @OneToMany
    private List<Group> groups;
    @OneToMany
    private List<AppUser> contacts;
    private String statusTime;
    private String statusSeenBy;
}
