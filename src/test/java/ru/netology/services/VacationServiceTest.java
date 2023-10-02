package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services.VacationService;

public class VacationServiceTest {
    @Test

    public void shouldCalculate() {
        VacationService service = new VacationService();

        int expected = 1;
        int actual = service.calculate(70_000, 50_000, 200_000);
        Assertions.assertEquals(expected, actual);
    }
}
