package com.everis.cad.micro.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MicroEntity.class)
public abstract class MicroEntity_ {

	public static volatile SingularAttribute<MicroEntity, Long> createdDate;
	public static volatile SingularAttribute<MicroEntity, String> attribute1;
	public static volatile SingularAttribute<MicroEntity, Long> modifiedDate;
	public static volatile SingularAttribute<MicroEntity, Integer> id;
	public static volatile SingularAttribute<MicroEntity, String> attribute2;

	public static final String CREATED_DATE = "createdDate";
	public static final String ATTRIBUTE1 = "attribute1";
	public static final String MODIFIED_DATE = "modifiedDate";
	public static final String ID = "id";
	public static final String ATTRIBUTE2 = "attribute2";

}

