package meeting;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.UUID;
import meeting.Meeting;
import meeting.Programme;
import meeting.ProgramSlot;

import java.util.*;

public class MeetingTest {

    @Test
    public void testThatValidMeetingsCanBeInstantiated() {
        ProgramSlot[] programSlots = new ProgramSlot[2];

        ProgramSlot programSlot1 = new ProgramSlot(
            new GregorianCalendar(2017, Calendar.DECEMBER, 15, 19, 00, 00).getTime(),
            new GregorianCalendar(2017, Calendar.DECEMBER, 15, 20, 00, 00).getTime(),
            "Divergence",
            "Main room"
        );
        programSlots[0] = programSlot1;

        ProgramSlot programSlot2 = new ProgramSlot(
                new GregorianCalendar(2017, Calendar.DECEMBER, 15, 20, 00, 00).getTime(),
                new GregorianCalendar(2017, Calendar.DECEMBER, 15, 21, 00, 00).getTime(),
                "Convergence",
                "Main room"
        );
        programSlots[1] = programSlot2;

        Meeting meeting = new Meeting(
            UUID.randomUUID(),
            "(Di|con)vergent mob refactoring",
            "This is a silly workshop, don't come",
            new GregorianCalendar(2017, Calendar.DECEMBER, 15, 19, 00, 00).getTime(),
            new GregorianCalendar(2017, Calendar.DECEMBER, 15, 21, 00, 00).getTime(),
            new Programme(programSlots)
        );

        assertTrue(meeting instanceof Meeting);
    }
}