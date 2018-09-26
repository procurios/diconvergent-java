package meeting;

import java.util.Date;
import java.util.UUID;

public class Meeting {

    private UUID uuid;
    private Date start;
    private Date end;
    private String title;
    private String description;
    private Programme programme;

    public Meeting(UUID uuid,  String title, String description, Date start, Date end, Programme programme)
    {
        this.uuid = uuid;
        this.start = start;
        this.end = end;
        this.title = title;
        this.description = description;
        this.programme = programme;
    }
}