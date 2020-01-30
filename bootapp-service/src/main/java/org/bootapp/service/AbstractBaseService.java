package org.bootapp.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractBaseService<T,ID> implements BaseService<T,ID> {
	
	private JpaRepository<T, ID> repo;
	
	public void setRepo(JpaRepository<T, ID> repo) {
		this.repo = repo;
	}

	@Override
	public T save(T t) {
		return repo.save(t);
	}

	@Override
	public T update(T t) {
		return repo.save(t);
	}

	@Override
	public T get(ID id) {
		return repo.getOne(id);
	}

	@Override
	public Boolean delete(T t) {
		repo.delete(t);
		return true;
	}

	@Override
	public List<T> getAll() {
		PageRequest pr = PageRequest.of(0, 10);
		repo.findAll(pr);
		return repo.findAll();
	}

}
