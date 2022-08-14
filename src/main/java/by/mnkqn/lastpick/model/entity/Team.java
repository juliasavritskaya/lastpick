package by.mnkqn.lastpick.model.entity;

import lombok.Data;

@Data
public class Team {
    private Long team_id;
    private Long rating;
    private Long wins;
    private Long losses;
    private Long last_match_time;
    private String name;
    private String tag;
}
