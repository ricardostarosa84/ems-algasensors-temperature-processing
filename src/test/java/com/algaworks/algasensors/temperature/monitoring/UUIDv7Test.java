package com.algaworks.algasensors.temperature.monitoring;

import com.algaworks.algasensors.temperature.processing.common.IdGenerator;
import com.algaworks.algasensors.temperature.processing.common.UUIDv7Utils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

class UUIDv7Test {

    @Test
    void generateUUID(){

        UUID uuid = IdGenerator.generateTimeBaseUUID();

        OffsetDateTime ouuidDateTime =
                UUIDv7Utils.extractOffsetDateTime(uuid).truncatedTo(ChronoUnit.MINUTES);
        OffsetDateTime offsetDateTime =
                OffsetDateTime.now().truncatedTo(ChronoUnit.MINUTES);

        Assertions.assertThat(ouuidDateTime).isEqualTo(offsetDateTime);

    }
}
