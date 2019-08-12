package org.elegycode.jira.rest.api.client;

import java.util.List;

import org.elegycode.jira.rest.api.model.issues.JiraComment;
import org.elegycode.jira.rest.api.model.issues.JiraIssue;
import org.elegycode.jira.rest.api.model.issues.JiraIssueFields;

public interface JiraRestApiRequest<JIF extends JiraIssueFields> {
	@RequestLine("GET /rest/api/2/?search=jql={jql}")
	List<JiraIssue<JIF>> sendRequestForIssues(@Param("jql") String jql);
	
	@RequestLine("PUT /rest/api/2/issue/{issueId}")
	void sendRequestUpdateIssue(@Param("issueId") long issueId, JiraIssue<JIF> issue);
	
	@RequestLine("POST /rest/api/2/issues")
	void sendRequestCreateIssue(JiraIssue<JIF> issue);
	
	@RequestLine("POST /rest/api/2/issue/{issueId}/comments")
	void sendRequestAddComment(@Param(issueId) long issueId, JiraComment comment);
}
