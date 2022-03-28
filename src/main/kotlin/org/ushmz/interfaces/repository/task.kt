package org.ushmz.interfaces.repository

import org.ushmz.domain.Task
import org.ushmz.domain.TaskRequest

interface TaskRepository {
	fun getByID(id: Int): Task
	fun getAll(): Array<Task>
	fun create(t: TaskRequest): Task
	fun update(t: Task): Task
	fun delete(id: Int): Task
}