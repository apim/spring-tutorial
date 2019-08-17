package apim.github.tutorial;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@SuppressWarnings("rawtypes")
public class Dissertation {

	private List mentorList;
	private Set approverSet;
	private Map referenceMap;
	private Properties chapterProperties;

	public List getMentorList() {
		return mentorList;
	}

	public void setMentorList(List mentorList) {
		this.mentorList = mentorList;
	}

	public Set getApproverSet() {
		return approverSet;
	}

	public void setApproverSet(Set approverSet) {
		this.approverSet = approverSet;
	}

	public Map getReferenceMap() {
		return referenceMap;
	}

	public void setReferenceMap(Map referenceMap) {
		this.referenceMap = referenceMap;
	}

	public Properties getChapterProperties() {
		return chapterProperties;
	}

	public void setChapterProperties(Properties chapterProperties) {
		this.chapterProperties = chapterProperties;
	}
}