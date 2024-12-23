package com.bank.web.dto;

import com.bank.model.MeasurementType;
import com.bank.model.Summary;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class SummaryDto {
    private long sensorId;
    private Map<MeasurementType, List<Summary.SummaryEntry>> values;

}

