package at.fhtw.swen3.services.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
@Getter
@Setter
@AllArgsConstructor
public class HopArrivalDto {
    private String code;
    private String description;
    private OffsetDateTime dateTime;
}