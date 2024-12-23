package com.bank.service;

import com.bank.model.Data;
import com.bank.model.MeasurementType;
import com.bank.model.Summary;
import com.bank.model.SummaryType;

import java.util.Set;

public interface SummaryService {
    Summary get(
            Long sensorId,
            Set<MeasurementType> measurementTypes,
            Set<SummaryType> summaryTypes

    );
    void handle(
            Data data
    );

}
