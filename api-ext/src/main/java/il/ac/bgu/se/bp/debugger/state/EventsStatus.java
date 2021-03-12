package il.ac.bgu.se.bp.debugger.state;

import java.util.*;

public class EventsStatus {
    private List<EventInfo> wait;
    private List<EventInfo> blocked;
    private Set<EventInfo> requested;

    public EventsStatus() {
        this.wait = new ArrayList<>();
        this.blocked = new ArrayList<>();
        this.requested = new HashSet<>();
    }

    public EventsStatus(List<EventInfo> wait, List<EventInfo> blocked, Set<EventInfo> requested) {
        this.wait = wait;
        this.blocked = blocked;
        this.requested = requested;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventsStatus that = (EventsStatus) o;
        return wait.containsAll(that.wait) && that.wait.containsAll(wait) &&
                blocked.containsAll(that.blocked) && that.blocked.containsAll(blocked) &&
                requested.equals(that.requested);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wait, blocked, requested);
    }

    @Override
    public String toString() {
        return "EventsStatus{" +
                "wait=" + wait +
                ", blocked=" + blocked +
                ", requested=" + requested +
                '}';
    }
}
