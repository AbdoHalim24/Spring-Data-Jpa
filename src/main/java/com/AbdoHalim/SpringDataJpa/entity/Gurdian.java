package com.AbdoHalim.SpringDataJpa.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Gurdian {
    private String gurdianName;
    private  String gurdianEmail;
    private  String gurdianMobile;
}
