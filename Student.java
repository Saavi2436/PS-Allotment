
package project;

import java.util.ArrayList;

public class Student extends User implements Comparable<Student> {
	private String station;
	private String branch;
	private ArrayList<String> pref = new ArrayList<String>();
	private double cg;
	private String name;
	private int id;
	private ArrayList<String> subjectsCompleted = new ArrayList<String>();
	private int roundStart = 0;
	
	public Student (String name, double cg, int id, String branch, ArrayList<String> subjectsCompleted, ArrayList<String> pref) {
		this.setName(name);
		this.id = id;
		this.cg = cg;
		this.setBranch(branch);
		this.setSubjectsCompleted(subjectsCompleted);
		this.setStation(null);
		this.pref = pref;
		students.add(this);
		studentsInRound.add(this);
	}
	
	public void accept() {
		
	}
	
	public void reject() {
		Station temp = User.stations.get(this.station);
		temp.setSeats(temp.getSeats() + 1);
		stations.put(this.station, temp);
		studentsInRound.add(this);
	}
	
	@Override
	public int compareTo(Student o) {
		if (this.getCg() > o.getCg()) {
			return -1;
		}
		
		else if (this.getCg() < o.getCg()) {
			return 1;
		}
		
		return 0;
	}

	public int getRoundStart() {
		return roundStart;
	}

	public void setRoundStart(int roundStart) {
		this.roundStart = roundStart;
	}

	public ArrayList<String> getPref() {
		return pref;
	}

	public void setPref(ArrayList<String> pref) {
		this.pref = pref;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public ArrayList<String> getSubjectsCompleted() {
		return subjectsCompleted;
	}

	public void setSubjectsCompleted(ArrayList<String> subjectsCompleted) {
		this.subjectsCompleted = subjectsCompleted;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCg() {
		return cg;
	}

	public void setCg(double cg) {
		this.cg = cg;
	}
	
}
