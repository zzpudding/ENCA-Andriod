package de.fhl.enca.dao;

public final class SQLAmender {

	public static void writeMemo(int cleaningAgentID, String memo) {
		Connector.executeNonSelect("update CleaningAgents set memo='" + memo + "' where cleaningAgentID=" + cleaningAgentID);
	}

	public static void createTCRelation(int cleaningAgentID, int tagID) {
		Connector.executeNonSelect("insert into TC values (" + cleaningAgentID + "," + tagID + ")");
	}

	public static void removeTCRelation(int cleaningAgentID, int tagID) {
		Connector.executeNonSelect("delete from TC where cleaningAgentID=" + cleaningAgentID + " and tagID=" + tagID);
	}
}