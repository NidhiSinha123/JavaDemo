package com.capg.EmpMag.dao;

import com.capg.EmpMag.dto.Project;

public interface ProjectDaoInterface {
public Project addProject(Project p);
public boolean removeProject(Project p);
public Project updateProject(int pid);
public Project showProject(Project p);
public Project showEmployee(int pid);
}
