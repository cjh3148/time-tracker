package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;
    entries.add(entry);    
    entries.remove(entry);

    public int size() {
        return entries.size();
    }

    public TimeEntry get(int index) {
        
        boolean valid = false;
        return entries.get(index);
    }
}
