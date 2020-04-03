package com.everis.cad.micro.commons;

		import java.util.List;

public interface EntityMapper<E, M> {

	M entityToModel(E e);

	List<M> entitiesToModels(List<E> e);

	List<M> entitiesToModels(Iterable<E> e);

	E modelToEntity(M m);

	List<E> modelsToEntities(List<M> m);

	List<E> modelsToEntities(Iterable<M> m);

}
