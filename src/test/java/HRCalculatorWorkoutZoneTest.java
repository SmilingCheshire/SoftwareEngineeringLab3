import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HRCalculatorWorkoutZoneTest {

    @Test
    void zones_for_age_40_examples() {
        int age = 40;           // maxHR = 180
        assertEquals("Regular activities", HRCalculator.getWorkoutZone(age, 80));   // 44%
        assertEquals("Warm-up",   HRCalculator.getWorkoutZone(age, 100));  // 55%
        assertEquals("Fat burn",  HRCalculator.getWorkoutZone(age, 115));  // 64%
        assertEquals("Aerobic",   HRCalculator.getWorkoutZone(age, 135));  // 75%
        assertEquals("Anaerobic", HRCalculator.getWorkoutZone(age, 160));  // 89%
        assertEquals("Max",   HRCalculator.getWorkoutZone(age, 178));  // 99%
        assertEquals("PLUS ULTRA!", HRCalculator.getWorkoutZone(age, 190));  // 105%
    }

    @Test
    void invalid_bpm_throws() {
        assertThrows(IllegalArgumentException.class, () -> HRCalculator.getWorkoutZone(30, -5));
    }
}
