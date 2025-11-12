public class HRCalculator {

    public static int calculateMaxHR(int age){
    if (age < 0 || age > 120) {
        throw new IllegalArgumentException("Age out of bounds");
    }
    return 220 - age;
    }

    public static String getWorkoutZone(int age, int bpm){
        int max = calculateMaxHR(age);
        if (bpm < 0) throw new IllegalArgumentException("BPM out of bounds");

        double pct = (bpm * 100.0) / max;

        if (pct < 50.0)         return "Regular activities";
        else if (pct < 60.0)    return "Warm-up";
        else if (pct < 70.0)    return "Fat burn";
        else if (pct < 80.0)    return "Aerobic";
        else if (pct < 90.0)    return "Anaerobic";
        else if (pct <= 100.0)  return "Max";
        else                    return "PLUS ULTRA!";
    }

}
