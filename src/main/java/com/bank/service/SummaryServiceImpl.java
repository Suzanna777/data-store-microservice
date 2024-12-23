package com.bank.service;

import com.bank.model.Data;
import com.bank.model.MeasurementType;
import com.bank.model.Summary;
import com.bank.model.exception.SensorNotFoundException;
import com.bank.model.SummaryType;
import com.bank.repository.SummaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class SummaryServiceImpl implements SummaryService {

    private final SummaryRepository summaryRepository;

    @Override
    public Summary get(Long sensorId, Set<MeasurementType> measurementTypes, Set<SummaryType> summaryTypes) {
            return summaryRepository.findBySensorId(
                            sensorId,
                            measurementTypes == null ? Set.of(MeasurementType.values()) : measurementTypes,
                            summaryTypes == null ? Set.of(SummaryType.values()) : summaryTypes
                    )
                    .orElseThrow(SensorNotFoundException::new);
        }

        @Override
        public void handle(Data data){
                summaryRepository.handle(data);
            }
        }

