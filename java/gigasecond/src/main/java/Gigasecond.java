import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.Month;

class Gigasecond {
    
    private static final int GIGASECOND = 1000000000;
    private static LocalDateTime gigaDateTime;

    Gigasecond(LocalDate birthDate) {
        this(birthDate.atStartOfDay());
    }

    Gigasecond(LocalDateTime birthDateTime) {
        gigaDateTime = birthDateTime.plusSeconds(GIGASECOND);
    }

    LocalDateTime getDate() {
        return gigaDateTime;
    }
}
