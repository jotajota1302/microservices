package com.everis.cad.micro.functionalityA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import com.everis.cad.micro.functionalityA.domain.EntityA;
import com.everis.cad.micro.functionalityA.domain.QEntityA;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;

@Repository
public interface EntityARepository
		extends JpaRepository<EntityA, Integer>, QueryByExampleExecutor<EntityA>, QuerydslPredicateExecutor<EntityA>,
		QuerydslBinderCustomizer<QEntityA>
{

	@Override
	default void customize ( QuerydslBindings bindings, QEntityA entity )
	{
		// Configuration of the matchers and properties
		// Make case-insensitive 'like' filter for all string properties
		bindings.bind ( String.class )
				.first ( ( SingleValueBinding<StringPath, String> ) StringExpression::containsIgnoreCase );
		
		
	}

}