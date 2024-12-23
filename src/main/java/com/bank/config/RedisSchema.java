package com.bank.config;

import com.bank.model.MeasurementType;

public class RedisSchema {
    public static String sensorKeys() {
        return KeyHelper.getKey("sensors");
    }


    public static String summaryKey(
            long sensorId,
            MeasurementType measurementType
    ) {
        return KeyHelper.getKey("sensors:" + sensorId + ":" + measurementType.name().toLowerCase());
    }

}
