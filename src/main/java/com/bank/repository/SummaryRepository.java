package com.bank.repository;

import com.bank.model.Data;
import com.bank.model.MeasurementType;
import com.bank.model.Summary;
import com.bank.model.SummaryType;

import java.util.Optional;
import java.util.Set;

public interface SummaryRepository {
    Optional<Summary> findBySensorId(
            long sensorId,
            Set<MeasurementType> measurementTypes,
            Set<SummaryType> summaryTypes

    );
    void handle(Data data);
}
