package de.fhl.enca.controller;

import java.util.HashSet;
import java.util.Set;
import de.fhl.enca.bl.CleaningAgent;

/**
 * @author Bobby
 * @version 31.05.2016
 * 
 * Class CleaningAgentFetcher
 * This class contains methods of operating cleaning agents
 * which are stored in memory in map CleaningAgent.cleaningAgentAll.
 */
public final class CleaningAgentFetcher {

	/**
	 * Get all cleaning agents
	 */
	public static Set<CleaningAgent> fetchCleaningAgentsAll() {
		Set<CleaningAgent> tempSet = new HashSet<CleaningAgent>();
		for (CleaningAgent cleaningAgent : CleaningAgent.getCleaningAgentAll().values()) {
			tempSet.add(cleaningAgent);
		}
		return tempSet;
	}
}