package com.zftlive.android.library.third.ormlite.stmt.query;

import java.sql.SQLException;
import java.util.List;

import com.zftlive.android.library.third.ormlite.db.DatabaseType;
import com.zftlive.android.library.third.ormlite.field.FieldType;
import com.zftlive.android.library.third.ormlite.stmt.ArgumentHolder;
import com.zftlive.android.library.third.ormlite.stmt.Where;

/**
 * Internal class handling the SQL 'between' query part. Used by {@link Where#between}.
 * 
 * @author graywatson
 */
public class Between extends BaseComparison {

	private Object low;
	private Object high;

	public Between(String columnName, FieldType fieldType, Object low, Object high) throws SQLException {
		super(columnName, fieldType, null, true);
		this.low = low;
		this.high = high;
	}

	@Override
	public void appendOperation(StringBuilder sb) {
		sb.append("BETWEEN ");
	}

	@Override
	public void appendValue(DatabaseType databaseType, StringBuilder sb, List<ArgumentHolder> argList)
			throws SQLException {
		if (low == null) {
			throw new IllegalArgumentException("BETWEEN low value for '" + columnName + "' is null");
		}
		if (high == null) {
			throw new IllegalArgumentException("BETWEEN high value for '" + columnName + "' is null");
		}
		appendArgOrValue(databaseType, fieldType, sb, argList, low);
		sb.append("AND ");
		appendArgOrValue(databaseType, fieldType, sb, argList, high);
	}
}
