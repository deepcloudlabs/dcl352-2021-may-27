package com.example.scrum.repository;

import com.example.scrum.domain.Sprint;
import com.example.scrum.domain.SprintId;

public interface SprintRepository {
	public Sprint findById(SprintId id);
	public void addSprint(Sprint sprint);
}
