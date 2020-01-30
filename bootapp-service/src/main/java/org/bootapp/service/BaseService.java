package org.bootapp.service;

import java.util.List;

public interface BaseService<T,ID> {
	T save(T t);
	T update(T t);
	T get(ID id);
	Boolean delete(T t);
	List<T> getAll();
}
