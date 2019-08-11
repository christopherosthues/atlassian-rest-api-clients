package org.elegycode.jira.rest.api.model.issues;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JiraIssueType {
	private long id;
	private String name;
}
