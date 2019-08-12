package org.elegycode.jira.rest.api.model.issues;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JiraComment {
	private long id;
	
	private String description;
}
