package com.tbthecoder.whatsappmockapi.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
public class Group {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
}
