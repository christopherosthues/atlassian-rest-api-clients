package org.elegycode.jira.rest.api.model.project;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JiraProject {
	private long id;
	private String key;
}
