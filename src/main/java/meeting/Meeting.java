package meeting;

import java.time.LocalDateTime;
import java.util.UUID;

public class Meeting {

    private UUID uuid;
    private LocalDateTime start;
    private LocalDateTime end;
    private String title;
    private String description;
    private Programme programme;

    public Meeting(UUID uuid,  String title, String description, LocalDateTime start, LocalDateTime end, Programme programme)
    {
        this.uuid = uuid;
        this.start = start;
        this.end = end;
        this.title = title;
        this.description = description;
        this.programme = programme;
    }
}