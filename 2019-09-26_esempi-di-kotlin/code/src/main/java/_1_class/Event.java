package _1_class;

import java.util.Date;
import java.util.Objects;

public class Event {

    private final String title;
    private final Date start;
    private final Date end;

    public Event(String title, Date start, Date end) {
        this.title = title;
        this.start = start;
        this.end = end;
    }

    public String getTitle() {
        return title;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(title, event.title) &&
                Objects.equals(start, event.start) &&
                Objects.equals(end, event.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, start, end);
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
