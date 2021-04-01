package alarmsystem;

public class Alarm {
    public boolean isAlarmStatusWarning (double suhuYangDideteksiSensorSuhu, boolean statusSensorAsap, boolean statusSensorWaterDetection){
        
        boolean statusAlarmWarning = true;
        
        if (statusSensorAsap == true && suhuYangDideteksiSensorSuhu < 55.5 && statusSensorWaterDetection == true)
            statusAlarmWarning = true;
        
            return statusAlarmWarning;
        
        }
    
}
