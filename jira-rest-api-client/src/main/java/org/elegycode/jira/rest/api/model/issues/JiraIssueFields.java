package org.elegycode.jira.rest.api.model.issues;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JiraIssueFields {
	private String summary;
	
	private String description;
	
	private JiraIssueType issuetype;
}
