package io.kindler.slack.service.jira.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class JiraIssueFields {
    private String summary;
    private JiraResource status;
    private JiraResource resolution;

    private Date created;
    private Date updated;
    private Date duedate;
    private Date resolutiondate;
    private String[] labels = new String[0];

    private JiraUser creator;
    private JiraUser assignee;
    private JiraUser reporter;
}
