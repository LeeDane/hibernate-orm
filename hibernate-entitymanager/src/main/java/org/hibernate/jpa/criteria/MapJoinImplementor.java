/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2010, 2012 Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.hibernate.jpa.criteria;

import javax.persistence.criteria.Expression;
import javax.persistence.criteria.MapJoin;
import javax.persistence.criteria.Predicate;

/**
 * Specialization of {@link JoinImplementor} for {@link java.util.Map} typed attribute joins
 *
 * @author Steve Ebersole
 */
public interface MapJoinImplementor<Z,K,V> extends JoinImplementor<Z,V>, MapJoin<Z,K,V> {
	@Override
	public MapJoinImplementor<Z,K,V> correlateTo(CriteriaSubqueryImpl subquery);

	@Override
	public MapJoinImplementor<Z, K, V> on(Expression<Boolean> restriction);

	@Override
	public MapJoinImplementor<Z, K, V> on(Predicate... restrictions);

	@Override
	public <T extends V> MapJoinImplementor<Z, K, T> treatAs(Class<T> treatAsType);
}
