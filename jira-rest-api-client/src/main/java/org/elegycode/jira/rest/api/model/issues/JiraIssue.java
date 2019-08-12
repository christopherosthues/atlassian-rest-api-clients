package org.elegycode.jira.rest.api.model.issues;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JiraIssue<F extends JiraIssueFields> {
	private long id;
	private String key;

	private F fields;
}
