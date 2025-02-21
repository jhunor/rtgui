package client.academy.application.model.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import client.academy.application.model.BewegungsdatenModel;

public class BewegungsdatenModelImpl implements BewegungsdatenModel{
	
	private List<String> operatingPoints;
	private List<String> tracks;
	
	
	public BewegungsdatenModelImpl() {
		this.generateDummyData();
	}
	/**
	 * @return the operatingPoints
	 */
	public List<String> getOperatingPoints() {
		return operatingPoints;
	}
	/**
	 * @param operatingPoints the operatingPoints to set
	 */
	public void setOperatingPoints(List<String> operatingPoints) {
		this.operatingPoints = operatingPoints;
	}
	/**
	 * @return the tracks
	 */
	public List<String> getTracks() {
		return tracks;
	}
	/**
	 * @param tracks the tracks to set
	 */
	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}
	
	
	private void generateDummyData() {
		this.operatingPoints = new ArrayList<String>(Arrays.asList("A","B","C","D"));
		this.tracks = new ArrayList<String>(Arrays.asList("12","23","34"));
	}
	
	

}
