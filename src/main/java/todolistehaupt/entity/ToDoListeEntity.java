package todolistehaupt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDoListeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id=1;
    private String note="TextText";
    private String headline="Text";
    private boolean done=false;

    public ToDoListeEntity () {};

    public ToDoListeEntity (String note, String headline, boolean done)
    {
        this.note=note;
        this.headline=headline;
        this.done=done;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
