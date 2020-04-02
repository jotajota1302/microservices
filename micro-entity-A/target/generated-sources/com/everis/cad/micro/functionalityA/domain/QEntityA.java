package com.everis.cad.micro.functionalityA.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEntityA is a Querydsl query type for EntityA
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEntityA extends EntityPathBase<EntityA> {

    private static final long serialVersionUID = 1251119009L;

    public static final QEntityA entityA = new QEntityA("entityA");

    public final StringPath attribute1 = createString("attribute1");

    public final StringPath attribute2 = createString("attribute2");

    public final NumberPath<Long> createdDate = createNumber("createdDate", Long.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Long> modifiedDate = createNumber("modifiedDate", Long.class);

    public QEntityA(String variable) {
        super(EntityA.class, forVariable(variable));
    }

    public QEntityA(Path<? extends EntityA> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEntityA(PathMetadata metadata) {
        super(EntityA.class, metadata);
    }

}

