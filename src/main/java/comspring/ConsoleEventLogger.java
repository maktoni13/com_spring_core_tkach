package comspring;

import lombok.*;

@NoArgsConstructor
public class ConsoleEventLogger {
    public void logEvent(String msg){
        System.out.println(msg);
    }
}
