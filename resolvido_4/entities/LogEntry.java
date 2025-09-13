package exercicios.resolvido_4.entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

    private String name;
    private Date moment;

    public LogEntry(String name, Date moment) {
        setName(name); setMoment(moment);
    }

    public void setName(String name) { this.name = name; }
    public void setMoment(Date moment) { this.moment = moment; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(name, logEntry.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}